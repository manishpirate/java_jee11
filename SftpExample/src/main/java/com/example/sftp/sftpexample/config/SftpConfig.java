package com.example.sftp.sftpexample.config;

import org.apache.sshd.client.session.SessionFactory;
import org.apache.sshd.sftp.client.SftpClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.expression.common.LiteralExpression;
import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.file.FileNameGenerator;
import org.springframework.integration.file.remote.session.CachingSessionFactory;
import org.springframework.integration.sftp.outbound.SftpMessageHandler;
import org.springframework.integration.sftp.session.DefaultSftpSessionFactory;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHandler;

import java.io.File;

@Configuration
public class SftpConfig {
    @Value("${sftp.host}")
    private String sftpHost;

    @Value("${sftp.port:22}")
    private int sftpPort;

    @Value("${sftp.user}")
    private String sftpUser;

    @Value("${sftp.password:#{null}}")
    private String sftpPasword;

    @Value("${sftp.remote.directory:/}")
    private String sftpRemoteDirectory;

    @Bean
    public CachingSessionFactory<SftpClient.DirEntry> sftpSessionFactory() {
        DefaultSftpSessionFactory factory = new DefaultSftpSessionFactory(true);
        factory.setHost(sftpHost);
        factory.setPort(sftpPort);
        factory.setUser(sftpUser);
        factory.setPassword(sftpPasword);
        factory.setAllowUnknownKeys(true);
        return new CachingSessionFactory<SftpClient.DirEntry>(factory);
    }

    @Bean
    @ServiceActivator(inputChannel = "toSftpChannel")
    public MessageHandler handler() {
        SftpMessageHandler handler = new SftpMessageHandler(sftpSessionFactory());
        handler.setRemoteDirectoryExpression(new LiteralExpression(sftpRemoteDirectory));
        handler.setFileNameGenerator(new FileNameGenerator() {
            @Override
            public String generateFileName(Message<?> message) {
                if (message.getPayload() instanceof File) {
                    return ((File) message.getPayload()).getName() ;
                } else {
                    throw new IllegalArgumentException("File expected as payload.");
                }
            }
        });
        return handler;
    }

    @MessagingGateway
    public interface UploadGateway {
        @Gateway(requestChannel = "toSftpChannel")
        void upload(File file);
    }

    @Bean
    public MessageChannel toSftpChannel() {
        return new DirectChannel();
    }
}

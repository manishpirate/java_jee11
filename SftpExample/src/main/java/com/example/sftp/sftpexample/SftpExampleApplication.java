package com.example.sftp.sftpexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.integration.annotation.IntegrationComponentScan;
import org.springframework.integration.config.EnableIntegration;

@SpringBootApplication
@IntegrationComponentScan
@EnableIntegration
public class SftpExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SftpExampleApplication.class, args);
	}

}

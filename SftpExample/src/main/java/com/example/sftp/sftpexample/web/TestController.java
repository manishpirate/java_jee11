package com.example.sftp.sftpexample.web;

import com.example.sftp.sftpexample.config.SftpConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    SftpConfig.UploadGateway gateway;

    @GetMapping
    public String getData(){
        gateway.upload(new File("/home/manish/local_data/test.txt"));
        return "File Upload request sent";
    }


}

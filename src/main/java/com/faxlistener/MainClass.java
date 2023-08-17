package com.faxlistener;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainClass {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(MainClass.class, args);
    }

}

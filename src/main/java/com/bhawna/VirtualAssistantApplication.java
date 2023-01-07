package com.bhawna;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@EnableAutoConfiguration
@Configuration
@ComponentScan
public class VirtualAssistantApplication
{
    public static void  main(String[] args)
    {
        SpringApplication.run(VirtualAssistantApplication.class, args);
        
    }
}
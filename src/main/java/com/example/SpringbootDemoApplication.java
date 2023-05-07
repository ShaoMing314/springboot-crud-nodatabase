package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootDemoApplication {

    public static void main(String[] args) {
        ApplicationContext ac = SpringApplication.run(SpringbootDemoApplication.class, args);
    }
//    @Bean
//    public CharacterEncodingFilter characterEncodingFilter() {
//        CharacterEncodingFilter filter = new CharacterEncodingFilter("ISO-8859-1");
//        return filter;
//    }

//    @Bean
//    public StringHttpMessageConverter stringHttpMessageConverter() {
//        StringHttpMessageConverter converter = new StringHttpMessageConverter(StandardCharsets.ISO_8859_1);
//        converter.setWriteAcceptCharset(false);
//        return converter;
//    }
}
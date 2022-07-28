package com.example.demo.beans;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
public class User {
    @Value("${user.id}")
    private String id;
    @Value("${user.password}")
    private String password;
}

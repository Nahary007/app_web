package com.openclassrooms.webapp;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "com.openclassrooms.webapp")
@Data
public class CustomProperties {

    private String apiUrl;

}

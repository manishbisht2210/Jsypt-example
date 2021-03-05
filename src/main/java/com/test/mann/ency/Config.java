package com.test.mann.ency;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("test.prop")
@Data
public class Config {

    private String pass;
    private String pass1;
    private String name;
    private String test1;
    private String test2;
}

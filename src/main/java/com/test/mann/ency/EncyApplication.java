package com.test.mann.ency;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableEncryptableProperties
@EnableConfigurationProperties(Config.class)
public class EncyApplication {

	public static void main(String[] args) {
		SpringApplication.run(EncyApplication.class, args);
	}

}

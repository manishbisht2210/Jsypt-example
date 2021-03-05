package com.test.mann.ency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class TestComponent implements ApplicationRunner {

    @Autowired
    private Config config;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        System.out.println("ApplicationRunnerImpl Called");
        System.out.println(config.getName());
        System.out.println(config.getTest1());
        System.out.println(config.getTest2());
        System.out.println(config.getPass());
        System.out.println(config.getPass1());
    }
}
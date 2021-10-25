package com.thomaskasene.springboot.prometheus;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class AppStarter {
    public static void main(String[] args) {
        new SpringApplicationBuilder()
                .sources(AppStarter.class)
                .properties("management.endpoints.web.exposure.include=prometheus")
                .run(args);
    }
}

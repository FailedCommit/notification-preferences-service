package com.manning.notification.preferences;

import com.manning.notification.preferences.Util.H2ServerStarter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@EntityScan(basePackages = {"com.manning.notification.preferences.entities"})
@SpringBootApplication
public class NotificationPreferencesServiceApplication {

    public static void main(String[] args) {
        H2ServerStarter.startH2Server();
        SpringApplication.run(NotificationPreferencesServiceApplication.class, args);
    }
}

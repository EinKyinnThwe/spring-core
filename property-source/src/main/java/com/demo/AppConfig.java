package com.demo;

import com.ocpsoft.pretty.time.PrettyTime;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:/application.properties")
@ComponentScan
@Configuration
public class AppConfig {
    @Bean
    public PrettyTime prettyTime() {
        return new PrettyTime();
    }
}

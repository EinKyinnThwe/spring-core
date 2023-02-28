package com.demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan
@Configuration
public class AppConfig {
    /*  @Bean @Autowired
    public Person person(Address address){
        Person person=new Person();
        person.setAdd(address);
        return person;
    }
    @Bean
    public Address address(){
        return new Address();
    }*/
}

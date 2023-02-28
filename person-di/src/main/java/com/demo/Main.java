package com.demo;

import com.demo.beans.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        Person person = context.getBean(Person.class);
        System.out.println(person.personInfo());
        context.close();
    }
}

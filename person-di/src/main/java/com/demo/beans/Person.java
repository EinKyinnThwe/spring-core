package com.demo.beans;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Person {
    private String name = "Thaw Thaw";

    private final Address add;

    @PostConstruct
    public void init() {
        System.out.println("PostConstruct:Address::" + add.getClass().getSimpleName());
    }

    public Person(Address add) {
        this.add = add;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAdd() {
        return add;
    }

    public String personInfo() {
        return name + "::" + add.getStreetName();
    }
}

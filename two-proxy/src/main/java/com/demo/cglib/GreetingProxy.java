package com.demo.cglib;

public class GreetingProxy extends MyGreeting{
    public String greet(String name) {
        return super.greet(name) + "\n" + "Hey Mate! How're you doing now !";
    }
}

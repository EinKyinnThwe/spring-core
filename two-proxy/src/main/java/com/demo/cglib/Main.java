package com.demo.cglib;

public class Main {
    public static void main(String[] args) {
        GreetingProxy greetingProxy =
                new GreetingProxy();
        System.out.println(greetingProxy.greet("John"));
    }
}

package com.demo.beans;

import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Component
public class SpringBean3 implements Ordered, MyInterface {
    public SpringBean3() {
        //System.out.println("SpringBean3");
    }
    @Override
    public int getOrder() {
        return 1;
    }
    public String toString() {
        return "SpringBean3";
    }
}

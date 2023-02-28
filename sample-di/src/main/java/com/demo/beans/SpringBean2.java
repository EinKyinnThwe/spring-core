package com.demo.beans;

import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Component
public class SpringBean2 implements Ordered, MyInterface {
    public SpringBean2() {
        System.out.println("springBean2");
    }
    @Override
    public int getOrder() {
        return 2;
    }
}

package com.demo.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class SpringBean1 {
    @Value("${app.name}")
    public String name;

    @Value("#{ ${invoice.amount} * 0.2 }")
    private double invoiceDiscount;

    @Value("#{'Creek Bridge Road'.toUpperCase()}")
    private String streetName;
    @Value("#{bean2.hobby}")
    private String hobbyName;
    @Value("${app.fruits}")
    private List<String> fruits;
    @Value("#{${app.map}}")
    private Map<String,Integer> map;

    public String getStreetName() {
        return streetName;
    }

    public void print() {
        System.out.println("Name:" + name);
        System.out.println("DiscountInvoice:" + invoiceDiscount);
        System.out.println("StreetName:" + streetName);
        System.out.println("Hobby Name:" + hobbyName);
        fruits.forEach(s -> {
            System.out.println(s.toUpperCase());
        });
        System.out.println(map);
    }
}

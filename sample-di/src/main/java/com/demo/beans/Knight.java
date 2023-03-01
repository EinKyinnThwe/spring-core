package com.demo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class Knight {
    private MyClass myClass;
    @Autowired
    private Quest dimsel;

    public Knight(Optional<MyClass> myClass, Quest dimsel) {
        //this.myClass = myClass;
        this.dimsel = dimsel;
    }

    public void setDimsel(Quest quest) {
        this.dimsel = quest;
    }

    public String goQuest() {
        return dimsel.goQuest();
    }
    @Autowired
    public void setSpringBean(List<MyInterface> list) {
        for (MyInterface obj:list) {
            System.out.println(obj);
        }
    }
}

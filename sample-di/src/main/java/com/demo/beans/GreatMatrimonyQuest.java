package com.demo.beans;

import org.springframework.stereotype.Component;

@Component("matrimony") //@QuestType(type = QuestType.Type.Matrimony)
public class GreatMatrimonyQuest implements Quest{
    @Override
    public String goQuest() {
        return "Knight and princess performs the great matrimony.";
    }
}

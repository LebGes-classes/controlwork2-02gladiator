package com.controlwork;

import java.util.Random;

public class LabWork {
    Random random = new Random();
    public int makeProgramming(String university){
        int mark = 0;
        if (university.equals("ИТИС")){
            mark = random.nextInt(4,6);

        }
        if (university.equals("ИВМиИТ")){
            mark = random.nextInt(3,5);
        }
        return mark;
    }
    public int makeElecEngineering(String university){
        int mark = 0;
        if (university.equals("ИТИС")){
            mark = random.nextInt(3,5);
        }
        if (university.equals("ИВМиИТ")){
            mark = random.nextInt(4,6);
        }
        
        return mark;
    }


}

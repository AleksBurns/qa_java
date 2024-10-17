package com.example;

import java.util.List;

public class AleksLion extends Lion{

    public AleksLion(Feline feline) throws Exception {
        super("Самец", feline);
    }

    public List<String> getFriends(){
        return List.of("Марти", "Глория", "Мелман");
    }

    public String getPlaceOfLiving(){
        return "Нью-Йоркский зоопарк";
    }

    @Override
    public int getKittens(){
        return 0;
    }

}

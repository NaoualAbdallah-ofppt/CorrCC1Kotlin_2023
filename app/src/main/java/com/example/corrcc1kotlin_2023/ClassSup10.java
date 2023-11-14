package com.example.corrcc1kotlin_2023;

import java.util.ArrayList;

public class ClassSup10 {
    public ArrayList<Integer> sup10 (ArrayList<Integer> lst){
        ArrayList<Integer> lstNew=new ArrayList<Integer>();
        for (int nbr : lst){
            if (nbr>10){
                lstNew.add(nbr);
            }

        }
        return  lstNew;
    }
}

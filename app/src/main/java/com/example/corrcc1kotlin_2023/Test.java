package com.example.corrcc1kotlin_2023;

import java.util.ArrayList;

public class Test {

public static  void main(String[] args) {
    Module m1 = new Module("M1", "Android");
    Module m2 = new Module("M2", "Kotlin");
    Module m3 = new Module("M3", "Swift");
    Module m4 = new Module("M4", "Dart");
    Module m5 = new Module("M5", "Interfaces graphiques");
    Filiere F = new Filiere();
    F.create(m1);
    F.create(m2);
    F.create(m3);
    F.create(m4);
    F.create(m5);
    for (Module M : F.findAll()) {
        System.out.println(M);
    }
    F.delete(m2);
    m5.setIntitule("newIntitule");
    F.update(m5);

}


}

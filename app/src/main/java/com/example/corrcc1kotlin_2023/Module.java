package com.example.corrcc1kotlin_2023;

public class Module {
    private static  int nbrModules=0;
    private  int id;
    private String code;
    private  String intitule;

    public Module(String code, String intitule) {
        this.code = code;
        this.intitule = intitule;
        nbrModules++;
        id=nbrModules;
    }
    public int getId() {
        return id;
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", code='" + code + '\'' +
                ", intitule='" + intitule + '\''
                ;
    }
}

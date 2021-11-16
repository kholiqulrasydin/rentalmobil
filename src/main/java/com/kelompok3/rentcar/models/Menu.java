package com.kelompok3.rentcar.models;

public class Menu {
    final int id;
    final String name;
    final Class<?> mainClass;
    public Menu(int id, String name, Class<?> mainClass){
        this.id = id;
        this.name = name;
        this.mainClass = mainClass;
    }

    public Integer getId(){
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Class<?> getmainClass() {
        return this.mainClass;
    }
}

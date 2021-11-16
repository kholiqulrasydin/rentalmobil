package com.kelompok3.rentcar.models;

public class User {
    int id;
    String nama;
    String username;
    String password;
    int type;

    public User(int id, String nama, String username, String password, int type) {
        this.id = id;
        this.nama = nama;
        this.username = username;
        this.password = password;
        this.type = type;
    }

    public User() {
    }

    public int id(){
        return this.id;
    }
    public String nama(){
        return this.nama;
    }
    public String username(){
        return this.username;
    }
    public String password(){
        return this.password;
    }
    public int type(){
        return this.type;
    }
}

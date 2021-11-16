package com.kelompok3.rentcar.models;

public class Kelompok {
    final String nama;
    final String nim;

    public Kelompok(String nama, String nim){
        this.nama = nama;
        this.nim = nim;
    }

    public String getNama(){
        return this.nama;
    }

    public String getNim(){
        return this.nim;
    }
}

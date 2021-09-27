/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kelompok3.rentcar.models;


/**
 *
 * @author kholiqul
 */
public class Mobil {
    final int id;
    final String merek;
    final String tipe;
    final int tahun;
    final String status;
    final String nopol;
    final int harga;

    public Mobil(int id, String merek, String tipe, int tahun, String status, String nopol, int harga) {
        this.id = id;
        this.merek = merek;
        this.tipe = tipe;
        this.tahun = tahun;
        this.status = status;
        this.nopol = nopol;
        this.harga = harga;
    }
    
    public int id(){
        return this.id;
    }
    
    public String merek(){
        return this.merek;
    }
    
    public String tipe(){
        return this.tipe;
    }
    
    public int tahun(){
        return this.tahun;
    }
    
    public String status(){
        return this.status;
    }
    
    public String nopol(){
        return this.nopol;
    }
    
    public int harga(){
        return this.harga;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kelompok3.rentcar;
import com.kelompok3.rentcar.models.Mobil;
import com.kelompok3.rentcar.providers.MobilProvider;


/**
 *
 * @author kholiqul
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mobil mobil = MobilProvider.getDataMobilById(1).get(0);
        System.out.println("id : "+ mobil.id());
        System.out.println("merek : "+ mobil.merek());
        System.out.println("tipe : "+ mobil.tipe());
        System.out.println("tahun : "+ mobil.tahun());
        System.out.println("harga sewa: "+ mobil.harga());


    }
    
}

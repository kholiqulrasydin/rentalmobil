/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kelompok3.rentcar;
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
        System.out.println("id : "+ MobilProvider.getDataMobilById(2).get(0).id());
        System.out.println("merek : "+ MobilProvider.getDataMobilById(2).get(0).merek());
        System.out.println("tipe : "+ MobilProvider.getDataMobilById(2).get(0).tipe());
        System.out.println("tahun : "+ MobilProvider.getDataMobilById(2).get(0).tahun());
        System.out.println("nopol : "+ MobilProvider.getDataMobilById(2).get(0).nopol());
    }
    
}

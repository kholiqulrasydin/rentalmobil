/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kelompok3.rentcar.services;

import java.util.List;
import java.util.Scanner;

import com.kelompok3.rentcar.models.Kelompok;
import com.kelompok3.rentcar.models.Menu;
import com.kelompok3.rentcar.providers.KelompokProvider;
import com.kelompok3.rentcar.providers.MenuProvider;
import com.kelompok3.rentcar.services.misc.Print;

/**
 *
 * @author kholiqul
 */
public class Welcome {

    public static void mainRun(){
        Scanner scanner = new Scanner(System.in);
        new Welcome().introduction();
        new Print("Silahkan Pilih Menu Aplikasi : ").nextLine();
        new Print("").nextLine();
        new Welcome().showMenu();
        new Print("").nextLine();
        new Print("Masukkan Salah Satu Angka Pada Menu : ").line();
        int menuSelected = scanner.nextInt();
        // Boolean test = menuSelected > new MenuProvider().getMenu().size()-1;
        // new Print(test.toString()).nextLine();
        while( (menuSelected > new MenuProvider().getMenu().size()-1) == true){
            new Print("Masukkan Salah Satu Angka Pada Menu : ").line();
            menuSelected = scanner.nextInt();
            scanner.close();
        }
        // new Print("index = "+(menuSelected-1)).nextLine();
        new Welcome().selectedMenu(menuSelected-1);
    }

    public void introduction() {
        new Print("").nextLine();
        Print.showHashes(45);
        new Print("Selamat Datang di Rental Mobil").nextLine();
        new Print("").nextLine();
        new Print("Kelompok 3 Pemrograman Berorientasi Objek").nextLine();
        Print.showHashes(45);
        showKelompok();
        Print.showHashes(45);
        
    }

    public void showMenu(){
        List<Menu> menu = new MenuProvider().getMenu();
        for (Menu data : menu) {
            new Print(data.getId()+". ").line();
            new Print(data.getName()).nextLine();
        }
    }

    public void selectedMenu(int id){
        // List<Menu> menu = new MenuProvider().getMenu();
        // for (int i = 0; i < menu.size(); i++) {
        //     if(menu.get(i).getId() == id){
        //         new MenuProvider().runMenu(i);
        //         break;
        //     }
        // }

        switch (id) {
            case 0:
                Welcome.mainRun();
                break;
            case 1:
                Penyewaan.mainRun();
                break;
            case 2:
                Pengembalian.mainRun();
                break;
            case 3:
                Pengaturan.mainRun();
                break;
        
            default:
                break;
        }
    }

    void showKelompok(){
        List<Kelompok> kelompok = KelompokProvider.getData();
        
        for (Kelompok data : kelompok) {
            new Print("Nama : "+data.getNama()+" | ").line();
            new Print("NIM : "+data.getNim()).nextLine();
        }
    }
    
}

package com.kelompok3.rentcar.services;

import java.util.List;

import com.kelompok3.rentcar.models.Mobil;
import com.kelompok3.rentcar.models.User;
import com.kelompok3.rentcar.providers.AuthProvider;
import com.kelompok3.rentcar.providers.MobilProvider;
import com.kelompok3.rentcar.services.misc.Print;

public class Penyewaan {


    public static void mainRun(){
        // User user = new User();
        if(new AuthProvider().getCurrentUser() == null){
            while(AuthProvider.login() == false){
                new Print("username atau password salah. mohon login ulang").nextLine();
            }
        }

        new Print("Login Berhasil!").nextLine();

        Print.showHashes(50);
        Print.showHashes(50);
        new Print("").nextLine();
        new Print("List Mobil Tersedia .. ").nextLine();
        showMobil();
        new Print("").nextLine();
        Print.showHashes(50);

    }

    static void showMobil(){
        List<Mobil> listMobil = MobilProvider.getDataAvailableMobil();
        for (Mobil mobil : listMobil) {
            new Print("Merek : "+mobil.merek()).nextLine();
            new Print("Tipe : "+mobil.tipe()).nextLine();
            new Print("Tahun : "+mobil.tahun()).nextLine();
            new Print("No. Polisi : "+mobil.nopol()).nextLine();
            new Print("Harga Sewa mobil : "+mobil.harga()).nextLine();
            Print.showHashes(30);
        }
    }


}

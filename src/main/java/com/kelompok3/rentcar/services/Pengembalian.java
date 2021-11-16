package com.kelompok3.rentcar.services;

import com.kelompok3.rentcar.providers.AuthProvider;
import com.kelompok3.rentcar.services.misc.Print;

public class Pengembalian {

    public static void mainRun(){
        if(new AuthProvider().getCurrentUser() == null){
            while(AuthProvider.login() == false){
                new Print("username atau password salah. mohon login ulang").nextLine();
            }
        }

        new Print("Login Berhasil!").nextLine();
    }

}

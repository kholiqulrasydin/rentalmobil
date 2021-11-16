/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kelompok3.rentcar;
import com.kelompok3.rentcar.providers.MenuProvider;
import com.kelompok3.rentcar.services.Penyewaan;
import com.kelompok3.rentcar.services.Welcome;


/**
 *
 * @author kholiqul
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Welcome.mainRun();
        // Penyewaan.mainRun();
        // // while(new RunState().getState() == true){
            MenuProvider menuProvider = new MenuProvider();
            menuProvider.setMenu();
            menuProvider.runMenu(0);
        // // }
    }
    
}

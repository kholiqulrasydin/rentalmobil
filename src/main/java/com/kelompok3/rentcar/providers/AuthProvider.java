package com.kelompok3.rentcar.providers;

import java.util.Scanner;

import com.kelompok3.rentcar.models.User;
import com.kelompok3.rentcar.services.misc.Print;

public class AuthProvider extends UserProvider {
    User user;

    public void setUser(User user){
        this.user = user;
    }

    public User getCurrentUser(){
        return this.user;
    }

    
    public static Boolean loginUsingUsernameAndPassword(String username, String password){
        Boolean result = false;

        User data = getDataUserByUsername(username);
        if(data == null){
            result = false;
        }else{
            if(data.password() != null){
                if(data.password().equals(password)){
                    result = true;
                    new AuthProvider().setUser(data);
                }else{
                    result = false;
                }
            }else{
                result = false;
            }
        }

        
        return result;
    }

    public static boolean login(){
        Scanner scanner = new Scanner(System.in);
        new Print("\n").nextLine();
        new Print("Masukkan username : ").line();
        String username = scanner.nextLine();
        new Print("Masukkan password : ").line();
        String password = scanner.nextLine();
        return AuthProvider.loginUsingUsernameAndPassword(username, password);
    }
}

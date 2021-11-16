package com.kelompok3.rentcar.services.misc;

public class Print {
    final String text;

    public Print(String text){
        this.text = text;
    }

    public static void showHashes(int length){
        for (int i = 0; i < length; i++) {
            System.out.print("#");
        }
        System.out.println("");
    }

    public void line() {
        System.out.print(this.text);
    }

    public void nextLine() {
        System.out.println(this.text);
    }
}

package daftar_mobil;

import java.util.Scanner;

public class data_mobil {

    public static void main(String[] args) {
        // deklarasi variabel
        String Tipe, Merek, Status, Nopol;
        int Tahun, Harga;

        // membuat scanner baru
        Scanner keyboard = new Scanner(System.in);

        // Tampilkan output ke user
        System.out.println("### Pendataan Rental Mobil###");
        System.out.print("Tipe: ");
        // menggunakan scanner dan menyimpan apa yang diketik di variabel nama
        Tipe = keyboard.nextLine();
        // Tampilkan outpu lagi
        System.out.print("Merek: ");
        // menggunakan scanner lagi
        Merek = keyboard.nextLine();

        System.out.print("Status: ");
        Status = keyboard.nextLine();

        System.out.print("Nopol: ");
        Nopol = keyboard.nextLine();

        System.out.print("Tahun: ");
        Tahun = keyboard.nextInt();

        System.out.print("Harga: ");
        Harga = keyboard.nextInt();


        // Menampilkan apa yang sudah simpan di variabel
        System.out.println("--------------------");
        System.out.println("Tipe Mobil: " + Tipe);
        System.out.println("Merek Mobil: " + Merek);
        System.out.println("Status: " + Status);
        System.out.println("Nopol: " + Nopol);
        System.out.println("Tahun: " + Tahun);
        System.out.println("Harga: Rp " + Harga);

    }

}

package com.belajar;

import java.util.Scanner;

public class Gaji {
    public static int hari_kerja, umur, jam_lembur;
    public String nama;

    public static void HitungGaji() throws Exception {
        int gaji, tunjangan, UangMakan, GajiTotal;

        gaji = hari_kerja * 100000;
        UangMakan = hari_kerja * 20000;

        if (umur > 50) {
            tunjangan = 1500000;
        } else if (umur > 40) {
            tunjangan = 1000000;
        } else {
            tunjangan = 500000;
        }

        GajiTotal = (gaji + UangMakan + tunjangan);

        System.out.println("\n===========BERIKUT RINCIAN GAJI ANDA BULAN INI===========");
        System.out.println("\nGaji pokok 		                         Rp. " + gaji);
        System.out.println("\nTunjangan 		                         Rp. " + tunjangan);
        System.out.println("\nUang makan       	                     Rp. " + UangMakan);
        System.out.println("\n________________________________________________________+");
        System.out.println("\nTotal gaji bersih	                     Rp. " + GajiTotal);
        System.out.println("\nTerimakasih, Selamat bekerja kembali!");
    }
}
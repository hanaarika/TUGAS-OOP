package com.belajar;

import java.util.Scanner;

public class DataPegawai {
    public static void Gaji() throws Exception {
            Gaji data = new Gaji();
            Scanner sc = new Scanner(System.in);

            System.out.println("=============================================");
            System.out.println("       PROGRAM CEK GAJI PT. SURYA MEUBLE");
            System.out.println("=============================================");
            System.out.print("Masukkan nama         : ");
            data.nama = sc.nextLine();
            do {
                System.out.print("Masukkan umur         : ");
                data.umur = sc.nextInt();
            } while (data.umur < 18 | data.umur > 60);
            do {
                System.out.print("Masukkan hari kerja   : ");
                data.hari_kerja = sc.nextInt();
            } while (data.hari_kerja <= 0 | data.hari_kerja > 31);

            Gaji.HitungGaji();
        }
    }

}

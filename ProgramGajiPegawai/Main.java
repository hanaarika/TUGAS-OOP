package ProgramGajiPegawai;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        int pilihan;

        Scanner main = new Scanner(System.in);
        do {
            System.out.println("=============================================");
            System.out.println("      PROGRAM KEPEGAWAIAN PT.SURYA MEUBLE");
            System.out.println("=============================================");
            System.out.println("|        1. Program Pengecekan Gaji         |");
            System.out.println("|        2. Cek Jadwal Kerja                |");
            System.out.println("=============================================");
            System.out.print("\nMasukkan pilihan: ");
            pilihan = main.nextInt();
        } while (pilihan < 1 | pilihan > 2);

            if (pilihan == 1) {
                DataPegawai.Gaji();
            }
            else if (pilihan == 2){
                System.out.println("==============================================");
                System.out.println("|        JADWAL KERJA PT.SURYA MEUBLE        |");
                System.out.println("==============================================");
                System.out.println("|         Senin         |       08.30-17.00  |");
                System.out.println("|         Selasa        |       08.30-17.00  |");
                System.out.println("|         Rabu          |       08.30-17.00  |");
                System.out.println("|         Kamis         |       08.30-17.00  |");
                System.out.println("|         Jumat         |       08.00-11.00  |");
                System.out.println("|         Sabtu         |       08.30-17.00  |");
                System.out.println("==============================================");
            }
    }
}

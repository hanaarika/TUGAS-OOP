package ProgramGajiPegawai;

//Import kelas Scanner
import java.util.Scanner;

public class DataPegawai {
    public static int hari_kerja, umur;
    public static String nama;

    public static void Data() throws Exception {

            //instansiasi objek Scanner
            Scanner sc = new Scanner(System.in);

            System.out.println("=============================================");
            System.out.println("       PROGRAM CEK GAJI PT. SURYA MEUBLE");
            System.out.println("=============================================");
            System.out.print("Masukkan nama         : ");
            nama = sc.nextLine();
            do {
                System.out.print("Masukkan umur         : ");
                umur = sc.nextInt();
            } while (umur < 18 | umur > 60); //pegawai hanya berusia 18-60 tahun,
                                                        //sehingga akan terjadi perulangan jika input
                                                        //berada diluar rentang tersebut
            do {
                System.out.print("Masukkan hari kerja   : ");
                hari_kerja = sc.nextInt();
            } while (hari_kerja <= 0 | hari_kerja > 31); //terjadi perulangan jika hari
                                                                    //kerja diluar rentang 1-31 hari

            //Pengarahan menuju Class Gaji
            Gaji.HitungGaji();
        }
    }
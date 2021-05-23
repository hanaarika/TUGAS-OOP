package TugasAbstractDanInterface;

import java.util.Scanner;//import kelas scanner

public class Test {

    public static void main(String[] args){
        //deklarasi variabel lokal
        int pilihan;

        //instansiasi objek Scanner
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("=============================================");
            System.out.println("|               PROGRAM CEK BMI             |");
            System.out.println("=============================================");
            System.out.println("|   1. Cek BMI untuk Wanita Diatas 18 tahun |");
            System.out.println("|   2. Cek BMI untuk Wanita Dibawah 18 tahun|");
            System.out.println("|   3. Cek BMI untuk Pria Diatas 18 tahun   |");
            System.out.println("|   4. Cek BMI untuk Pria Dibawah 18 tahun  |");
            System.out.println("=============================================");
            System.out.print("\nMasukkan pilihan: ");
            pilihan = sc.nextInt(); //menyimpan hasil masukan pilihan
        } while (pilihan < 1 | pilihan > 4); //pengulangan apabila input <1 atau >4

        if (pilihan == 1){
            Dewasa wdewasa = new Dewasa(); //instansiasi objek

            wdewasa.setTinggi1(1.50); //inisialisasi tinggi yaitu 1.50m
            wdewasa.setBerat1(40); //inisialisasi berat yaitu 40kg

            System.out.println("BMI anda adalah " +wdewasa.hitungBMI());
            System.out.println("BMI Ideal Wanita Dewasa adalah " +Wanita.IdealWanita);
        }
        else if (pilihan == 2){
            Remaja wremaja = new Remaja();

            wremaja.setTinggi3(1.45); //inisialisasi tinggi yaitu 1.45m
            wremaja.setBerat3(45); //inisialisasi berat yaitu 45kg

            System.out.println("BMI anda adalah " +wremaja.hitungBMI());
            System.out.println("BMI Ideal Wanita Remaja adalah " +Wanita.IdealWanita);
        }
        else if (pilihan == 3){
            Dewasa2 pdewasa = new Dewasa2();

            pdewasa.setTinggi2(1.76); //inisialisasi tinggi yaitu 1.76m
            pdewasa.setBerat2(50); //inisialisasi berat yaitu 50kg

            System.out.println("BMI anda adalah " +pdewasa.hitungBMI());
            System.out.println("BMI Ideal Pria Dewasa adalah " +Pria.IdealPria);
        }
        else {
            Remaja2 premaja = new Remaja2();

            premaja.setTinggi4(1.65); //inisialisasi tinggi yaitu 1.65m
            premaja.setBerat4(43); //inisialisasi berat yaitu 43kg

            System.out.println("BMI anda adalah " +premaja.hitungBMI());
            System.out.println("BMI Ideal Pria Remaja adalah " +Pria.IdealPria);
        }
    }
}

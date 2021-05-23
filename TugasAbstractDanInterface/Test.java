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
            System.out.println("|               PROGRAM CEK GAJI            |");
            System.out.println("=============================================");
            System.out.println("|       1. Cek Gaji Bagian Operasional      |");
            System.out.println("|       2. Cek Gaji Bagian Finansial        |");
            System.out.println("|       3. Cek Gaji Bagian Marketing        |");
            System.out.println("|       4. Cek Gaji Bagian Managerial       |");
            System.out.println("=============================================");
            System.out.print("\nMasukkan pilihan: ");
            pilihan = sc.nextInt(); //menyimpan hasil masukan pilihan
        } while (pilihan < 1 | pilihan > 4); //pengulangan apabila input <1 atau >4

        if (pilihan == 1){
            Operasional lapangan = new Operasional(); //instansiasi objek

            lapangan.setHarikerja1(25);
            lapangan.setTunjangan1(1000000);

            System.out.println("Gaji anda adalah " +lapangan.hitungGaji());
            System.out.println("Tingkat Pegawai " + TingkatDua.Tingkatan2);
        }
        else if (pilihan == 2){
            Finansial keuangan = new Finansial();

            keuangan.setHarikerja3(24);
            keuangan.setTunjangan3(2000000);

            System.out.println("Gaji anda adalah " +keuangan.hitungGaji());
            System.out.println("Tingkat Pegawai " + TingkatSatu.Tingkatan1);
        }
        else if (pilihan == 3){
            Marketing marketing = new Marketing();

            marketing.setHarikerja2(20);
            marketing.setTunjangan2(1500000);

            System.out.println("Gaji anda adalah " +marketing.hitungGaji());
            System.out.println("Tingkat Pegawai " + TingkatDua.Tingkatan2);
        }
        else {
            Managerial manager = new Managerial();

            manager.setHarikerja4(24); //inisialisasi tinggi yaitu 1.65m
            manager.setTunjangan4(3000000); //inisialisasi berat yaitu 43kg

            System.out.println("Gaji anda adalah " +manager.hitungGaji());
            System.out.println("Tingkat Pegawai " + TingkatSatu.Tingkatan1);
        }
    }
}

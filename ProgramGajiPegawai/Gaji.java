package ProgramGajiPegawai;

public class Gaji extends DataPegawai{
    public static void HitungGaji() throws Exception {
        //instansiasi objek dari class Gaji
        DataPegawai data = new DataPegawai();
        //variabel lokal
        int gaji, tunjangan, UangMakan, GajiTotal;

        //perhitungan gaji dan uang makan
        gaji = data.hari_kerja * 100000;
        UangMakan = data.hari_kerja * 20000;

        if (data.umur > 50) {
            tunjangan = 1500000;
        } else if (data.umur > 40) {
            tunjangan = 1000000;
        } else {
            tunjangan = 500000;
        }

        //perhitungan gaji total
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
package TugasAbstractDanInterface;

public class Dewasa extends Manusia implements Wanita{
    private double tinggi;
    private float berat;

    public double getTinggi(){
        return tinggi;
    }

    public float getBerat(){
        return berat;
    }

    public void setTinggi1(double tinggi){
        this.tinggi = tinggi;
    }

    public void setBerat1(int berat){
        this.berat = berat;
    }

    @Override
    public double hitungBMI() {
        return berat/(tinggi*tinggi);
    }

    @Override
    public void displayWanita() {
        return;
    }
}
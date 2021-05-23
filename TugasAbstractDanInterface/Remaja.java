package TugasAbstractDanInterface;

public class Remaja extends Manusia implements Wanita{
    private double tinggi;
    private float berat;

    public double getTinggi(){
        return tinggi;
    }

    public float getBerat(){
        return berat;
    }

    public void setTinggi3(double tinggi){
        this.tinggi = tinggi;
    }

    public void setBerat3(int berat){
        this.berat = berat;
    }

    @Override
    public double hitungBMI() {
        return berat/(tinggi*tinggi);
    }

    @Override
    public void displayWanita() {
        return ;
    }
}

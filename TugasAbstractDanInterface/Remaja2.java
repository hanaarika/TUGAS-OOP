package TugasAbstractDanInterface;

public class Remaja2 extends Manusia implements Pria{
    private double tinggi;
    private float berat;

    public double getTinggi(){
        return tinggi;
    }

    public float getBerat(){
        return berat;
    }

    public void setTinggi4(double tinggi){
        this.tinggi = tinggi;
    }

    public void setBerat4(int berat){
        this.berat = berat;
    }

    @Override
    public double hitungBMI() {
        return berat/(tinggi*tinggi);
    }

    @Override
    public void displayPria() {
        return ;
    }
}

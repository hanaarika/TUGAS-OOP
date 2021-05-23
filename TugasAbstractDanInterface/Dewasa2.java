package TugasAbstractDanInterface;

public class Dewasa2 extends Manusia implements Pria{
    private double tinggi;
    private float berat;

    public double getTinggi(){
        return tinggi;
    }

    public float getBerat(){
        return berat;
    }

    public void setTinggi2(double tinggi){
        this.tinggi = tinggi;
    }

    public void setBerat2(int berat){
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

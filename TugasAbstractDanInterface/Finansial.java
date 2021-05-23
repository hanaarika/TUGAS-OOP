package TugasAbstractDanInterface;

public class Finansial extends Pegawai implements TingkatDua {
    private int harikerja;
    private float tunjangan;

    public double getHarikerja(){
        return harikerja;
    }

    public float getTunjangan(){
        return tunjangan;
    }

    public void setHarikerja3(int harikerja){
        this.harikerja = harikerja;
    }

    public void setTunjangan3(float tunjangan){
        this.tunjangan = tunjangan;
    }

    @Override
    public double hitungGaji() {
        return (harikerja*150000)+tunjangan;
    }

    @Override
    public void displayTingkat2() {
        return ;
    }
}

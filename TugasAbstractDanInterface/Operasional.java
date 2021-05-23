package TugasAbstractDanInterface;

public class Operasional extends Pegawai implements TingkatDua {
    private int harikerja;
    private float tunjangan;

    public double getHarikerja(){
        return harikerja;
    }

    public float getTunjangan(){
        return tunjangan;
    }

    public void setHarikerja1(int harikerja){
        this.harikerja = harikerja;
    }

    public void setTunjangan1(float tunjangan){
        this.tunjangan = tunjangan;
    }

    @Override
    public double hitungGaji() {
        return (harikerja*100000)+tunjangan;
    }

    @Override
    public void displayTingkat2() {
        return;
    }
}
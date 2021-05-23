package TugasAbstractDanInterface;

public class Marketing extends Pegawai implements TingkatDua {
    private int harikerja;
    private float tunjangan;

    public double getHarikerja(){
        return harikerja;
    }

    public float getTunjangan(){
        return tunjangan;
    }

    public void setHarikerja2(int harikerja){
        this.harikerja = harikerja;
    }

    public void setTunjangan2(float tunjangan){
        this.tunjangan = tunjangan;
    }

    @Override
    public double hitungGaji() {
        return (harikerja*125000)+tunjangan;
    }

    @Override
    public void displayTingkat2() {
        return ;
    }
}

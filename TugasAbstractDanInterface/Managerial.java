package TugasAbstractDanInterface;

public class Managerial extends Pegawai implements TingkatSatu {
    private int harikerja;
    private float tunjangan;

    public double getHarikerja(){
        return harikerja;
    }

    public float getTunjangan(){
        return tunjangan;
    }

    public void setHarikerja4(int harikerja){
        this.harikerja = harikerja;
    }

    public void setTunjangan4(float tunjangan){
        this.tunjangan = tunjangan;
    }

    @Override
    public double hitungGaji() {
        return (harikerja*250000)+tunjangan;
    }

    @Override
    public void displayTingkat1() {
        return ;
    }
}

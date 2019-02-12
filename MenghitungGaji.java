public class MenghitungGaji extends Pegawai {
    private Pegawai[] listPegawai;
    private int jumlahPegawaiSekarang;
    private double Tarif = 20000;
    private double MenghitungTarif;

    public MenghitungGaji(int jumlah_pegawai){
        listPegawai = new Pegawai[jumlah_pegawai];
    }

    public void addPegawai(Pegawai p){
        listPegawai[jumlahPegawaiSekarang] = p;
        jumlahPegawaiSekarang++;
    }

    public double getMenghitungTarif() {
        return MenghitungTarif;
    }

    public void setTarif(double Tarif ) {
        Tarif = Tarif;
    }
    public void hitungTarif(){
        this.MenghitungTarif = this.Tarif * 30;
    }
}




public class Pegawai {
    public String Nama;
    public  String Jabatan;
    public  String Alamat;


    public void HasilKerja(){
        System.out.println(" Hasil Kerjanya : Baik Sekali ");
    }
    public  void InfoPegawai(String Nama, String Jabatan, String Alamat){
        System.out.println("Nama " + Nama+ " Jabatan " + Jabatan + "Alamat" + Alamat);

    }
    public void setNama(String nama) {
        Nama = nama;
    }

    public String getNama() {
        return Nama;
    }

    public int getGaji() {
        return 1500000;
    }
}

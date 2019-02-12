public class Main {

    public static void main(String[] args){
        System.out.println("Hallo Selamat Untuk Mendapatkan Gaji ");

        Pegawai     pegawai                     = new Pegawai();
        Staff       staff                       = new Staff();
        MenghitungGaji hitung                   = new MenghitungGaji(2);

        pegawai.HasilKerja();
        pegawai.InfoPegawai("Norisa ", "Bendahara ", " Ciamis ");
        staff.HasilKerja();
        staff.InfoPegawai("Dian ", "Humas ", " Kawali ");
        hitung.setTarif(20000);
        hitung.hitungTarif();
        System.out.println("Gajinya Adalah " + hitung.getMenghitungTarif());

    }


}

package test;

import paket5.Perusahaan;
import paketInterface.MyInterface;

public class Karyawan extends Perusahaan implements MyInterface {
    String nama;
    String alamat;

    public Karyawan(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    public void setBiodataPerusahaan(String nama, String alamat) {
        super.setAlamat(alamat);
        super.setNama(nama);
    }
    
    public void printBiodata(){
        System.out.println("Nama            : "+this.nama);
        System.out.println("Alamat          : "+this.alamat);
        System.out.println("Bekerja di Perusahaan "+super.getNama()+" yang terletak di "+super.getAlamat());
    }
    
    @Override
    public String getStringInfoState(){
        return "Nama            : "+this.nama+"\n"+
               "Alamat          : "+this.alamat+"\n"+
               "Bekerja di Perusahaan "+super.getNama()+" yang terletak di "+super.getAlamat();
    }
}

package test;

import paket10.Universitas;
import paketInterface.MyInterface;

public class Dosen extends Universitas implements MyInterface {
    String nama;
    String nip;

    public Dosen(String nama, String nip) {
        this.nama = nama;
        this.nip = nip;
    }

    public void setBiodataUniversitas(String nama, String alamat) {
        super.setAlamat(alamat);
        super.setNama(nama);
    }
    
    @Override
    public String getStringInfoState(){
        return "Nama            : "+this.nama+"\n"+
               "NIP             : "+this.nip+"\n"+
               "Bekerja di Universitas "+super.getNama()+" yang terletak di "+super.getAlamat();
    }
}

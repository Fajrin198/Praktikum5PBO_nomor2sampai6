/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import paket6.RumahSakit;
import paketInterface.MyInterface;

/**
 *
 * @author MY ASUS
 */
public class Dokter extends RumahSakit implements MyInterface{
    String nama;
    String spesialis;

    public Dokter(String nama, String spesialis) {
        this.nama = nama;
        this.spesialis = spesialis;
    }

    public void setBiodataRumahSakit(String nama, String alamat) {
        super.setAlamat(alamat);
        super.setNama(nama);
    }
    
    @Override
    public String getStringInfoState(){
        return "Nama            : "+this.nama+"\n"+
               "Spesialis       : "+this.spesialis+"\n"+
               "Bekerja di Rumah Sakit "+super.getNama()+" yang terletak di "+super.getAlamat();
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import paket7.Sekolah;
import paketInterface.MyInterface;

/**
 *
 * @author MY ASUS
 */
public class Siswa extends Sekolah implements MyInterface {
    String nama;
    String kelas;

    public Siswa(String nama, String kelas) {
        this.nama = nama;
        this.kelas = kelas;
    }

    public void setBiodataSekolah(String nama, String alamat) {
        super.setAlamat(alamat);
        super.setNama(nama);
    }
    
    @Override
    public String getStringInfoState(){
        return "Nama            : "+this.nama+"\n"+
               "Kelas           : "+this.kelas+"\n"+
               "Nama Sekolah    : "+super.getNama()+"\n"+
               "Alamat Sekolah  : "+super.getAlamat();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import paket3.Manusia;
import paketInterface.MyInterface;

/**
 *
 * @author MY ASUS
 */
public class Mahasiswa extends Manusia implements MyInterface {
    String nim;
    String jurusan;

    public Mahasiswa(String nama, String nim, String jurusan) {
        super.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
    }

    public void setAlamat(String alamat) {
        super.alamat = alamat;
    }
    
    public void printState(){
        System.out.println("Nama    : "+nama);
        System.out.println("NIM     : "+nim);
        System.out.println("Jurusan : "+jurusan);
    }
    
    @Override
    public String getStringInfoState(){
        return "Nama            : "+super.nama+"\n"+
               "Nim             : "+this.nim+"\n"+
               "Jurusan         : "+this.jurusan+"\n"+
               "Alamat          : "+super.alamat;
    }
}

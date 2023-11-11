/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

/**
 *
 * @author MY ASUS
 */
public class Main {
    public static void main(String[] args) {
        Anak anak1 = new Anak("Fadil",16,"SMA");
        System.out.println(anak1.getStringInfoState());
        System.out.println("");
        
        Ayam ayam1 = new Ayam();
        ayam1.berkokok();
        System.out.println(ayam1.getStringInfoState());
        System.out.println("");
        
        Dokter dokter1 = new Dokter("Fadil","Mata");
        dokter1.setBiodataRumahSakit("Rumah Sakit toktok", "jl. Menuju langit");
        System.out.println(dokter1.getStringInfoState());
        System.out.println("");
        
        Dosen dosen1 = new Dosen("Firman","46563438");
        dosen1.setBiodataUniversitas("Universitas Negeri Toktok", "Jl. Hell to Heaven");
        System.out.println(dosen1.getStringInfoState());
        System.out.println("");
        
        Karyawan karyawan1 = new Karyawan("Yamato","Wanokuni");
        karyawan1.setBiodataPerusahaan("Toktok", "Onigashima");
        System.out.println(karyawan1.getStringInfoState());
        System.out.println("");
        
        Lingkaran bola1 = new Lingkaran();
        bola1.setR(14);
        System.out.println(bola1.getStringInfoState());
        System.out.println("");
        
        Mahasiswa mhs1 = new Mahasiswa("Fajrin","D0222336","Informatika");
        System.out.println(mhs1.getStringInfoState());
        System.out.println("");
        
        Pohon pohon1 = new Pohon("Pohon Apel",350,true);
        pohon1.berbuah();
        System.out.println(pohon1.getStringInfoState());
        System.out.println("");
        
        SeaFood sf = new SeaFood("Ikan Bakar",12000,"Ikan");
        System.out.println(sf.getStringInfoState());
        System.out.println("");
        
        Siswa siswa1 = new Siswa("Fadil","2B");
        siswa1.setBiodataSekolah("SMA 2 Onigashima", "Wanokuni");
        System.out.println(siswa1.getStringInfoState());
        System.out.println("");
        
    }
}

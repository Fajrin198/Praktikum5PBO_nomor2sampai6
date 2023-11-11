/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import paket4.Tumbuhan;
import paketInterface.MyInterface;

/**
 *
 * @author MY ASUS
 */
public class Pohon extends Tumbuhan implements MyInterface {
    boolean memilikiBuah;

    public Pohon(String nama, double tinggi, boolean memilikiBuah) {
        super.nama = nama;
        super.tinggi = tinggi;
        this.memilikiBuah = memilikiBuah;
    }
    
    public void berbuah(){
        if(memilikiBuah){
            System.out.println(nama+" itu sedang berbuah");
        }else{
            System.out.println(nama+" itu sedang tidak berbuah");
        }
    }
    
    @Override
    public String getStringInfoState(){
        return "Nama            : "+super.nama+"\n"+
               "Tinggi          : "+super.tinggi+" cm\n"+
               "Memiliki Buah   : "+memilikiBuah;
    }
    
    
}

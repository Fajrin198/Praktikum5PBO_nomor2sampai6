/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import paket2.Hewan;
import paketInterface.MyInterface;

public class Ayam extends Hewan implements MyInterface {
    String warna_bulu = "Coklat";
    String jenis_ras = "Ayam Brahma";
    double berat_badan = 10.3;
    int usia = 4;
    
    public void berkokok(){
        System.out.println("Ayam itu berkokok");
    }
    
    @Override
    public String getStringInfoState(){
        return "Jenis Ras    = "+jenis_ras+"\n"+
                "Warna Bulu  = "+warna_bulu+"\n"+
                "Berat_badan = "+berat_badan+"kg"+"\n"+
                "Usia        = "+usia+" tahun";
    }
}

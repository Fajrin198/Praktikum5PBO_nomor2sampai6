/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import paket8.Makanan;
import paketInterface.MyInterface;

public class SeaFood extends Makanan implements MyInterface{
    String bahanPokok;

    public SeaFood(String nama, int harga, String bahanPokok) {
        super(nama, harga);
        this.bahanPokok = bahanPokok;
    }

    public String getBahanPokok() {
        return bahanPokok;
    }
    
    @Override
    public String getStringInfoState(){
        return "Nama            : "+super.getNama()+"\n"+
               "Harga           : "+super.getHarga()+"\n"+
               "Bahan pokok     : "+bahanPokok;
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import paket9.Keluarga;
import paketInterface.MyInterface;

public class Anak extends Keluarga implements MyInterface {
    String pendidikan;

    public Anak(String nama, int umur, String pendidikan) {
        super(nama, umur);
        this.pendidikan = pendidikan;
    }

    @Override
    public int getUmur() {
        return super.getUmur();
    }

    @Override
    public String getNama() {
        return super.getNama();
    }

    @Override
    public String getStringInfoState(){
        return "Nama       = "+getNama()+"\n"+
               "Umur       = "+getUmur()+"\n"+
               "Pendidikan = "+pendidikan;
    }
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import paket1.BangunDatar;
import paketInterface.MyInterface;

/**
 *
 * @author MY ASUS
 */
public class Lingkaran extends BangunDatar implements MyInterface {
    double r;

    public void setR(double r) {
        this.r = r;
    }
    
    public void hitungLuas(){
        double luas = PHI*r*r;
        System.out.println("Luas lingkaran = "+luas);
    }
    
    public void hitungKeliling(){
        double keliling = 2*PHI*r;
        System.out.println("Keliling = "+keliling);
    }
    
    @Override
    public String getStringInfoState(){
        return "Jari-jari Lingkarang  : "+this.r;
    }
    
}

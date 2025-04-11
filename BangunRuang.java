/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package utp.shapes;

/**
 *
 * @author Aurel
 */
public abstract class BangunRuang {
    private String nama;
    private double tinggi;
    
    public BangunRuang(){}
    
    public void setNama(String inputNama){
        this.nama = inputNama;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setTinggi(double inputTinggi){
        this.tinggi = inputTinggi;
    }
    
    public double getTinggi(){
        return tinggi;
    }
    
    public abstract double getLuasPermukaan();
    
    public abstract double getVolume();
    
    public void printInfo(){}
}



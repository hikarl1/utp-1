/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utp.shapes;

/**
 *
 * @author Aurel
 */
public class Tabung extends BangunRuang {
    private double radius;
    private static final int PEMBILANG = 22;
    private static final int PENYEBUT = 7;
    
    public Tabung(){}
    
    public void setRadius(double inputRadius){
        this.radius = inputRadius;
    }
    
    public double getLuasPermukaan(){
        return (2*(Math.pow(radius, 2)*(PENYEBUT/PEMBILANG)) + (2*radius*(PEMBILANG/PENYEBUT)*getTinggi()));
    }
    
    public double getVolume(){
        return Math.pow(radius, 2) * (PENYEBUT/PEMBILANG) * getTinggi();
    }
    
   
}

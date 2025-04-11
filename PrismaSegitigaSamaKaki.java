/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utp.shapes;

/**
 *
 * @author Aurel
 */
public class PrismaSegitigaSamaKaki extends BangunRuang{
    private double alas;
    private double kaki;
    
    public PrismaSegitigaSamaKaki(double alas, double kaki, double tinggi){
        this.alas = alas;
        this.kaki = kaki;
        setTinggi(tinggi);
        setNama("Prisma Segitiga Sama Kaki");
    }
    
    public double getLuasPermukaan(){
        return (2*getLuasAlas()) + (getKeliling()*getTinggi());
    }
    
    public double getVolume(){
        return getLuasAlas() * getTinggi();
    }
    
    public double getTinggiAlas(){
        return Math.sqrt((kaki * kaki) - ((alas/2)*(alas/2)));
    }
    
    public double getLuasAlas(){
        return (getTinggiAlas() * alas) / 2;
    }
    
    public double getKeliling(){
        return 2 * kaki * alas;
    }
}

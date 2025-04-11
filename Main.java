/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package utp.mains;
import utp.shapes.*;
import java.util.Scanner;
/**
 *
 * @author Aurel
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String GREEN = "\u001B[32m";
        String YELLOW = "\u001B[33m";

        System.out.println(GREEN + "===========================================");
        System.out.println("Kalkulator Bangun Ruang");
        System.out.println("NAMA LENGKAP");
        System.out.println("NIM");
        System.out.println(YELLOW + "===========================================");

        //prisma
        System.out.println("Prisma Segitiga Sama Kaki");
        System.out.println("===========================================");
        
        System.out.print("Isikan alas   : ");
        double alas = input.nextDouble();
        System.out.print("Isikan kaki   : ");
        double kaki = input.nextDouble();
        System.out.print("Isikan tinggi : ");
        double tinggiPrisma = input.nextDouble();
        
        PrismaSegitigaSamaKaki prisma = new PrismaSegitigaSamaKaki(alas, kaki, tinggiPrisma);

        System.out.println("===========================================");
        System.out.println("Nama           : " + prisma.getNama());
        System.out.println("Luas permukaan : " + prisma.getLuasPermukaan());
        System.out.println("Volume         : " + prisma.getVolume());

        // === Limas Persegi ===
        System.out.println("===========================================");
        System.out.println("Limas Persegi");
        System.out.println("===========================================");
        System.out.print("Isikan sisi    : ");
        double sisi = input.nextDouble();

        System.out.print("Isikan tinggi  : ");
        double tinggiLimas = input.nextDouble();

        LimasPersegi limas = new LimasPersegi(sisi, tinggiLimas);

        System.out.println("===========================================");
        System.out.println("Nama           : " + limas.getNama());
        System.out.println("Luas permukaan : " + limas.getLuasPermukaan());
        System.out.println("Volume         : " + limas.getVolume());

        // === Tabung ===
        System.out.println("===========================================");
        System.out.println("Tabung");
        System.out.println("===========================================");
        System.out.print("Isikan radius  : ");
        double radius = input.nextDouble();

        System.out.print("Isikan tinggi  : ");
        double tinggiTabung = input.nextDouble();

        Tabung tabung = new Tabung();
        tabung.setRadius(radius);
        tabung.setTinggi(tinggiTabung);

        System.out.println("===========================================");
        System.out.println("Nama           : " + tabung.getNama());
        System.out.println("Luas permukaan : " + tabung.getLuasPermukaan());
        System.out.println("Volume         : " + tabung.getVolume());

        System.out.println("===========================================");

        input.close();
    }
}


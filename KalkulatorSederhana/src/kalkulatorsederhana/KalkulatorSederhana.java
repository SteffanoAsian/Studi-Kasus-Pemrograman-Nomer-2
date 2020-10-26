/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulatorsederhana;

import java.util.Scanner;

/**
 *
 * @author MADCOMS
 */
public class KalkulatorSederhana {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("UnusedAssignment")
    public static void main(String[] args) {
        // Deklarasi Variabel
        int a1; 
        int a2;
        
        //Membuat Scanner
        Scanner Kalkulator = new Scanner(System.in);
        
        System.out.print("Input angkaa-1: ");
        a1 = Kalkulator.nextInt();
        System.out.print("Input angkaa-2: ");
        a2 = Kalkulator.nextInt();
        
       //proses + output
        System.out.println("Hasil Penjumlahan : "+(a1 + a2));
        System.out.println("Hasil Pengurangan : "+(a1 - a2));
        System.out.println("Hasil Perkalian : "+(a1 * a2));
        System.out.println("Hasil Penjumlahan : "+(a1 / a2));
        System.out.println("Hasil Modulus/sisa Pembagian: "+(a1 % a2));
        
    }
   }
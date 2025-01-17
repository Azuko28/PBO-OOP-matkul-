/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan2;

import oop.*;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class scannerp2 {
    public static void main(String[] args) {
       // VARIABEL
       String nama;
       int umur;
       String asal;
       
       // isntansi class scanner 
       Scanner s = new Scanner(System.in);
       
       //proses inputan
        System.out.println("\nMasukkan nama : ");       nama= s.nextLine();
        System.out.println("\nMasukkan umur : ");       umur= s.nextInt();
                                                          s.nextLine();
        System.out.println("\nMasukkan asal : ");       asal= s.nextLine();
        

       //output
       System.out.println("\nMasukkan nama : " +nama);
       System.out.println("\nMasukkan umur : " +umur);
       System.out.println("\nMasukkan tinggi : " +asal);
    }
}

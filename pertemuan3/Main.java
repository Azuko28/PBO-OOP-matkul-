/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3;
import oop.*;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main(String[] args) {
        {
            Scanner scan = new Scanner (System.in);
            
            String gaskann;
            
            do {
            // instance of class
            handphone hp = new handphone();
            
            // input
            System.out.println("Masukkan merk handphone :  ");
            String merk_hp = scan.nextLine();
            
            System.out.println("Masukkan tipe handphone :  ");
            String tipe_hp = scan.nextLine();
            
            System.out.println("Masukkan warna handphone :  ");
            String warna_hp = scan.nextLine();
            
            System.out.print("Masukkan harga handphone :  ");
            Double harga_hp = scan.nextDouble();
            
            hp.setMerk(merk_hp);
            hp.setTipe(tipe_hp);
            hp.setWarna(warna_hp);
            hp.setHarga(harga_hp);
            
            // output
            System.out.println("====================================");
            System.out.println("DAFTAR HARGA DAN SPEK");
            System.out.println("====================================");
            System.out.println("Merk HP = " +hp.getMerk());
            System.out.println("Tipe HP = " +hp.getTipe());
            System.out.println("Warna HP = " +hp.getWarna());
            System.out.println("Harga HP sebelum diskon = Rp " +hp.getHarga());
            hp.keterangan();
            
            System.out.println("Mau input data lagi?? (y/n)");
            gaskann=scan.next();
            scan.nextLine();
        } while(gaskann.equalsIgnoreCase("y"));
        
            System.out.println("Makasih udah pakai program ini ^_^ ");
        }
    }
}

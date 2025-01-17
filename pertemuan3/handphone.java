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
public class handphone {
    // membuat objek decimalformat untuk memformat angka
    DecimalFormat df = new DecimalFormat ("#,###");
    
    // deklarasi
    
    private String merk, tipe, warna;
    private double harga;
    
    // setter
    public void setMerk(String merk)
    { 
        this.merk=merk;
    }
    public void setTipe(String tipe)
    {
        this.tipe=tipe;
    }
    public void setWarna(String warna)
    {
        this.warna=warna;
    }
    public void setHarga (double harga)
    {
        this.harga=harga;
    }
    
    //getter
    public String getMerk()
    {
        return merk;
    }
    public String getTipe()
    {
        return tipe;
    }
    public String getWarna()
    {
        return warna;
    }
    public double getHarga()
    {
        return harga;
    }

    // method tambahan
    public double HargaDiskon()
    {
        double diskon = 0.1 * getHarga();
        double total = getHarga() - diskon;
        
        return total;
    }
    
    public void keterangan()
    {
        System.out.println("Harga HP Sesudah diskon 10% = Rp " +df.format(HargaDiskon()));
    }
}





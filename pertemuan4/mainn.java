/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan4;

import oop.*;

/**
 *
 * @author LENOVO
 */
public class mainn {
    public static void main(String[] args) {
        // buat objek segiempat
        SegiEmpat persegiPanjang = new SegiEmpat();
        
        //mengatur panjang dan lebar
        persegiPanjang.setPanjang(6); //set panjang menjadi 6
        persegiPanjang.setLebar(5); //set lebar menjadi 5
        
        System.out.println("Panjang: " +persegiPanjang.getPanjang());
        System.out.println("Lebar: " +persegiPanjang.getLebar());
        System.out.println("Luas: "+persegiPanjang.luas());
    }
}

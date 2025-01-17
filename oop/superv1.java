/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

/**
 *
 * @author LENOVO
 */
public class superv1 {
    public static void main(String[] args) {
        Anakk objk = new Anakk();
        objk.tampilkan();
    }
}

class Indukk {
    void tampilkan() {

        System.out.println("Metode tampilkan() di kelas Induk");
    }

}

class Anakk extends Indukk {
    @Override
    void tampilkan() {
        super.tampilkan(); // Memanggil metode tampilkan dari kelas Induk
        System.out.println("Metode tampilkan() di kelas Anak");
    }
}



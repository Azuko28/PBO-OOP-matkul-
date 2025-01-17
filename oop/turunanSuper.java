/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

/**
 *
 * @author LENOVO
 */
public class turunanSuper {
    public static void main(String[] args) {
       Anak obj = new Anak();
   }
}

class Induk {
    Induk() {
        System.out.println("Konstruktor kelas Induk dipanggil");
    }
}

class Anak extends Induk {

    Anak() {

        super(); // Memanggil konstruktor kelas Induk

        System.out.println("Konstruktor kelas Anak dipanggil");
    }
}



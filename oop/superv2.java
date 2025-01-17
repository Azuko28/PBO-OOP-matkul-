/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

/**
 *
 * @author LENOVO
 */
public class superv2 {
    public static void main(String[] args) {
        Anakan objk = new Anakan();
        objk.tampilkanNama();
    }
}

class Indukan {
    String nama = "Induk";
}
 
class Anakan extends Indukan {
    String nama = "Anak";
 
    void tampilkanNama() {
        System.out.println("Nama di kelas Anak: " + nama);
        System.out.println("Nama di kelas Induk: " + super.nama);
    }
}

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
public class perulanganP2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Bagian if-else: menentukan positif, negatif, atau nol
        System.out.print("Masukkan sebuah angka: ");
        int angka = input.nextInt();

        // if-else untuk mengecek bilangan positif, negatif, atau nol
        if (angka > 0) {
            System.out.println("Angka positif");
        } else if (angka < 0) {
            System.out.println("Angka negatif");
        } else {
            System.out.println("Angka nol");
        }

        // Bagian switch-case: menentukan hari berdasarkan angka
        System.out.print("Masukkan angka (1-7) untuk hari: ");
        int hari = input.nextInt();

        // Switch-case untuk menentukan hari berdasarkan angka
        switch (hari) {
            case 1:
                System.out.println("Hari: Senin");
                break;
            case 2:
                System.out.println("Hari: Selasa");
                break;
            case 3:
                System.out.println("Hari: Rabu");
                break;
            case 4:
                System.out.println("Hari: Kamis");
                break;
            case 5:
                System.out.println("Hari: Jumat");
                break;
            case 6:
                System.out.println("Hari: Sabtu");
                break;
            case 7:
                System.out.println("Hari: Minggu");
                break;
            default:
                System.out.println("Input hari tidak valid, harus 1-7.");
        }

        input.close();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class utama {
    public static void main(String[] args) {
        Scanner inpt = new Scanner (System.in);
     
        Login user1 = new Login ();
        Login user2 = new Login ();
        
        while (true){
            System.out.println("=================");
            System.out.println(" MENU LOGIN");
            System.out.println("=================");
            System.out.println("1. Login Admin");
            System.out.println("2. Ubah password admin");
            System.out.println("3. Buat User");
            System.out.println("4. Lihat data user");
            System.out.println("5. Keluar");
            System.out.println("=================");
            
            
            System.out.println("Masukkan Pilihan : "); int pilih  = inpt.nextInt();
            System.out.println("");
            
            switch (pilih) {
            case 1 -> {
                System.out.println("Masukkan Username : ");
                String my_user = inpt.next();
                System.out.println("Masukkan Password");
                String my_pass = inpt.next();
                System.out.println();
                
                if (my_user.equals(user1.getUsername(my_user))&& my_pass.equals(user1.getPassword(my_pass))){
                    System.out.println("Login Berhasil");
                }else {
                    System.out.println("Login Tidak Berhasil");
                }
                }
            case 2 -> {
                System.out.println("Masukkan Password Lama = ");
                String old_pass = inpt.next();
                System.out.println("Masukkan Password Baru = ");
                String new_pass = inpt.next();
                System.out.println();
                    String my_pass = null;
                    if (old_pass.equals(user1.getPassword(my_pass)))
                    {
                        user1.setPassword(new_pass);
                        System.out.println("Password berhasil dirubah");
                    } else {
                        System.out.println("Anda salah memasukkan password");
                    }
                }
            case 3 -> {
                }
            case 4 -> {
                }
        }
        }
    }
}

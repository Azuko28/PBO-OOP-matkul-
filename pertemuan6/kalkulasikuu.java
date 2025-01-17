/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan6;

/**
 *
 * @author LENOVO
 */
class Kalkulasi {
    int z;
    
    public void penambahan (int x, int y){
        z = x + y;
        System.out.println("hasil penambahan : " + z);
    }
    
    public void pengurangan (int x, int y){
        z = x - y;
        System.out.println("Hasil pengurangan : " + z);
    }
}

public class kalkulasikuu extends Kalkulasi {
    public void perkalian (int x, int y){
        z = x * y;
        System.out.println("hasil perkalian : " + z);
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        kalkulasikuu tes = new kalkulasikuu();
        tes.penambahan(b, b);
        tes.pengurangan(b, b);
        tes.perkalian(b, b);
    }
}


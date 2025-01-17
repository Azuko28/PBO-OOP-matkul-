/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan6;

/**
 *
 * @author LENOVO
 */
public class NewClass {
    public static void main(String[] args) {
         Persegi persegi = new Persegi(8);
        System.out.println("Luas Persegi: " + persegi.hitungLuas());
        System.out.println("Keliling Persegi: " + persegi.hitungKeliling());

        // Menghitung Lingkaran
        Lingkaran lingkaran = new Lingkaran(7);
        System.out.println("Luas Lingkaran: " + lingkaran.hitungLuas());
        System.out.println("Keliling Lingkaran: " + lingkaran.hitungKeliling());

        // Menghitung Persegi Panjang
        PersegiPanjang persegiPanjang = new PersegiPanjang(6, 4);
        System.out.println("Panjang PersegiPanjang: " + persegiPanjang.hitungLuas());
        System.out.println("Lebar PersegiPanjang: " + persegiPanjang.hitungKeliling());

        // Menghitung Segitiga
        Segitiga segitiga = new Segitiga(5, 7, 6, 8, 10);
        System.out.println("Luas Segitiga: " + segitiga.hitungLuas());
        System.out.println("Keliling Segitiga: " + segitiga.hitungKeliling());
    }
}

// Superclass BangunDatar
class BangunDatar {
    // Method untuk menghitung luas dan keliling
    public int hitungLuas() {
        return 0;
    }

    public int hitungKeliling() {
        return 0;
    }
}

// Subclass Persegi
class Persegi extends BangunDatar {
    private int sisi;

    public Persegi(int sisi) {
        this.sisi = sisi;
    }

    public int getSisi() {
        return sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    @Override
    public int hitungLuas() {
        return sisi * sisi;
    }

    @Override
    public int hitungKeliling() {
        return 4 * sisi;
    }
}

// Subclass Lingkaran
class Lingkaran extends BangunDatar {
    private int jariJari;

    public Lingkaran(int jariJari) {
        this.jariJari = jariJari;
    }

    public int getJariJari() {
        return jariJari;
    }

    public void setJariJari(int jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public int hitungLuas() {
        return (int) (Math.PI * jariJari * jariJari);
    }

    @Override
    public int hitungKeliling() {
        return (int) (2 * Math.PI * jariJari);
    }
}

// Subclass PersegiPanjang
class PersegiPanjang extends BangunDatar {
    private int panjang;
    private int lebar;

    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    @Override
    public int hitungLuas() {
        return panjang * lebar;
    }

    @Override
    public int hitungKeliling() {
        return 2 * (panjang + lebar);
    }
}

// Subclass Segitiga
class Segitiga extends BangunDatar {
    private int alas;
    private int tinggi;
    private int sisi1, sisi2, sisi3;

    public Segitiga(int alas, int tinggi, int sisi1, int sisi2, int sisi3) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
    }

    public int getAlas() {
        return alas;
    }

    public void setAlas(int alas) {
        this.alas = alas;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public int hitungLuas() {
        return (alas * tinggi) / 2;
    }

    @Override
    public int hitungKeliling() {
        return sisi1 + sisi2 + sisi3;
    }
}



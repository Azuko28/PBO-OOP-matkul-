/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan4;
//enkapsulasi pertemuan 4

import oop.*;


public class SegiEmpat {
    private int panjang;
    private int lebar;
    
    public void setPanjang(int pj){
        this.panjang = pj;
    }
    
    public void setLebar(int lb){
        this.lebar = lb;
       
    }
    
    public int getPanjang(){
        return this.panjang;
    }
    
    public int getLebar(){
        return this.lebar;
    }
    
    public int luas(){
        return this.panjang * this.lebar;
    }
    
}

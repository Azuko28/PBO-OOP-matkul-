package pertemuan5;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author LENOVO
 */
public class Login {
    
    private String username, password;
    public Login(){
        username = "admin123";
        password = "adminn";
        //isi konstruktor
    }
    
    public Login(String username, String password){
        this.username = username;
        this.password = password;
    }
    
    public void setUsername (String username){
        this.username = username;
    }
    
    public void setPassword (String password){
            this.password = password;
    }
    
    public String getUsername (String username){
        return this.username;
    }
    
    public String getPassword (String password){
        return this.password;
    }
    // isi dari kelas
}
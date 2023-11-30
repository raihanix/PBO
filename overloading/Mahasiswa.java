/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javlat10;

/**
 *
 * @author PCL-B00-00
 */
public class Mahasiswa {
    private String nama;
    private String nim;
    private int usia;
    
    public Mahasiswa (String nama, String nim, int usia){
        this.nama = nama;
        this.nim = nim;
        this.usia = usia;
    }
    public String getNama(){
        return nama;
    }
    public String getNim(){
        return nim;
    }
    public int getUsia(){
        return usia;
    }
//    overloading
    public void tampilkanInformasi(String role){
        System.out.println(role + "- nama: " + nama + ", NIM: " + nim + ",Usia: " +usia);
    }
}

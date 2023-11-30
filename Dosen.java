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
public class Dosen {
    private String nama;
    private String nidn;
    private int usia;
    
        public Dosen(String nama, String nidn, int usia) { 
        this.nama = nama; 
        this.nidn = nidn; 
        this.usia = usia; 
    }
    public String getNama() { 
        return nama; 
    }
    public String getNidn() { 
        return nidn; 
    }
    public int getUsia() { 
        return usia; 
    }
    //Overloading 
    public void tampilkanInformasi(String role) { 
        System.out.println(role + " - Nama: " + nama + ", NIDN: " + nidn + ", Usia: " + usia); 
    }

}

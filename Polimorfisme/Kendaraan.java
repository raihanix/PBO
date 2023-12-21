/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfisme;

/**
 *
 * @author PCL-B00-00
 */
public class Kendaraan {
    protected String merek;
    protected String warna;
    
//    konstruktor dengan parameter
    public Kendaraan(String merek,String warna){
        this.merek = merek;
        this.warna = warna;
    }
//    metode tampilkanInfo yang akan di overriding oleh kelas turunan
    public void tampilkanInfo(){
        System.out.println("merek: "+merek);
        System.out.println("warna: "+warna);
        
    }
    
}

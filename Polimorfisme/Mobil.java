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
public class Mobil extends Kendaraan {
    private int jumlahPintu;
    
//    konstruktor dengan parameter
    public Mobil(String merek, String warna, int jumlahPintu){
        super (merek,warna);
        this.jumlahPintu = jumlahPintu;
    }
//    override metode tampilkan info
    @Override
    public void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("Jumlah Pintu: "+jumlahPintu);
    }
}

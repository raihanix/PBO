/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfisme.overloadingoverriding;

/**
 *
 * @author PCL-B00-00
 */
public class Manajer extends Pegawai {
    private double tunjangan;

// Overloading konstruktor dengan tambahan parameter tunjangan
    public Manajer(String nama, double gajiPokok, double tunjangan){
        super(nama, gajiPokok);
        this.tunjangan = tunjangan;
    }
    
    // override metode hitungGaji
    @Override
    public double hitungGaji(){
        // gaji manajer = gaji pokok + tunjangan
        return super.hitungGaji() + tunjangan;
    }    
    
// override metode tampilkanInfo
    @Override
    public void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("Tunjangan: "+ tunjangan);
    }
}

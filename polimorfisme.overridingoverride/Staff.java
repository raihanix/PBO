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
public class Staff extends Pegawai {
    private double bonus;
    
    // overloading konstruktor dengan tambahan parameter bonus
    public Staff(String nama, double gajiPokok, double bonus){
        super(nama,gajiPokok);
        this.bonus = bonus; 
    }
    // overriding metode hitungGaji
    @Override
    public double hitungGaji(){
        // gaji staff = gaji pokok + bonus
        return super.hitungGaji() + bonus;
    }
    // override metode tampilkanInfo
    @Override
    public void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("Bonus: " + bonus);
    }
}

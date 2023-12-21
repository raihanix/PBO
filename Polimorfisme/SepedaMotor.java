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
public class SepedaMotor extends Kendaraan {
    private boolean punyaTiang;
    
//    konstruktor dengan parameter
    public SepedaMotor(String merek, String warna, boolean punyaTiang){
        super(merek,warna);
        this.punyaTiang = punyaTiang;
    }
//    override metode tampilkan Info
    @Override
    public void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("Punya Tiang: "+(punyaTiang ? "Ya" : "Tidak"));
    }
}

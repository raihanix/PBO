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
class Pegawai {
    protected String nama;
    protected double gajiPokok;
    
    // konstruktor dengan parameter
    public Pegawai(String nama, double gajiPokok){
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }
    //metode pengajian yang akan di-overriding oleh kelas turunan
    public double hitungGaji(){
        return gajiPokok;
    }
    //Menampilkan informasi pegawai
    public void tampilkanInfo(){
        System.out.println("nama: "+ nama);
        System.out.println("gaji pokok: "+ gajiPokok);
    }
}

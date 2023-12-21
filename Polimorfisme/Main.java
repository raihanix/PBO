/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfisme;
import java.util.Scanner;
/**
 *
 * @author PCL-B00-00
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inp = new Scanner(System.in);
        
        System.out.println("input data mobil: ");
        System.out.print("merek: ");
        String merekMobil = inp.nextLine();
        System.out.print("warna: ");
        String warnaMobil = inp.nextLine();
        System.out.print("Jumlah Pintu: ");
        int jumlahPintuMobil = inp.nextInt();
        
//        membuat objek mobil menggunakan konstruktor overload 
        Mobil mobil = new Mobil(merekMobil,warnaMobil,jumlahPintuMobil);
        
        System.out.println("\nInput data Sepeda Motor:");
        inp.nextLine(); //membersihkan buffer
        System.out.print("merek: ");
        String merekMotor = inp.nextLine();
        System.out.print("warna: ");
        String warnaMotor = inp.nextLine();
        System.out.print("Punya Tiang (True/false): ");
        boolean punyaTiangMotor = inp.nextBoolean();
        
        // membuat objek SepedaMotor menggunakan konstruktor overload
        SepedaMotor sepedaMotor = new SepedaMotor (merekMotor,warnaMotor, punyaTiangMotor);
        
        //menampilkan informasi kendaraan (polimorfisme runtime)
        System.out.println("\nInformasi Mobil: ");
        mobil.tampilkanInfo();
        
        System.out.println("\nInformasi Sepeda Motor: ");
        sepedaMotor.tampilkanInfo();
    }
    
}

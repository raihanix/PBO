/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfisme.overloadingoverriding;

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
        
        System.out.println("Input data Staf: ");
        System.out.print("Nama: ");
        String namaStaf = inp.nextLine();
        System.out.print("Gaji Pokok: ");
        double gajiPokokStaf = inp.nextDouble();
        System.out.print("Bonus: ");
        double bonusStaf = inp.nextDouble();
        
        // Membuat objek staf menggunakan konstruktor overload
        Staff staff = new Staff(namaStaf, gajiPokokStaf, bonusStaf);
        
        System.out.println("\nInput data Manajer: ");
        System.out.print("Nama: ");
        inp.nextLine(); // membersihkan buffer
        String namaManajer = inp.nextLine();
        System.out.print("Gaji pokok: ");
        double gajiPokokManajer = inp.nextDouble();
        System.out.print("Tunjangan: ");
        double tunjanganManajer = inp.nextDouble();
        
        // membuat objek manajer menggunakan konstruktor overload
        Manajer manajer = new Manajer(namaManajer, gajiPokokManajer, tunjanganManajer);
        
        System.out.println("\nInformasi Staf: ");
        staff.tampilkanInfo();
        System.out.println("total gaji: "+ staff.hitungGaji());
        
        System.out.println("\ninformasi manajer: ");
        manajer.tampilkanInfo();
        System.out.println("total gaj: "+ manajer.hitungGaji());
    }
    
}

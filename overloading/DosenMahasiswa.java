/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javlat10;
import java.util.Scanner;
/**
 *
 * @author PCL-B00-00
 */
public class DosenMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        System.out.println("Input informasi Mahasiswa:"); 
        System.out.print("Nama Mahasiswa: "); 
        String namaMahasiswa = inp.nextLine(); 
        System.out.print("NIM Mahasiswa: "); 
        String nimMahasiswa = inp.nextLine(); 
        System.out.print("Usia Mahasiswa: "); 
        int usiaMahasiswa = inp.nextInt();
        
        // Membuat objek Mahasiswa 
        Mahasiswa mahasiswa = new Mahasiswa(namaMahasiswa, nimMahasiswa, usiaMahasiswa);
        
        //Input info dosen
        inp.nextLine();
        
         // Membersihkan newline di buffer 
        System.out.println("\nInput informasi Dosen:"); 
        System.out.print("Nama Dosen: "); 
        String namaDosen = inp.nextLine(); 
        System.out.print("NIDN Dosen: "); 
        String nidnDosen = inp.nextLine(); 
        System.out.print("Usia Dosen: "); 
        int usiaDosen = inp.nextInt();
        
        // Membuat objek Dosen 
        Dosen dosen = new Dosen(namaDosen, nidnDosen, usiaDosen);
        
        // Menampilkan informasi Mahasiswa dan Dosen 
        System.out.println("\nInformasi Mahasiswa:"); 
        System.out.println("Nama: " + mahasiswa.getNama()); 
        System.out.println("NIM: " + mahasiswa.getNim()); 
        System.out.println("Usia: " + mahasiswa.getUsia());
        
        System.out.println("\nInformasi Dosen:"); 
        System.out.println("Nama: " + dosen.getNama()); 
        System.out.println("NIDN: " + dosen.getNidn()); 
        System.out.println("Usia: " + dosen.getUsia());
        
        //Overloading 
        System.out.println("\nInformasi Mahasiswa (Format Alternatif):"); 
        mahasiswa.tampilkanInformasi("Mahasiswa"); 
        System.out.println("\nInformasi Dosen (Format Alternatif):"); 
        dosen.tampilkanInformasi("Dosen");
    }
    
}

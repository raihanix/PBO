/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pewarisan;
import java.util.Scanner;
//kelas anak yang mewarisi dari person
/**
 *
 * @author PCL-B00-00
 */
public class Student extends Person {
//    atribut kelas student
    String className;
    
//    Metode untuk mengambil data Student
    void inputStudentData(){
        Scanner inp = new Scanner (System.in);
        
//        memanggil metode inputPersonData ()dari kelas induk
        inputPersonData();
        System.out.print("masukkan nama kelas: ");
        className = inp.nextLine();
    }
//    Metode untuk menampilkan data lengkap student
    void displayStudentInfo(){
//        memanggil metode displaypersoninfo() dari kelas induk
    System.out.println("Kelas: " + className);
    }
}

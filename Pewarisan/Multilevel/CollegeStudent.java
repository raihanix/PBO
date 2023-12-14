/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multilevel;
import java.util.Scanner;
/**
 *
 * @author PCL-B00-00
 */
public class CollegeStudent extends Student {
//    Atribut kelas COllegeStudent
    String major;
    
//    metode untuk mengambil data CollegeStudent
    void inputCollegeStudentData(){
        Scanner inp = new Scanner (System.in);
        
//    memanggil metode inputStudentData()dari kelas induk
        inputStudentData();
        
        System.out.print("Masukkan jurusan: ");
        major = inp.nextLine();
    }
//    metode untuk menampilkan data collegestudent
    void displayCollegeStudentInfo(){
//        memanggil metode displayStudentInfo() dari kelas induk
    displayStudentInfo();
    System.out.println("Jurusan: "+major);
    }
}

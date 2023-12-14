/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multilevel;
import java.util.Scanner;
/**
 *
 * @author PCL-B00-00*/
// kelas anak pertama yang mewarisi dari person
public class Student extends Person{
//    atribut kelas student
    String className;
    
//    metode untuk mengambil ata Student
    void inputStudentData(){
        Scanner inp = new Scanner(System.in);
        
//       memanggil metode inputPersonData() dari kelas induk
        inputPersonData();
        System.out.print("Masukkan nama kelas: ");
        className = inp.nextLine();
    }
    void displayStudentInfo(){
//        memanggil metide displayPersonInfo() dari kelas induk
        displayPersonInfo();
        System.out.println("kelas: "+className);
    }
}

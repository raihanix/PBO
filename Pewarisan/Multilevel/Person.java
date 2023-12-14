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
//    kelas induk
public class Person {
    String name;
    int age;
    
//    metode untuk mengambil data Person
    void inputPersonData(){
        Scanner inp = new Scanner(System.in);
        System.out.print("Masukkan nama: ");
        name = inp.nextLine();
        System.out.print("Masukkan umur: ");
        age = inp.nextInt();
    }
//   metode untuk menampilkan data Person 
   void displayPersonInfo(){
       System.out.println("nama: "+name);
       System.out.println("umur: "+age);
   }
}

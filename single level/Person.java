/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pewarisan;
import java.util.Scanner;
/**
 *
 * @author PCL-B00-00
 */
//kelas induk
public class Person {
// Atribut kelas person
    String name;
    int age;
//    metode untuk mengambil data person
    void inputPersonData() {
        Scanner inp = new Scanner(System.in);
        
        System.out.print("Masukkan nama: ");
        name = inp.nextLine();
        System.out.print("Masukkan umur: ");
        age = inp.nextInt();
    }
//    Metode untuk menampilkan data person
    void displatPersonInfo(){
        System.out.println("Nama: " + name);
        System.out.println("Umur: " + age);
    }
}

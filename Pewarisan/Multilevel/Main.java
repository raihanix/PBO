/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multilevel;


public class Main {

  
    public static void main(String[] args) {
//    membuat objek CollegeStudent
        CollegeStudent collegeStudent = new CollegeStudent();
        
    //  memanggil metode inputCollegeStudentData()
    collegeStudent.inputCollegeStudentData();
    
    //  menampilkan informasi lengkap mahasiswa perguruan tinggi
    System.out.println("\nInformasi Mahasiswa Perguruan Tinggi:");
    collegeStudent.displayCollegeStudentInfo();
    }
    
}

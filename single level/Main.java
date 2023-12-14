package pewarisan;

/**
 *
 * @author PCL-B00-00
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // membuat objek student
        Student student = new Student();
    
//  memanggil metode inputStudentData()
        student.inputStudentData();
//        menampilkan informasi lengkap siswa menggunakan metode displayStudentInfo()
        System.out.println("\nInformasi Siswa: ");
        student.displayStudentInfo();
    }
}

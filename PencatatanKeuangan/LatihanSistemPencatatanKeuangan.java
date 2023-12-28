/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihansistempencatatankeuangan;

import java.util.Scanner;

/**
 *
 * @author NENENG FITRI S
 */
public class LatihanSistemPencatatanKeuangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SistemPencatatanKeuangan sistemPencatatanKeuangan = new SistemPencatatanKeuangan();
        Scanner inp =new Scanner(System.in);
        int pilihan;
        
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Tambah Transaksi Baru");
            System.out.println("2. Tampilkan Daftar Transaksi Berdasarkan Kategori");
            System.out.println("3. Tambah Kategori Transaksi Baru");
            System.out.println("4. Tampilkan Daftar Kategori Transaksi");
            System.out.println("5. Hitung Total Pemasukan dan Pengeluaran");
            System.out.println("6. Tampilkan Laporan Keuangan");
            
            System.out.println("0. Keluar");

            System.out.print("\nPilih Menu (0-6)\t:");

            pilihan = inp.nextInt();
            inp.nextLine(); // Konsumsi newline setelah nextInt()

            switch (pilihan) {
                case 1:
                    
                    System.out.print("Masukkan Tanggal Transaksi: ");
                    String tglTransaksi = inp.nextLine();
                    System.out.print("Masukkan Jumlah Transaksi: ");
                    double jumlah = inp.nextDouble();
                    inp.nextLine(); // Konsumsi newline setelah nextDouble()
                    System.out.print("Masukkan Keterangan Transaksi: ");
                    String keterangan = inp.nextLine();
                    System.out.print("Masukkan Kategori Transaksi: ");
                    String kategori = inp.nextLine();
                    System.out.print("Masukkan Tipe Transaksi (Pemasukan/Pengeluaran): ");
                    String tipe = inp.nextLine();

                    Transaksi transaksiBaru = new Transaksi(tglTransaksi, jumlah, keterangan, kategori, tipe);
                    sistemPencatatanKeuangan.transaksiBaru(transaksiBaru);
                    break;

                case 2:
                    System.out.print("Masukkan Nama Kategori: ");
                    String namaKategori = inp.nextLine();
                    sistemPencatatanKeuangan.tampilkanTransaksiBerdasarkanKategori(namaKategori);
                    break;

                case 3:
                    System.out.print("Masukkan Id Kategori: ");
                    String idKategori = inp.next();
                    inp.nextLine(); // Konsumsi newline setelah next()
                    System.out.print("Masukkan Nama Kategori: ");
                    String namaKategoriBaru = inp.nextLine();
                    System.out.print("Masukkan Tipe Kategori (Pemasukkan/Pengeluaran): ");
                    String tipeKategori = inp.next();

                    KategoriTransaksi kategoriBaru = new KategoriTransaksi(idKategori, namaKategoriBaru, tipeKategori);
                    sistemPencatatanKeuangan.kategoriBaru(kategoriBaru);
                    break;
                case 4 :
                    sistemPencatatanKeuangan.tampilkanDaftarKategoriTransaksi();
                    break;
                case 5 :
                    sistemPencatatanKeuangan.HitungPemasukanPengeluaran();
                    break;
                case 6 :
                    sistemPencatatanKeuangan.tampilkanLaporanKeuangan();
                    break;
                case 0:
                    System.out.println("Keluar dari program.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih kembali.");
            }
        } while (pilihan != 0);

        // Menutup scanner
        inp.close();
    }
}
            
            
            
            
       
    
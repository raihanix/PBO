/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihansistempencatatankeuangan;

import java.util.ArrayList;

/**
 *
 * @author NENENG FITRI S
 */
class SistemPencatatanKeuangan implements PencatatanKeuangan{
  private ArrayList<Transaksi> daftarTransaksi = new ArrayList<>();
  private ArrayList<KategoriTransaksi> daftarKategori = new ArrayList<>();

  @Override
  public void prosesPencatatan(){
      
  }
  
   public void transaksiBaru(Transaksi transaksiBaru) {
        daftarTransaksi.add(transaksiBaru);
        System.out.println("\nTransaksi berhasil ditambahkan!");
    }
   
   public void tampilkanTransaksiBerdasarkanKategori(String namaKategori) {
        System.out.println("\n===== DAFTAR TRANSAKSI PEMASUKAN =====");
        for (Transaksi transaksi : daftarTransaksi) {
            if (transaksi.getKategori().equals(namaKategori) && transaksi.getTipe().equals("Pemasukan")) {
            transaksi.tampilkanInfoTransaksi();
            }
        }

        System.out.println("\n===== DAFTAR TRANSAKSI PENGELUARAN =====");
        for (Transaksi transaksi : daftarTransaksi) {
             if (transaksi.getKategori().equals(namaKategori) && transaksi.getTipe().equals("Pengeluaran")) {
            transaksi.tampilkanInfoTransaksi();
            }
        }
    }
        public void kategoriBaru(KategoriTransaksi transaksiBaru) {
        daftarKategori.add(transaksiBaru);
        System.out.println("\nTransaksi berhasil ditambahkan!");
    }
       public void tampilkanDaftarKategoriTransaksi(){
           System.out.println("\n===== DAFTAR KATEGORI TRANSAKSI =====");
        for(KategoriTransaksi kategori : daftarKategori) {
            kategori.kategoriInfo();
        }
       } 
       
       public void HitungPemasukanPengeluaran() {
          double totalPemasukan = 0;
          double totalPengeluaran = 0;
        
        for(Transaksi transaksi : daftarTransaksi) {
            if (transaksi.getTipe().equals("Pemasukan")) {
                totalPemasukan += transaksi.getJumlah();
            } else {
                totalPengeluaran += transaksi.getJumlah();
            }
        }
        System.out.println("=====================================");
        System.out.println("\nTotal Pemasukan: " + totalPemasukan);
        System.out.println("Total Pengeluaran: " + totalPengeluaran);
        System.out.println("======================================");
        System.out.println();
        }
       
       public void tampilkanLaporanKeuangan() {
        System.out.println("\n===== LAPORAN KEUANGAN =====");
        for (Transaksi transaksi : daftarTransaksi) {
            transaksi.tampilkanInfoTransaksi();
        }
        }
        }
    
       
               
    



   



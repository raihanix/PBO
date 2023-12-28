/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihansistempencatatankeuangan;

/**
 *
 * @author NENENG FITRI S
 */
 class Transaksi {
    private static int counter = 1;
    private int idTransaksi;
    private String tglTransaksi;
    private double jumlah;
    private String keterangan;
    private String kategori;
    private String tipe;
  
  public Transaksi(String tglTransaksi, double jumlah, String keterangan, String kategori, String tipe) {
       this.idTransaksi  = counter++;
      this.tglTransaksi = tglTransaksi;
      this.jumlah = jumlah;
      this.keterangan = keterangan;
      this.kategori = kategori;
      this.tipe = tipe;
              
  }
   public double getJumlah() {
        return jumlah;
    }
    
    public String getKategori() {
        return kategori;
    }
    
    public String getTipe() {
        return tipe;
    }
    
    public void tampilkanInfoTransaksi() {
        System.out.println("\nID Transaksi: " + idTransaksi);
        System.out.println("Tanggal Transaksi: " + tglTransaksi);
        System.out.println("Jumlah Transaksi: " + jumlah);
        System.out.println("Keterangan Transaksi: " + keterangan);
        System.out.println();
    }
}
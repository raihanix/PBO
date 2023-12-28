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
class KategoriTransaksi {
   private String idKategori;
    private String namaKategori;
    private String tipeKategori;

    public KategoriTransaksi(String idKategori, String namaKategori, String tipeKategori) {
        this.idKategori = idKategori;
        this.namaKategori = namaKategori;
        this.tipeKategori = tipeKategori;
    }

   

    

    public String getIdKategori() {
        return idKategori;
    }

    public String getNamaKategori() {
        return namaKategori;
    }

    public String getTipeKategori() {
        return tipeKategori;
    }

    public void kategoriInfo() {
        System.out.println("\nID Kategori: " + idKategori);
        System.out.println("Nama Kategori: " + namaKategori);
        System.out.println("Tipe Kategori: " + tipeKategori);
    }
}
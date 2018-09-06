/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo_pasien;

/**
 *
 * @author acer
 */
public class klinik {

    public klinik() {
        /**
         *
         * @author acer membuat method (kosong) kelas klinik
         */

    }
    private String id_klinik, nama;

    /**
     *
     * @author acer mendeklarasikan variabel id_klinik dan nama dgn tipe data String dan bersifat private
     */
    public String getId_klinik() {
        /**
         *
         * @author acer membuat method getId_klinik()  yang bertujuan agar program dpt memanggil method tsb dikelas lain
         */
        return id_klinik;
    }

    public String getNama() {
        /**
         *
         * @author acer membuat method getNama()  yang bertujuan agar program dpt memanggil method tsb dikelas lain
         */
        return nama;
    }

    public void setId_klinik(String id_klinik) {
        /**
         *
         * @author acer membuat method setId_klinik dgn tipe data void,bertujuan agar anda dapat menginput method tsb dikelas lain
         * 
         */
        this.id_klinik = id_klinik;
        /**
         *
         * @author acer rhis berfungsi untuk menunjukkan bahwa 'ini' variabel yg diprivate
         */

    }

    public void setNama(String nama) {
        /**
         *
         * @author acer membuat method setNama dgn tipe data void, bertujuan
         * agar anda dapat menginput method tsb dikelas lain
         */
        this.nama = nama;

    }

}

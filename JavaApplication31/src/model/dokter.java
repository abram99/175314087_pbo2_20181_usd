/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ,,
 *
 * @author acer
 */
public class dokter {

    private String nomorPegawai, nama, alamat, tempatLahir;
    /**
     * ,,
     *
     * @author acer mendeklaraskan variabel nomorPegawai, nama, alamat, tempatLahir dgn tipe data string dan bersifat private
     */
    private int tanggalLahir, bulanLahir, tahunLahir;

    public dokter(String nomorPegawai, String nama, String alamat, String tempatLahir, int tanggalLahir, int bulanLahir, int tahunLahir) {
        this.nomorPegawai = nomorPegawai;
        this.nama = nama;
        this.alamat = alamat;
        this.tempatLahir = tempatLahir;
        this.tanggalLahir = tanggalLahir;
        this.bulanLahir = bulanLahir;
        this.tahunLahir = tahunLahir;
    }

    

    /**
     * ,,
     *
     * @author acer mendeklarasikan variabel tanggalLahir, bulanLahir, tahunLahir dgn tipe data int dan bersifat private
     */

    public dokter() {
        /**
         * ,,
         *
         * @author acer membuat method (kosong) dokter
         */

    }

    public void setNomorPegawai(String nomorPegawai) {
        /**
         * ,,
         *
         * @author acer membuat method setNomorPegawai dgn tipe data void, bertujuan agar anda dapat menginput method tsb dikelas lain
         */
        this.nomorPegawai = nomorPegawai;
        /**
 * ,,
 *
 * @author acer this berfungsi untuk menunjukkan bahwa 'ini' variabel yg diprivate
 */
        
    }

    public void setNama(String nama) {
        /**
         * ,,
         *
         * @author acer membuat method setNama dgn tipe data void, bertujuan agar anda dapat menginput method tsb dikelas lain
         */
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        /**
         * ,,
         *
         * @author acer membuat method setAlamat dgn tipe data void, bertujuan agar anda dapat menginput method tsb dikelas lain
         */
        this.alamat = alamat;
    }

    public void setTempatLahir(String tempatLahir) {
        /**
         * ,,
         *
         * @author acer membuat method setTempatLahir dgn tipe data void, bertujuan agar anda dapat menginput method tsb dikelas lain
         */
        this.tempatLahir = tempatLahir;
    }

    public void setTanggalLahir(int tanggalLahir) {
        /**
         * ,,
         *
         * @author acer membuat method setTanggalLahir dgn tipe data void, bertujuan agar anda dapat menginput method tsb dikelas lain
         */
        this.tanggalLahir = tanggalLahir;

    }

    public String getNomorPegawai() {
        /**
         * ,,
         *
         * @author acer membuat method getNomorPegawai() yang bertujuan agar program dpt memanggil method tsb dikelas lain
         */
        return nomorPegawai;
    }

    public String getNama() {
        /**
         * ,,
         *
         * @author acer membuat method yang bertujuan agar program dpt memanggil method tsb dikelas lain
         */
        return nama;
    }

    public String getAlamat() {
        /**
         * ,,
         *
         * @author acer membuat method getNama() yang bertujuan agar program dpt memanggil method tsb dikelas lain
         */
        return alamat;
    }

    public String getTempatLahir() {
        /**
         * ,,
         *
         * @author acer membuat method getTempatLahir() yang bertujuan agar program dpt memanggil method tsb dikelas lain
         */
        return tempatLahir;
    }

    public int getTanggalLahir() {
        /**
         * ,,
         *
         * @author acer membuat method getTanggalLahir() yang bertujuan agar program dpt memanggil method tsb dikelas lain
         */
        return tanggalLahir;
    }

    public int getBulanLahir() {
        /**
         * ,,
         *
         * @author acer membuat method getBulanLahir() yang bertujuan agar program dpt memanggil method tsb dikelas lain
         */
        return bulanLahir;
    }

    public int getTahunLahir() {
        /**
         * ,,
         *
         * @author acer membuat method getTahunLahir() yang bertujuan agar program dpt memanggil method tsb dikelas lain
         */
        return tahunLahir;
    }

    public void setBulanLahir(int bulanLahir) {
        /**
         * ,,
         *
         * @author acer membuat method setBulanLahir dgn tipe data void, bertujuan agar anda dapat menginput method tsb dikelas lain
         */
        this.bulanLahir = bulanLahir;
    }

    public void setTahunLahir(int tahunLahir) {
        /**
         * ,,
         *
         * @author acer membuat method setTahunLahir dgn tipe data void, bertujuan agar anda dapat menginput method tsb dikelas lain
         */
        this.tahunLahir = tahunLahir;
    }

    public void getKelahiran() {
        /**
         * ,,
         *
         * @author acer membuat method getKelahiran() yang bertujuan agar program dpt memanggil method tsb dikelas lain
         */
        Date tanggalKelahiran = new Date(getTahunLahir() - 1900, getBulanLahir() - 1, getTanggalLahir());
        /**
         * ,,
         *
         * @author acer rumus menghitung tanggal kelahiran sesuai ketentuan java
         */
        SimpleDateFormat ft = new SimpleDateFormat("ddMMyyyy");
        /**
         * ,,
         *
         * @author acer membuat format untuk menampilkan Kelahiran
         */
        System.out.println(ft.format(tanggalKelahiran));
        /**
         * ,,
         *
         * @author acer menampilkan tanggalKelahiran sesuai format yg ditentukan
         */

    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author acer
 */
public class pasien {

    private String noRekamMedis, nama, alamat, tempatLahir;
    /**
     *
     * @author acer Mendeklarasikan variabel noRekamMedis, nama, alamat,
     * tempatLahir dgn tipe dataString dan bersifat private
     */
    private int tanggalKelahiran, tanggalLahir, bulanLahir, tahunLahir;

    /**
     *
     * @author acer mendeklarasikan variabel dgn tipe data integer, dan variabel tsb bersifat private
     */
    public pasien() {
        /**
         *
         * @author acer membuat method (kosong) pasien 
         */
    }

    public void setTanggalLahir(int tanggalLahir) throws Exception {
        /**
         *
         * @author acer membuat method setTanggal lahir yg bertujuan agar anda dapat menginput setTanggalLahir dikelas lain, throw exception berfugsi sbg kata kunci, yang berarti kita dapat melempar Exception pd kondisi yg kita tentukan
         */
        if (tanggalLahir > 0 && tanggalLahir < 32) {
            /**
             *
             * @author acer jika tanggalLahir lebih dari 0 dan kurang dari 32 maka tanggal lahir yg anda input benar
             */
            this.tanggalLahir = tanggalLahir;
            

        } else {
            throw new Exception("tanggal lahir yang anda masukkan salah");
            /**
             *
             * @author acer sedangkan jika tanggal lahir yang anda masukkan tdk sesuai format tanggalLahir > 0 && tanggalLahir < 32 maka program akan menampilkan "tanggal lahir yang anda masukkan salah" di output
             */
        }
    }

    public void getTanggalKelahiran() {
        /**
         *
         * @author acer membuat method getTanggalKelahiran() yg bertujuan untuk agar anda dapat memanggil method getTanggalKelahiran() dikelas lain(main)
         */
        Date tanggalKelahiran = new Date(getTahunLahir() - 1900, getBulanLahir() - 1, getTanggalLahir());
        /**
         *
         * @author acer rumus menginput tahun lahir, bulan lahir, serta tanggal
         */
        SimpleDateFormat ft = new SimpleDateFormat("ddMMyyyy");
        /**
         *
         * @author acer membuat format untuk menampilkan tanggal kelahiran
         */
        System.out.println(ft.format(tanggalKelahiran));
        /**
         *
         * @author acer menmpilkan tanggalKelahiran sesuai format yg ditentukan
         */

    }

    public void setBulanLahir(int bulanLahir) throws Exception {
        /**
         *
         * @author acer membuat method setBulan lahir bertipe data void yg bertujuan agar anda dpt menginput bulanlahir di kelas lain(main),  throw exception berfugsi sbg kata kunci, yang berarti kita dapat melempar Exception pd kondisi yg kita tentukan
         */
        if (bulanLahir > 0 && bulanLahir < 13) {
            this.bulanLahir = bulanLahir;
            /**
             *
             * @author acer jika bulan lahir yang anda input > 0 dan < 13 maka data yg anda masukkan benar
             */
        } else {
            throw new Exception("bulan lahir yang anda masukkan salah");
            /**
             *
             * @author acer sedangkan jika data yg anda masukkan tidak sesuai format bulanLahir > 0 && bulanLahir < 13, maka program akan menampilkan "bulan lahir yang anda masukkan salah" di output
             */

        }
    }

    public void setTahunLahir(int tahunLahir) throws Exception {
        /**
         *
         * @author acer membuat method setTahunLahir dgn tipe data void dan dgn parameter int tahunlahir, throw exception berfugsi sbg kata kunci, yang berarti kita dapat melempar Exception pd kondisi yg kita tentukan
         */
        if (tahunLahir > 0) {
            this.tahunLahir = tahunLahir;
            /**
             *
             * @author acer jika tahun lahir yang anda masukkan lebih dari 0 maka data yg anda masukkan benar
             */
        } else {
            throw new Exception("tahun lahir yang anda masukkan salah");
            /**
             *
             * @author acer sedangkan jika tahun lahir yg anda masukan <=0 maka program akan menampilkan kalimat "tahun lahir yang anda masukkan salah" di output
             */
        }

    }

    public void setNama(String nama) {
        this.nama = nama;
        /**
         *
         * @author acer membuat method setNama dgn tipe data void, bertujuan agar anda dapat menginput nama dikelas lain(main)
         */
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
        /**
         *
         * @author acer membuat method setAlamat dgn tipe data void, bertujuan agar anda dapat menginput alamat dikelas lain(main)
         */
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
        /**
         *
         * @author acer membuat method setTempatLahir dgn tipe data void, bertujuan agar anda dapat menginput tempatlahir dikelas lain(main)
         */
    }

    public String NoRekamMedis() {
        String noRekamMedis;
        // membuat objek baru date dengan tipe data Date
        Date date = new Date();
        // membuat objek ft bertipe simpleDateFormat sebagai format tampilan tanggal
        SimpleDateFormat ft = new SimpleDateFormat("yyyMMdd");
        //mendeklarasikan nilai dari variabel nomorRekamMedis yaitu tanggal ditambah 3 huruf pertama dari nama
        noRekamMedis = ft.format(date) + nama.substring(0, 3);
        //pengembalian nilai variabel nomorRekamMedis
        return noRekamMedis;
    }

    public String getNoRekamMedis() {
        /**
         *
         * @author acer membuat method getNoRekamMedis() yg bertujuan agar anda dpt memanggil method getNoRekamMedis() untuk ditampilkan di output
         */
        return noRekamMedis;
        /**
         *
         * @author acer memanggil obj noRekamMedis
         */

    }

    public String getNama() {
        /**
         *
         * @author acer membuat method getNama() yg bertujuan agar anda dpt memanggil method getNama() untuk ditampilkan di output
         */
        return nama;
        /**
         *
         * @author acer memanggil obj nama
         */
    }

    public String getAlamat() {
        /**
         *
         * @author acer membuat method getAlamat() yg bertujuan agar anda dpt memanggil method getAlamat() untuk ditampilkan di output
         */
        return alamat;
        /**
         *
         * @author acer memanggil bj alamat
         */
    }

    public String getTempatLahir() {
        /**
         *
         * @author acer membuat method getTempatLahir() yg bertujuan agar anda dpt memanggil method getTempatLahir() untuk ditampilkan di output
         */
        return tempatLahir;
        /**
         *
         * @author acer memanggil obj tempatlahir
         */
    }

    public int getTanggalLahir() {
        /**
         *
         * @author acer membuat method getTanggalLahir() yg bertujuan agar anda dpt memanggil method getTanggalLahir() untuk ditampilkan di output
         */
        return tanggalLahir;
        /**
         *
         * @author acer memanggil obj tanggalahir
         */
    }

    public int getBulanLahir() {
        /**
         *
         * @author acer membuat method getBulanLahir() yg bertujuan agar anda dpt memanggil method getBulanLahir() untuk ditampilkan di output
         */
        return bulanLahir; 
        /**
         *
         * @author acer memanggil obj bulanLahir
         */
    }

    public int getTahunLahir() {
        /**
         *
         * @author acer membuat method getTahunLahir() yg bertujuan agar anda dpt memanggil method getTahunLahir() untuk ditampilkan di output
         */
        return tahunLahir;
        /**
         *
         * @author acer memanggil obj tahunlahir
         */
    }

}

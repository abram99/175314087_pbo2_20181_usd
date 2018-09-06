/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo_pasien;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author jarkom
 */
public class antrianPasien {

    public antrianPasien() {
        /**
         *
         * @author jarkom membuat method kosong
         */
    }

    private klinik Klinik;
    /** mendeklarasika variabel klinik dgn tipe data Klinik
     * 
     * @author jarkom
     */
    private ArrayList<pasien> daftar_pasien = new ArrayList<pasien>();

    /**
     *
     * @author jarkom
     */

    public void setKlinik(klinik Klinik) {
        /**
         *
         * @author jarkom membuat method setKlinik dgn tipe data void,bertujuan agar anda dapat menginput method tsb dikelas lain
         */
        this.Klinik = Klinik;
        /**
         *
         * @author jarkom
         */
    }

    public void setDaftar_pasien(ArrayList<pasien> daftar_pasien) {
        /**
         *
         * @author jarkom membuat method setDaftar_pasien dgn tipe data void,bertujuan agar anda dapat menginput method tsb dikelas lain
         */
        this.daftar_pasien = daftar_pasien;
    }

    public klinik getKlinik() {
        /**
         *
         * @author jarkom membuat method getKlinik()  yang bertujuan agar program dpt memanggil method tsb dikelas lain
         */
        return Klinik;
    }

    public ArrayList<pasien> getDaftar_pasien() {
        /**
         *
         * @author jarkom membuat method getDaftar_pasien() Dgn menggunakan ArrayList yg berisikan obj pasien  yang bertujuan agar program dpt memanggil method tsb dikelas lain
         */
        return daftar_pasien;
    }

    public void tanggal_antrian() {

        Date date = new Date();
        /**
         *
         * @author jarkom Membuat objek baru date dgn tipe data Date
         */
        SimpleDateFormat ft = new SimpleDateFormat("dd-MM-yy");
        /**
         *
         * @author jarkom membuat format tanggal_antrian yg akan ditampilkan
         */
        System.out.println(ft.format(date));
        /**
         *
         * @author jarkom menampilkan date dgn format yg telah ditentukan
         */
    }

    public void mendaftar(pasien Pasien) {
        /**
         *
         * @author jarkom membuat method mendaftar yg bertujuan untuk menetapkan obj daftar_pasien pd obj Pasien
         */
        daftar_pasien.add(Pasien);

    }

}

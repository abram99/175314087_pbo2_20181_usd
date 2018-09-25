/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author acer
 */
public class antrianKlinik {

    private int tanggal_antri, bulan_antri, tahun_antri;
    private klinik Klinik;

    private ArrayList<pasien> daftar_pasien_antri = new ArrayList<pasien>();
    public static ArrayList<antrianKlinik> daftar_antrian = new ArrayList<antrianKlinik>();

    public antrianKlinik() {

    }

    public antrianKlinik(int tanggal, int bulan, int tahun, klinik Klinik) {
        this.tanggal_antri = tanggal;
        this.bulan_antri = bulan;
        this.tahun_antri = tahun;
        this.Klinik = Klinik;
    }

    public void setTanggal_antri(int tanggal_antri) {
        this.tanggal_antri = tanggal_antri;
    }

    public void setBulan_antri(int bulan_antri) {
        this.bulan_antri = bulan_antri;
    }

    public void setTahun_antri(int tahun_antri) {
        this.tahun_antri = tahun_antri;
    }

    public void setKlinik(klinik Klinik) {
        this.Klinik = Klinik;
    }

    public int getTanggal_antri() {
        return tanggal_antri;
    }

    public int getBulan_antri() {
        return bulan_antri;
    }

    public int getTahun_antri() {
        return tahun_antri;
    }

    public klinik getKlinik() {
        return Klinik;
    }

    public ArrayList<pasien> getDaftarPasien() {

        return daftar_pasien_antri;
    }

    public void setDaftarPasien(ArrayList<pasien> daftarPasien) {

        this.daftar_pasien_antri = daftarPasien;
    }

    public void Tanggal_antri() {

        Date date = new Date();

        SimpleDateFormat ft = new SimpleDateFormat("E dd/MM/yyy 'at' hh:mm:ss");

        System.out.println(ft.format(date));
    }

    public void Mendaftar(pasien Pasien) {
        daftar_pasien_antri.add(Pasien);
    }

    public static void daftarPasien(pasien Pasien, int tanggal, int bulan, int tahun, klinik Klinik) {
        if (cariAntrian(tanggal, bulan, tahun, Klinik) < 0) {
            antrianKlinik.daftar_antrian.get(cariAntrian(tanggal, bulan, tahun, Klinik)).Mendaftar(Pasien);

        } else {
            antrianKlinik antrian = new antrianKlinik();
            antrian.setTanggal_antri(tanggal);
            antrian.setBulan_antri(bulan);
            antrian.setTahun_antri(tahun);
            antrian.setKlinik(Klinik);
            daftar_antrian.add(antrian);
        }
    }

    public static pasien CariPasien(String noRM) {
        for (int i = 0; i < daftar_antrian.size(); i++) {
            if (daftar_antrian.get(i).getDaftarPasien().get(i).getNoRekamMedis().equalsIgnoreCase(noRM)) {
                return daftar_antrian.get(i).getDaftarPasien().get(i);
            }
        }
        return null;
    }

    public static void buatAntrian(int tanggal, int bulan, int tahun, klinik Klinik) {
        antrianKlinik antrian = new antrianKlinik();
        antrian.setTanggal_antri(tanggal);
        antrian.setBulan_antri(bulan);
        antrian.setTahun_antri(tahun);
        antrian.setKlinik(Klinik);
        // cari antrian dalam list daftar antri
        if (cariAntrian(tanggal, bulan, tahun, Klinik) < 0) {
            // tambah dalam list antrian
            daftar_antrian.add(antrian);
        } else {
            System.out.println("Antrian " + Klinik.getNama() + " Sudah Ada");
        }
    }

    public static int cariAntrian(int tanggal, int bulan, int tahun, klinik Klinik) {
        for (int i = 0; i < daftar_antrian.size(); i++) {
            if (daftar_antrian.get(i).getTanggal_antri() == tanggal
                    && daftar_antrian.get(i).getBulan_antri() == bulan
                    && daftar_antrian.get(i).getTahun_antri() == tahun
                    && daftar_antrian.get(i).getKlinik().getNama().equalsIgnoreCase(Klinik.getNama())
                    && daftar_antrian.get(i).getKlinik().getId_klinik().equalsIgnoreCase(Klinik.getId_klinik())) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return String.valueOf(tahun_antri)
                + String.valueOf(bulan_antri)
                + String.valueOf(tanggal_antri)
                + Klinik.getId_klinik() + Klinik.getNama();
    }

}

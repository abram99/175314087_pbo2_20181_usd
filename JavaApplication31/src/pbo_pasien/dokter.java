/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo_pasien;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author acer
 */
public class dokter {
private String nomorPegawai, nama,alamat, tempatLahir;
private int tanggalLahir, bulanLahir, tahunLahir;

    public dokter(){
        
    }
    public void setNomorPegawai(String nomorPegawai) {
        this.nomorPegawai = nomorPegawai;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public void setTanggalLahir(int tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    
    }

    public String getNomorPegawai() {
        return nomorPegawai;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getTempatLahir() {
        return tempatLahir;
    }

    public int getTanggalLahir() {
        return tanggalLahir;
    }

    public int getBulanLahir() {
        return bulanLahir;
    }

    public int getTahunLahir() {
        return tahunLahir;
    }

    public void setBulanLahir(int bulanLahir) {
        this.bulanLahir = bulanLahir;
    }

    public void setTahunLahir(int tahunLahir) {
        this.tahunLahir = tahunLahir;
    }
    
     public void getKelahiran() {
        Date tanggalKelahiran = new Date(getTahunLahir () - 1900, getBulanLahir () - 1, getTanggalLahir());
        SimpleDateFormat ft = new SimpleDateFormat("ddMMyyyy");
        System.out.println(ft.format(tanggalKelahiran));

}
}
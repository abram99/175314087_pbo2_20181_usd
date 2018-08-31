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
public class pasien {

    private String noRekamMedis, nama, alamat, tempatLahir;
    private int tanggalKelahiran, tanggalLahir, bulanLahir, tahunLahir;

    /**
     *
     * @param tanggalLahir
     * @throws java.lang.Exception
     */
    
    public pasien (){
        
    }
    public void setTanggalLahir(int tanggalLahir) throws Exception {

        if (tanggalLahir > 0 && tanggalLahir < 32) {
            this.tanggalLahir = tanggalLahir;
        } else {
            throw new Exception("tanggal lahir yang anda masukkan salah");
        }
    }
    
    
    public void getTanggalKelahiran() {
        Date tanggalKelahiran = new Date(getTahunLahir () - 1900, getBulanLahir () - 1, getTanggalLahir());
        SimpleDateFormat ft = new SimpleDateFormat("ddMMyyyy");
        System.out.println(ft.format(tanggalKelahiran));
       
    }

    public void setBulanLahir(int bulanLahir) throws Exception {
        if (bulanLahir > 0 && bulanLahir <13){
            this.bulanLahir = bulanLahir;  
        } else {
            throw new Exception("bulan lahir yang anda masukkan salah");
            
            
        }
    }
    public void setTahunLahir(int tahunLahir) throws Exception {
        if(tahunLahir > 0 ){
        this.tahunLahir = tahunLahir;    
        }else{
        throw new Exception ("tahun lahir yang anda masukkan salah");
    }
        
    }
    public void getKode(){
        Date date = new Date(getTahunLahir () - 1900, getBulanLahir () - 1, getTanggalLahir());
        SimpleDateFormat ft = new SimpleDateFormat("ddMMyyyy");
        System.out.println(ft.format(date));
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

    public void setNoRekamMedis(String noRekamMedis) {
        
        this.noRekamMedis = noRekamMedis;

    }

    public String getNoRekamMedis() {
        return noRekamMedis;
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
    
  

      
        }
    





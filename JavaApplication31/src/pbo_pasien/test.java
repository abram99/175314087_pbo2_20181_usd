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
public class test {
    public static void main(String[] args) throws Exception {
        pasien abram = new pasien();
        dokter dok = new dokter();
        
        abram.setNama("ABRAM");
        abram.setAlamat("KUTAI BARAT");
        abram.setTempatLahir("DAMAI");
        
        dok.setNama("DOKTER RIA");
        dok.setNomorPegawai("175314087");
        dok.setAlamat("BARONG TONGKOK");
        dok.setTempatLahir("YOGYAKARTA");
        
        System.out.println("DATA PASIEN ");
        System.out.println("NAMA                : " + abram.getNama());
        System.out.print("NO REKAM MEDIS      : " );
        try{
            abram.setTahunLahir(1999);
            abram.setBulanLahir(9);
            abram.setTanggalLahir(27);
            abram.setNoRekamMedis("ABR");
            abram.getKode();
//            System.out.print("NO REKAM MEDIS : " );
            System.out.print(abram.getNoRekamMedis());
            System.out.println("");
            System.out.print("TANGGAL KELAHIRAN   : ");
            abram.getTanggalKelahiran();
            System.out.println("ALAMAT              : " + abram.getAlamat());
            System.out.println("TEMPAT LAHIR        : " + abram.getTempatLahir());
            System.out.println("====================================================");
        }catch (Exception ex){
            System.out.println(ex);
            
        }
        System.out.println("DATA DOKTER");
        System.out.println("NAMA                : " + dok.getNama());
        System.out.println("NO PEGAWAI          : " + dok.getNomorPegawai());
        System.out.println("ALAMAT              : " + dok.getAlamat());
        try {
            dok.setTanggalLahir(7);
            dok.setBulanLahir(7);
            dok.setTahunLahir(1999);
            System.out.print("TANGGAL LAHIR       : " );
            dok.getKelahiran();
        }catch (Exception ex){
            System.out.println(ex);
        }
        
        
        
        
        
        
    }
    
}

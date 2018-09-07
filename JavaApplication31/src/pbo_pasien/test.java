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

 pasien pasien1 = new pasien();
 pasien pasien2 = new pasien();
 dokter dok = new dokter("175314087", "BOYKE","KUBAR","DAMAI",27,10,1999);
 antrianPasien antri = new antrianPasien();
 klinik kl = new klinik();
 try{
     pasien1.setNama("MUCHA");
     pasien1.setTempatLahir("MAKASSAR");
     pasien1.setTanggalLahir(27);
     pasien1.setBulanLahir(9);
     pasien1.setTahunLahir(1994);
     pasien1.setAlamat("BONE_BONE");
     
     pasien2.setNama("RENSU");
     pasien2.setTempatLahir("PAKEM");
     pasien2.setTanggalLahir(7);
     pasien2.setBulanLahir(7);
     pasien2.setTahunLahir(1999);
     pasien2.setAlamat("BUSUR");
     
     antri.mendaftar(pasien1);
     antri.mendaftar(pasien2);
     antri.setKlinik(kl);
     
     kl.setId_klinik("KLK21");
     kl.setNama("KLINIK PURAI NGERIMAN");
 
 }catch (Exception ex){
     System.out.println(ex);
 }
        System.out.println(antri.getKlinik().getNama());  
        System.out.println("ID KLINIK : " + antri.getKlinik().getId_klinik());
        System.out.println("");
        
        for (int i = 0; i < antri.getDaftar_pasien().size(); i++) {
            antri.tanggal_antrian();
            System.out.println("PASIEN NO URUT KE- " + (i+1) + " : " + antri.getDaftar_pasien().get(i).getNama());
            System.out.println(" ");
            System.out.println("DATA PASIEN");
            System.out.println("=================================");
            System.out.println("NAMA PASIEN \t : " + antri.getDaftar_pasien().get(i).getNama());
            System.out.println("TEMPAT LAHIR \t : " + antri.getDaftar_pasien().get(i).getTempatLahir());
            System.out.print("TANGGAL LAHIR  \t : ");
            antri.getDaftar_pasien().get(i).getTanggalKelahiran();
            System.out.println("ALAMAT  \t : " + antri.getDaftar_pasien().get(i).getAlamat());
            System.out.println("NO REKAM MEDIS\t : " + antri.getDaftar_pasien().get(i).NoRekamMedis());
            System.out.println("");
            System.out.println("DATA DOKTER");
            System.out.println("=================================");
            System.out.println("NAMA DOKTER \t : " + dok.getNama());
            System.out.println("NOMOR PEGAWAI \t : "+ dok.getNomorPegawai());
            System.out.println("TEMPAT LAHIR \t : " + dok.getTempatLahir());
            System.out.print("TANGGAL LAHIR \t : ");
            dok.getKelahiran();
            System.out.println("ALAMAT DOKTER \t : " + dok.getAlamat());
            System.out.println("");
            
            
            
            
        }
        
        
        
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.logging.Level;
import model.antrianKlinik;
import model.klinik;
import model.pasien;

/**
 *
 * @author acer
 */
public class test_antrian_pasien {

    public static void main(String[] args) {

        antrianKlinik.buatAntrian(26, 8, 2018, new klinik("001", "Gigi"));
        antrianKlinik.buatAntrian(26, 8, 2018, new klinik("002", "Mata"));

        for (int i = 0; i < antrianKlinik.daftar_antrian.size(); i++) {
            System.out.println(antrianKlinik.daftar_antrian.get(i).getKlinik().getNama());

        }
        System.out.println("\n");
        pasien pasien1 = new pasien();
        pasien1.setNama("abram");
        pasien1.setAlamat("damai");

        pasien pasien2 = new pasien();
        pasien2.setNama("puspa");
        pasien2.setAlamat("klaten");

        int index = antrianKlinik.cariAntrian(26, 8, 2018, new klinik("002", "Mata"));
        if (index >= 0) {
            antrianKlinik.daftar_antrian.get(index).Mendaftar(pasien1);
            antrianKlinik.daftar_antrian.get(index).Mendaftar(pasien2);
        }
        for (int i = 0; i < antrianKlinik.daftar_antrian.get(index).getDaftarPasien().size(); i++) {
            System.out.println(antrianKlinik.daftar_antrian.get(index).getDaftarPasien().get(i).getNama());

        }
    }
}

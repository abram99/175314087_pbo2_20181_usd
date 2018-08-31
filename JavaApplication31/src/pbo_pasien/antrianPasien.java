/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo_pasien;

/**
 *
 * @author jarkom
 */
public class antrianPasien {

    private int nomorAntrian = 0;

    private final int jumlah_maksimal_pasien = 50;
    private pasien[] daftarPasien = new pasien[jumlah_maksimal_pasien];

    public void mendaftar(pasien abram) throws Exception {
        if (nomorAntrian < jumlah_maksimal_pasien) {
            daftarPasien[nomorAntrian] = abram;
            nomorAntrian++;
        } else {
            throw new Exception("antrian penuh");

        }
    }

}

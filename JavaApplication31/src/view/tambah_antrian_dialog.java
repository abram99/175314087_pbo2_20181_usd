/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.pasien;

/**
 *
 * @author acer
 */
public class tambah_antrian_dialog extends JDialog implements ActionListener {
    private JLabel judul, nama, no_rekam_medis,alamat;
    private JTextField nama_text, no_rm, alamat_text;
    private JButton simpan;
    
    public tambah_antrian_dialog(){
        init();
    }
    public void init(){
        this.setLayout(null);
        judul = new JLabel("Form Tambah Antrian");
        judul.setBounds(180, 30, 250, 20);
        this.add(judul);
        
        no_rekam_medis = new JLabel ("No Rekam Medis");
        no_rekam_medis.setBounds(20, 60, 100, 30);
        this.add(no_rekam_medis);
        
        no_rm = new JTextField();
        no_rm.setBounds(80, 60, 100, 30);
        this.add(no_rm);
        no_rm.addActionListener(this);
        
        nama = new JLabel ("Nama");
        nama.setBounds(20, 100, 100, 30);
        this.add(nama);
        
        nama_text = new JTextField();
        nama_text.setBounds(80, 100,100,30);
        this.add(nama_text);
        nama_text.addActionListener(this);
        
        alamat = new JLabel("Alamat");
        alamat.setBounds(20,140,100,30);
        this.add(alamat);
        
        alamat_text = new JTextField();
        alamat_text.setBounds(80, 140, 100, 30);
        this.add(alamat_text);
        
        simpan = new JButton("Simpan");
        simpan.setBounds(20, 180, 100, 30);
        this.add(simpan);
        simpan.addActionListener(this);
        
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()== no_rm) {
            if (pasien.cariPasien(no_rm.getText()) != null) {
                nama_text.setText(pasien.cariPasien(no_rm.getText()).getNama());
                alamat_text.setText(pasien.cariPasien(no_rm.getText()).getAlamat());
            }else{
                JOptionPane.showMessageDialog(null, "Nomor rekam medis : " + no_rm.getText() + " tidak ditemukan");
                
                
            }
            
                
            }
        if (e.getSource()== simpan) {
            pasien cari = pasien.cariPasien(no_rm.getText());
            for (int i = 0; i < pasien.daftarPasien.size(); i++) {
                JOptionPane.showMessageDialog(null, "Nama Antrian : " + (i+1));
                this.dispose();
                
            }
                    
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.*;

/**
 *
 * @author jarkom
 */
public class daftarAntrianDialog extends JDialog {

    private JLabel judul_label;
    private JLabel nama_label,alamat_label;
    private JTextField namaText, alamatText;
    private JButton saveButton;

    public daftarAntrianDialog(String judul) {
        this.setTitle(judul);
        init();
//        text();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    

    public void init() {
        this.setLayout(null);
        
        judul_label = new JLabel("FORM DAFTAR ANTRIAN");
        judul_label.setBounds(180, 30,250,20);
        this.add(judul_label);
        
        nama_label = new JLabel ("NAMA");
        nama_label.setBounds(20,100,50,30);
        this.add(nama_label);
        
        namaText = new JTextField ();
        namaText.setBounds(80,100,100,30);
//        namaText.setSize(100, 30);
        this.add(namaText);
        
        
        alamat_label = new JLabel ("ALAMAT");
        alamat_label.setBounds(20,140,100,30);
        this.add(alamat_label);
        
        alamatText = new JTextField ();
        alamatText.setBounds(80,140,100,30);
//        namaText.setSize(100, 30);
        this.add(alamatText);
        
        saveButton  = new JButton ("Simpan");
        saveButton.setBounds(80,180,100,30);
//        saveButton.setSize(100, 20);
        this.add(saveButton);
        
        
    }
    
    
        
        
        
        
    }
    


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import model.pasien;

/**
 *
 * @author acer
 */
public class tambah_pasien_baru_dialog extends JDialog implements ActionListener {

    private JLabel judul, nama_label,no_rm, alamat, jenis_kelamin, tanggal_lahir, bulan_lahir, tahun_lahir;
    private JTextField nama, no_rekam_medis, alamat_text;
    private JButton simpan;
    private JRadioButton pria, perempuan;
    private ButtonGroup group_button;
    private JComboBox tanggal_CB, bulan_CB, tahun_CB;

    private String tanggal_larik[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9",
        "10", "11", "12", "13", "14", "15", "16", "17", "18",
        "19", "20", "21", "22", "23", "24", "25", "26", "27",
        "28", "29", "30", "31"};

    private String bulan_larik[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9","10", "11", "12"};
    
    private String tahun_larik[]= {"1960","1961","1962","1963","1964","1965","1966","1967","1968","1969","1970", "1971", "1972", "1973", "1974", "1975",
        "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985",
        "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994",
        "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018"};
    
    public tambah_pasien_baru_dialog (){
        init();
        
    }
    public void init(){
        this.setLayout(null);
        
        judul = new JLabel("Form Tambah Pasien");
        judul.setBounds(140,10,200,20);
        this.add(judul);
        
        no_rm = new JLabel("NIK");
        no_rm.setBounds(20,50,100,50);
        this.add(no_rm);
        
        no_rekam_medis = new JTextField();
        no_rekam_medis.setBounds(120,65,200,20);
        this.add(no_rekam_medis);
    
         nama_label = new JLabel("Nama");
        nama_label.setBounds(20,90,100,50);
        this.add(nama_label);
        
        nama = new JTextField();
        nama.setBounds(120,105,200,20);
        this.add(nama);
        
        alamat = new JLabel ("Alamat");
        alamat.setBounds(20, 130,100,50);
        this.add(alamat);
        
        alamat_text = new JTextField();
        alamat_text.setBounds(120,145,200,20);
        this.add(alamat_text);
        
        
        jenis_kelamin = new JLabel ("Jenis Kelamin");
        jenis_kelamin.setBounds(20,165,100,50);
        this.add(jenis_kelamin);
        
        pria = new JRadioButton ("Pria", true);
        pria.setBounds(120,180,50,20);
        this.add(pria);
        
        perempuan = new JRadioButton ("Perempuan", false);
        perempuan.setBounds(120,200,120,20);
        this.add(perempuan);
        
        group_button = new ButtonGroup();
        group_button.add(pria);
        group_button.add(perempuan);
        
        tanggal_lahir = new JLabel("Tanggal");
        tanggal_lahir.setBounds(20,230,80,20);
        this.add(tanggal_lahir);
        
        tanggal_CB = new JComboBox(tanggal_larik);
        tanggal_CB.setBounds(75,230,40,20);
        this.add(tanggal_CB);
        
        bulan_lahir = new JLabel ("Bulan");
        bulan_lahir.setBounds(120,230,80,20);
        this.add(bulan_lahir);
        
        bulan_CB = new JComboBox(bulan_larik);
        bulan_CB.setBounds(160,230,40,20);
        this.add(bulan_CB);
        
        tahun_lahir = new JLabel("Tahun");
        tahun_lahir.setBounds(210,230,80,20);
        this.add(tahun_lahir);
        
        tahun_CB = new JComboBox(tahun_larik);
        tahun_CB.setBounds(250, 230, 90, 20);
        this.add(tahun_CB);
        
        simpan = new JButton("Simpan");
        simpan.setBounds(140, 300, 100, 30);
        this.add(simpan);
        simpan.addActionListener(this);
        
        
        
                
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()== simpan) {
            pasien daftar = new pasien ();
            daftar.setNama(nama.getText());
            daftar.setAlamat(alamat_text.getText());
            daftar.setNoRekamMedis(no_rekam_medis.getText());
            pasien.tambahPasienBaru(daftar);
            JOptionPane.showMessageDialog(null, nama.getText() + " Anda terdaftar");
            this.dispose();
            
            
            
            
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author acer
 */
public class main_frame extends JFrame implements ActionListener {

    private JMenuBar menu_bar;
    private JMenu menu;
    private JMenuItem keluar;
    private JMenuItem tambah_pasien;
    private JMenuItem tambah_antrian;

    public main_frame() {
        init();
    }

    public void init() {
        menu_bar = new JMenuBar();
        menu = new JMenu("file");

        menu_bar.add(menu);
        this.setJMenuBar(menu_bar);

        keluar = new JMenuItem("keluar");
        menu.add(keluar);
        keluar.addActionListener(this);

        tambah_pasien = new JMenuItem("Tambah pasien baru");
        menu.add(tambah_pasien);
        tambah_pasien.addActionListener(this);

        tambah_antrian = new JMenuItem("Tambah antrian");
        menu.add(tambah_antrian);
        tambah_antrian.addActionListener(this);

        menu_bar.add(menu);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == keluar) {
            System.exit(0);
        }
        if (e.getSource() == tambah_pasien) {
            tambah_pasien_baru_dialog view = new tambah_pasien_baru_dialog();
            view.setSize(500, 500);
            view.setVisible(true);
//        }
//        if (e.getSource() == tambah_antrian) {
//            tambah_antrian_dialog view = new tambah_antrian_dialog();
//            view.setSize(500, 500);
//            view.setVisible(true);

        }

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul.pkg6;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ferdi-07079
 */
    
public class gui extends komponen{
    

    public gui(){
        
        label.setBounds(40, 20, 500, 40);
        label.setFont(new Font("Consolas", Font.BOLD,30));
        
        soal.setBounds(80, 50, 200, 30);
        soal.setFont(new Font("Consolas",Font.BOLD,17));
        
        ja.setBounds(80, 180, 200, 30);
        ja.setFont(new Font ("Consolas",Font.BOLD,17));
        
        jb.setBounds(80, 220, 200, 30);
        jb.setFont(new Font("Consolas",Font.BOLD,17));
        
        jc.setBounds(80, 260, 200, 30);
        jc.setFont(new Font("Consolas",Font.BOLD,17));
        
        jd.setBounds(80, 300, 200, 30);
        jd.setFont(new Font("Consolas",Font.BOLD,17));
        
        ujian.setBounds(80, 340, 200, 30);
        ujian.setFont(new Font("Consolas",Font.BOLD,17));
        
//        beratkg.setBounds(270, 200, 50, 30);
//        beratkg.setFont(new Font("Consolas",Font.BOLD,17));
        
//        total.setBounds(20, 250, 150, 25);
//        total.setBackground(new Color(2,200,255));
//        total.addActionListener(new ActionListener(){
//            @Override
//            public void actionPerformed (ActionEvent e){
//                try{
//                    proses();
//                    
//                    hasiltotal.setText(String.valueOf(harga));
//                    Thread.sleep(1000);
//                }catch(Exception ex){
//                    
//                }
//            }
//    });
//        bayar.setBounds(20, 300, 200, 30);
//        bayar.setFont(new Font ("Consolas",Font.BOLD,17));
//        bayar.setForeground(new Color(20,1,188));
        
        sl.setBounds(200, 60, 500, 80);
        sl.setFont(new Font("Consolas", Font.BOLD,17));
        sl.setBackground(Color.WHITE);
        sl.setEditable(true);
        
        jwa.setBounds(200, 180, 230, 25);
        jwa.setFont(new Font("Consolas",Font.PLAIN,14));
        jwa.setBackground(Color.WHITE);
        jwa.setEditable(true);
        
        jwb.setBounds(200, 220, 230, 25);
        jwb.setFont(new Font("Consolas",Font.PLAIN,14));
        jwb.setBackground(Color.WHITE);
        jwb.setEditable(true);
        
        jwc.setBounds(200, 260, 230, 25);
        jwc.setFont(new Font("Consolas",Font.PLAIN,14));
        jwc.setBackground(Color.WHITE);
        jwc.setEditable(true);
        
        jwd.setBounds(200, 300, 230, 25);
        jwd.setFont(new Font("Consolas",Font.PLAIN,14));
        jwd.setBackground(Color.WHITE);
        jwd.setEditable(true);
        
        kj.setBounds(450, 180, 230, 25);
        kj.setFont(new Font("Consolas",Font.BOLD,17));
        
        pujian.setBounds(200, 340, 230, 25);
        
        pjawaban.setBounds(600, 180, 35, 25);
        
        ins.setBounds(450, 210, 90, 25);
        ins.setFont(new Font("Consolas",Font.BOLD,17));
        
        /// PANEL 
        panel.setBounds(40,80,800,400); 
        panel.setLayout(null);
        constraints.anchor = GridBagConstraints.WEST;
        constraints.insets = new Insets(10, 10, 10, 10);
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        constraints.anchor = GridBagConstraints.CENTER;
        
        // SET JENIS UJIAN
        pujian.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent event) {
        
                JComboBox pujian = (JComboBox) event.getSource();
                Object selected = pujian.getSelectedItem();
                if(selected.toString().equals("PBO"))
                    sl.setText("Apa kepanjangan dari OOP ?");
                    
                else if(selected.toString().equals("SO"))
                    sl.setText("Manakah perintah untuk masuk ke root di Linux ?"); 
            }
        });
        
        pujian.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
        
                JComboBox pujian = (JComboBox) event.getSource();
                Object selected = pujian.getSelectedItem();
                if(selected.toString().equals("PBO"))
                    jwa.setText("Object Oriented Programming");
                    
                else if(selected.toString().equals("SO"))
                    jwa.setText("sudo -i"); 
            }
        });
        
        pujian.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
        
                JComboBox pujian = (JComboBox) event.getSource();
                Object selected = pujian.getSelectedItem();
                if(selected.toString().equals("PBO"))
                    jwb.setText("Ora Ora Programming");
                    
                else if(selected.toString().equals("SO"))
                    jwb.setText("halt"); 
            }
        });
        
        pujian.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
        
                JComboBox pujian = (JComboBox) event.getSource();
                Object selected = pujian.getSelectedItem();
                if(selected.toString().equals("PBO"))
                    jwc.setText("Oreo Oreo Programming");
                    
                else if(selected.toString().equals("SO"))
                    jwc.setText("move"); 
            }
        });
                
        pujian.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
        
                JComboBox pujian = (JComboBox) event.getSource();
                Object selected = pujian.getSelectedItem();
                if(selected.toString().equals("PBO"))
                    jwd.setText("Oppa Oppa Programming");
                    
                else if(selected.toString().equals("SO"))
                    jwd.setText("sudo -l"); 
            }
        });

        ins.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent event) {
                cek();
            }
        });        
        // PILIHAN JAWABAN
        
//        pjawaban.addItem("A");
//        pjawaban.addItem("B");
//        pjawaban.addItem("C");
//        pjawaban.addItem("D");
//        
//        pujian.addItem("SO");
//        pujian.addItem("PBO");
//        

//        hasiltotal.setBounds(200, 250, 230, 25);
//        hasiltotal.setFont(new Font("Consolas",Font.BOLD,17));
//        
//        byr.setBounds(200, 300, 230, 25);
//        byr.setFont(new Font("Consolas",Font.BOLD,17));
//        byr.setForeground(Color.red);
//        
//        alert.setBounds(200, 445, 230, 25);
//        alert.setFont(new Font("Consolas",Font.BOLD,17));
//        alert.setForeground(Color.red);
//        
//        cetak.setBounds(20, 495, 150, 25);
//        cetak.setBackground(new Color (68,255,71));
//        text.setBounds(450, 250, 440, 270);
//        text.setFont(new Font("Consolas",Font.BOLD,15));
//        
//        text2.setBounds(450, 100, 440, 130);
//        text2.setFont(new Font("Consolas",Font.BOLD,14));
        

        panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Data Soal"));
        add(panel);
        add(label);
        panel.add(soal);
        panel.add(ja);
        panel.add(jb);
        panel.add(jc);
        panel.add(jd);
        panel.add(ujian);
        panel.add(pujian);
        panel.add(kj);
        panel.add(pjawaban);
        panel.add(ins);
//        add(beratkg);
        panel.add(sl);
        panel.add(jwa);
        panel.add(jwb);
        panel.add(jwc);
        panel.add(jwd);


        setTitle("Soal");
        setSize(890,570);
        setLayout(null);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    
    }
    
    public void cek(){
        
//        String selected = (String) pjawaban.getSelectedItem();
//        String selectedu = (String) pujian.getSelectedItem();
        Object selected = pjawaban.getSelectedItem();
        Object selectedu = pujian.getSelectedItem();
            if(selected.toString().equals("A") && selectedu.toString().equals("PBO")){
                JOptionPane.showMessageDialog(null, "Anda Benar");
            }
            else if(selected.toString().equals("D") && selectedu.toString().equals("SO")){
                JOptionPane.showMessageDialog(null, "Anda Benar");
            }
            else{
                JOptionPane.showMessageDialog(null, "Anda Salah");
            }
    }      
}

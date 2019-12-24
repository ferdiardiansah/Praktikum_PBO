/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tambahandosen6;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.HeadlessException;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author ferdi-07079
 */
public class gui extends JFrame{
    
        proses proses = new proses();
        String sujian[] = {"SO" , "PBO"};
        String jawaban[] = {"A" , "B", "C", "D"};  
        JLabel label = new JLabel ("Manajemen Soal");
        JLabel soal=  new JLabel ("Soal");
        JLabel ja = new JLabel ("Jawaban A ");
        JLabel jb = new JLabel ("Jawaban B ");
        JLabel jc = new JLabel ("Jawaban C ");
        JLabel jd = new JLabel ("Jawaban D ");
        JLabel ujian = new JLabel ("Jenis Ujian");
        JLabel kj = new JLabel ("Kunci Jawaban");
        JComboBox pujian = new JComboBox(sujian);
        JComboBox pjawaban = new JComboBox(jawaban);
        JButton ins = new JButton("Insert");
        
        JLabel alert = new JLabel();
        
        JTextArea sl = new JTextArea();
        JTextField jwa = new JTextField ();
        JTextField jwb = new JTextField();
        JTextField jwc = new JTextField();
        JTextField jwd = new JTextField();
        JTextField bry = new JTextField();
        
        
        
        JPanel panel = new JPanel();
        GridBagConstraints constraints = new GridBagConstraints();

    public gui() throws HeadlessException {
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
        
//        proses.combobox();



        
        

        // SOAL
        pujian.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
        
                JComboBox pujian = (JComboBox) event.getSource();
                Object selected = pujian.getSelectedItem();
                if(selected.toString().equals(proses.ujian1()))
                    sl.setText(proses.pertanyaan1());
                    
                else if(selected.toString().equals(proses.ujian2()))
                    sl.setText(proses.pertanyaan2()); 
            }
        });
        
        
        // JAWABAN
        pujian.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
        
                JComboBox pujian = (JComboBox) event.getSource();
                Object selected = pujian.getSelectedItem();
                if(selected.toString().equals(proses.ujian1()))
                    jwa.setText("Object Oriented Programming");
                    
                else if(selected.toString().equals(proses.ujian2()))
                    jwa.setText("rmdir"); 
            }
        });
        
        pujian.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
        
                JComboBox pujian = (JComboBox) event.getSource();
                Object selected = pujian.getSelectedItem();
                if(selected.toString().equals(proses.ujian1()))
                    jwb.setText("Ora Ora Programming");
                    
                else if(selected.toString().equals(proses.ujian2()))
                    jwb.setText("mkdir"); 
            }
        });
        
        pujian.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
        
                JComboBox pujian = (JComboBox) event.getSource();
                Object selected = pujian.getSelectedItem();
                if(selected.toString().equals(proses.ujian1()))
                    jwc.setText("Oreo Oreo Programming");
                    
                else if(selected.toString().equals(proses.ujian2()))
                    jwc.setText("move"); 
            }
        });
                
        pujian.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
        
                JComboBox pujian = (JComboBox) event.getSource();
                Object selected = pujian.getSelectedItem();
                if(selected.toString().equals(proses.ujian1()))
                    jwd.setText("Oppa Oppa Programming");
                    
                else if(selected.toString().equals(proses.ujian2()))
                    jwd.setText("sudo -l"); 
            }
        });
        
        
        
        

        
        
        
        
        ins.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent event) {
                cek();
            }
        });
        
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
        
     

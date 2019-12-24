/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul.pkg6;

import java.awt.GridBagConstraints;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author ferdi-07079
 */
public class komponen extends JFrame {
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

}

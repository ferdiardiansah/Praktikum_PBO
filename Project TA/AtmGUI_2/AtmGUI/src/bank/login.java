/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author ferdi-07079
 */
public class login {
    JFrame frame = new JFrame("ATM BANK");
    JTable table = new JTable();
    
    public login(){
        String username = "admin";
        String pass = "admin";
        JLabel Judul = new JLabel(" LOGIN ATM BANK ");
        Judul.setBounds(200, 40, 300, 50);
        Judul.setFont(new Font("serif", Font.PLAIN, 30));
        frame.add(Judul);
    //--------------------------------------------------------------  
        
    JLabel user = new JLabel("User Name :");
        user.setBounds(120, 120, 200, 30);
        user.setFont(new Font("serif", Font.PLAIN, 20));
        frame.add(user);
        
        JTextField userField = new JTextField();
        userField.setBounds(280, 120, 200, 30);
        frame.add(userField);
     //--------------------------------------------------------------
     
        JLabel password = new JLabel("Password :");
        password.setBounds(120, 180, 200, 30);
        password.setFont(new Font("serif", Font.PLAIN, 20));
        frame.add(password);
        
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(280, 180, 200, 30);
        frame.add(passwordField);
     //--------------------------------------------------------------
     
        JButton login = new JButton("LOGIN");
        login.setBounds(280, 238, 100, 30);
        frame.add(login);
        login.addActionListener((ActionEvent ae) -> {
            
            String a = userField.getText();
            String b = passwordField.getText();
            
            if(a.equals(username)){
                if(b.equals(pass)){
                    new BankATM();
                    this.frame.setVisible(false);
                    BankATM x =  new BankATM();
                    x.setVisible(true);
                }else{
                     JOptionPane.showMessageDialog(null, "Password / Username Salah !!!");
            }
            }else{
                     JOptionPane.showMessageDialog(null, "Password / Username Salah !!!");
            }
        
        });
        
     //--------------------------------------------------------------
        
        frame.setSize(700, 300);
        frame.setResizable(false);
//        frame.setLocation(null);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}

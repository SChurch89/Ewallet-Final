

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import java.sql.*;

import java.text.DateFormat;

import java.util.ArrayList;

import javax.swing.*;

import javax.swing.JTextField;

import java.awt.Color;

import javax.swing.JCheckBox;

import java.awt.FlowLayout;

import java.awt.*;

import java.awt.event.*;

import javax.swing.JFrame;

 

public class EWalletApp {

       

        public static void main(String[] args) {
        	
                login();
        
        }

        public static void login() {

 

                JFrame frame = new JFrame("Login");

                frame.setSize(400, 200);

                JPanel panel = new JPanel();

                panel.setLayout(new GridLayout(3, 1));

                JPanel usernamePanel = new JPanel();

                JPanel passwordPanel = new JPanel();

                JPanel buttonPanel = new JPanel();

               

                JLabel usernameLabel = new JLabel("Username");

               

                JLabel passwordLabel = new JLabel("Password");

               

                JTextField user = new JTextField(10);

               

                JTextField pass = new JPasswordField(10);

               

                JButton loginButton = new JButton("Login");

       

            loginButton.addActionListener(new ActionListener() {

       

            public void actionPerformed(ActionEvent e){

                               

                        String username = user.getText();

                        String password = pass.getText();

                    

                        if(username.equals("")) //If username is null

                        {

                            JOptionPane.showMessageDialog(null,"Please enter username");

                        }

                        else if(password.equals("")) //If password is null

                        {

                            JOptionPane.showMessageDialog(null,"Please enter password");

                        }

                        else

                        {

                                MainMenu launchPage = new MainMenu();

                                frame.setVisible(false);

                        }

                       

                      }

                  

            });

 

            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                usernamePanel.add(usernameLabel);

                passwordPanel.add(passwordLabel);

                usernamePanel.add(user);

                passwordPanel.add(pass);

                panel.add(usernamePanel);

                panel.add(passwordPanel);

                buttonPanel.add(loginButton);

                panel.add(buttonPanel);

                frame.add(panel);
                
                frame.setVisible(true);

                frame.pack();

        }

}
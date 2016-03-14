package ru.levelp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Perov on 12.03.2016.
 */
public class Main  {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Авторизация в системе");
        frame.setSize(600 , 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new GridBagLayout());

        JLabel loginLabel = new JLabel("Login");
        JLabel passwordLabel = new JLabel("Passsword");

        JButton loginButton = new JButton("Login in");
        JButton registrationButton = new JButton("Regestration");

        JTextField loginTexField = new JTextField(5);
        JTextField passwordField = new JTextField(5);

        GridBagConstraints c = new GridBagConstraints();


         // 1 - top, 2 left, 3 - bottom, 4 - right
       frame.add(loginLabel,new GridBagConstraints(0 , 0 , 1 , 1, 1, 1,
               GridBagConstraints.NORTH,
               GridBagConstraints.HORIZONTAL,new Insets(2, 2, 2 ,2), 0 , 0));

        frame.add(passwordLabel,new GridBagConstraints(0 , 1 , 1 , 1, 1, 1,
               GridBagConstraints.NORTH,
               GridBagConstraints.HORIZONTAL,new Insets(2, 2, 2 ,2), 0 , 0));


        frame.add(loginTexField,new GridBagConstraints(1 , 0 , 1 , 1, 1, 1,
               GridBagConstraints.NORTH,
               GridBagConstraints.HORIZONTAL,new Insets(2, 2, 2 ,2), 0 , 0));

        frame.add(passwordField,new GridBagConstraints(1 , 1 , 1 , 1, 1, 1,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,new Insets(2, 2, 2 ,2), 0 , 0));

        frame.add(loginButton, new GridBagConstraints(0 , 2 , 1 , 1, 1, 1,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,new Insets(2, 2, 2 ,2), 0 , 0));

        frame.add(registrationButton, new GridBagConstraints(1 , 2 , 1 , 1, 1, 1,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,new Insets(2, 2, 2 ,2), 0 , 0));

        frame.setVisible(true);
        frame.pack();

    }

}

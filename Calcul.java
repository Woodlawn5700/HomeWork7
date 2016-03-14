package ru.levelp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Perov on 14.03.2016.
 */
public class Calcul {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Calculator");
        frame.setLayout(new GridBagLayout());
        frame.setSize(250, 350);
        frame.setResizable(false);
        final JTextField textField = new JTextField(15);

        JButton b0 = new JButton("0");
        b0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String a = textField.getText();
                textField.setText(a + "0");
            }
        });

        JButton b1 = new JButton("1");
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "1");
            }
        });

        JButton b2 = new JButton("2");
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "2");
            }
        });

        JButton b3 = new JButton("3");
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "3");
            }
        });

        JButton b4 = new JButton("4");
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "4");
            }
        });

        JButton b5 = new JButton("5");
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "5");
            }
        });

        JButton b6 = new JButton("6");
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "6");
            }
        });

        JButton b7 = new JButton("7");
        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "7");
            }
        });

        JButton b8 = new JButton("8");
        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "8");
            }
        });

        JButton b9 = new JButton("9");
        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText() + "9");
            }
        });

        JButton mc = new JButton("MC");
        JButton mr = new JButton("MR");
        JButton ms = new JButton("MS");
        JButton mplus = new JButton("M+");
        JButton mminus = new JButton("M-");
        char x = 8592;
        JButton vecto = new JButton(String.valueOf(x));
        vecto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                char[] text = textField.getText().toCharArray();
                char[] text2 = new char[text.length - 1];
                String a = "";
                for (int i = 0; i < text2.length; i++) {
                    text2[i] = text[i];
                    a += text2[i];
                }

                textField.setText(a);
            }
        });

        JButton ce = new JButton("CE");

        JButton c = new JButton("C");
        c.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText("");
            }
        });

        JButton plusminus = new JButton("+-");
        char sqrt1 = 8730;
        JButton sqrt = new JButton(String.valueOf(sqrt1));
        JButton division = new JButton("/");
        JButton proc = new JButton("%");
        JButton multipl = new JButton("*");
        JButton onediv = new JButton("1/x");
        JButton minus = new JButton("-");
        JButton comma = new JButton(",");
        JButton addition = new JButton("+");
        JButton equalss = new JButton("=");

        frame.add(textField, new GridBagConstraints(0, 0, 5, 1, 1, 1,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        frame.add(mc, new GridBagConstraints(0, 1, 1, 1, 1, 1,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        frame.add(mr, new GridBagConstraints(1, 1, 1, 1, 1, 1,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        frame.add(ms, new GridBagConstraints(2, 1, 1, 1, 1, 1,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        frame.add(mplus, new GridBagConstraints(3, 1, 1, 1, 1, 1,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        frame.add(mminus, new GridBagConstraints(4, 1, 1, 1, 1, 1,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        frame.add(mminus, new GridBagConstraints(4, 1, 1, 1, 1, 1,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        frame.add(vecto, new GridBagConstraints(0, 2, 1, 1, 1, 1,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        frame.add(ce, new GridBagConstraints(1, 2, 1, 1, 1, 1,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        frame.add(c, new GridBagConstraints(2, 2, 1, 1, 1, 1,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        frame.add(plusminus, new GridBagConstraints(3, 2, 1, 1, 1, 1,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        frame.add(sqrt, new GridBagConstraints(4, 2, 1, 1, 1, 1,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        frame.add(b7, new GridBagConstraints(0, 3, 1, 1, 1, 1,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        frame.add(b8, new GridBagConstraints(1, 3, 1, 1, 1, 1,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL, new Insets(2, 3, 2, 2), 0, 0));

        frame.add(b9, new GridBagConstraints(2, 3, 1, 1, 1, 1,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        frame.add(division, new GridBagConstraints(3, 3, 1, 1, 1, 1,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        frame.add(proc, new GridBagConstraints(4, 3, 1, 1, 1, 1,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        frame.add(b4, new GridBagConstraints(0, 4, 1, 1, 1, 1,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));


        frame.add(b5, new GridBagConstraints(1, 4, 1, 1, 1, 1,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        frame.add(b6, new GridBagConstraints(2, 4, 1, 1, 1, 1,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        frame.add(multipl, new GridBagConstraints(3, 4, 1, 1, 1, 1,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        frame.add(onediv, new GridBagConstraints(4, 4, 1, 1, 1, 1,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        frame.add(b1, new GridBagConstraints(0, 5, 1, 1, 1, 1,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        frame.add(b2, new GridBagConstraints(1, 5, 1, 1, 1, 1,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        frame.add(b3, new GridBagConstraints(2, 5, 1, 1, 1, 1,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        frame.add(minus, new GridBagConstraints(3, 5, 1, 1, 1, 1,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        frame.add(equalss, new GridBagConstraints(4, 5, 2, 2, 1, 1,
                GridBagConstraints.WEST,
                GridBagConstraints.VERTICAL, new Insets(2, 2, 2, 2), 0, 0));

        frame.add(b0, new GridBagConstraints(0, 6, 2, 1, 1, 1,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL, new Insets(2, 2, 0, 2), 0, 0));

        frame.add(comma, new GridBagConstraints(2, 6, 1, 1, 1, 1,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));

        frame.add(addition, new GridBagConstraints(3, 6, 1, 1, 1, 1,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL, new Insets(2, 2, 2, 2), 0, 0));


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        frame.setVisible(true);
        frame.pack();

    }

}



package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Style extends JFrame {

    private JTextField UserText;

    public Style() {
        super("App");

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(dropDownColour());
        menuBar.add(dropDownFont());
        setJMenuBar(menuBar);

        UserText = new JTextField();
        setLayout(new GridLayout(3,1));
        JPanel[] panel = new JPanel[3];

        for (int i = 0; i < panel.length; i++)
        {
            panel[i] = new JPanel();
            add(panel[i]);
        }

        UserText.setHorizontalAlignment(SwingConstants.CENTER);
        UserText.setBackground(Color.WHITE);

        panel[1].setLayout(new BorderLayout());
        panel[1].add(UserText, BorderLayout.CENTER);

        setSize(500,250);
        setVisible(true);
    }

    public JMenu dropDownColour() {

        JMenu FontColour = new JMenu("Colour");
        JMenuItem red = new JMenuItem("Red");
        JMenuItem blue = new JMenuItem("blue");
        JMenuItem black = new JMenuItem("Black");

        red.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UserText.setForeground(Color.red);
            }
        });

        blue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UserText.setForeground(Color.BLUE);
            }
        });

        black.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UserText.setForeground(Color.BLACK);
            }
        });

        FontColour.add(red);
        FontColour.add(blue);
        FontColour.add(black);
        FontColour.setSize(14,14);
        return FontColour;
    }

    public JMenu dropDownFont() {
        JMenu FontType = new JMenu("Font");

        JMenuItem TimesNewRoman = new JMenuItem("Times New Roman");
        JMenuItem Calibri = new JMenuItem("Calibri");
        JMenuItem CourerNew = new JMenuItem("Courer New");
        TimesNewRoman.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UserText.setFont(new Font("Times New Roman", Font.BOLD, 20));
            }
        });
        Calibri.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UserText.setFont(new Font("Calibri",Font.BOLD,20));
            }
        });
        CourerNew.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                UserText.setFont(new Font("Courier new", Font.BOLD, 20));
            }
        });

        FontType.add(TimesNewRoman);
        FontType.add(Calibri);
        FontType.add(CourerNew);
        return FontType;
    }



    public static void main(String[]args) {
        new Style();
    }
}
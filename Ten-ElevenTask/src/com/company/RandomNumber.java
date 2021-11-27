package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RandomNumber extends JFrame {

    private int randomNumber;
    int AttemptCounter = 0;
    public RandomNumber()
    {
        super("Guess");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.randomNumber = (int)(Math.random()*20);
        setSize(500,500);
        setLayout(new GridLayout(4,1));
        JPanel[] pnl = new JPanel[4];

        pnl[0] = new JPanel();
        add(pnl[0]);

        pnl[1] = new JPanel();
        add(pnl[1]);

        pnl[2] = new JPanel();
        add(pnl[2]);

        pnl[3] = new JPanel();
        add(pnl[3]);


        JLabel header = new JLabel("Value of the number ranging from 1 to 20");
        pnl[0].setLayout(new BorderLayout());
        header.setHorizontalAlignment(SwingConstants.CENTER);
        header.setFont(new Font("Times new Roman", Font.BOLD,24));
        pnl[0].add(header,BorderLayout.CENTER);

        JTextField GuessNumber = new JTextField(3);
        pnl[2].setLayout(new GridLayout(3,1));
        JPanel[] p = new JPanel[3];
        for (int i = 0; i < p.length; i++)
        {
            p[i] = new JPanel();
            pnl[2].add(p[i]);
            p[i].setBackground(Color.WHITE);
        }

        p[1].setLayout(new FlowLayout());
        JLabel input = new JLabel("Write a number: ");
        input.setFont(new Font("Times new Roman", Font.BOLD,18));
        p[1].add(input);
        p[1].add(GuessNumber);

        JButton enter = new JButton("Enter");
        JLabel Output = new JLabel("");
        Output.setFont(new Font("Times new Roman", Font.BOLD,36));
        pnl[1].setLayout(new BorderLayout());
        Output.setHorizontalAlignment(SwingConstants.CENTER);
        pnl[1].add(Output);

        enter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int UserNumber = Integer.parseInt(GuessNumber.getText());

                    if (UserNumber < randomNumber) {
                        Output.setText("Value of the real number is HIGHER");
                    }

                    else if (UserNumber > randomNumber) {
                        Output.setText("Value of the real number is LESS");
                    }

                    else{
                        Output.setText("Congratulates, you won !");
                        AttemptCounter = 0;
                    }

                    if (AttemptCounter >= 3) {
                        Output.setText("Failed, real answer -> " + randomNumber);
                    }
                    AttemptCounter++;
                }

                catch (Exception ae) {
                    AttemptCounter = 0;
                }
            }
        });

        pnl[3].setLayout(new GridLayout(3,1));
        JPanel[] q = new JPanel[3];

        for (int i = 0; i < q.length; i++) {
            q[i] = new JPanel();
            pnl[3].add(q[i]);
            q[i].setBackground(Color.white);
        }
        q[1].add(enter);
        setVisible(true);
    }

    public static void main(String[]args) {
        RandomNumber example = new RandomNumber();
    }
}
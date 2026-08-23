package chapter12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        int n=new Random().nextInt(1000)+1; JTextField g=new JTextField(8); JLabel m=new JLabel("I have a number between 1 and 1000. Guess it!"); JButton again=new JButton("Play Again"); JButton guess=new JButton("Guess"); guess.addActionListener(e->{try{int x=Integer.parseInt(g.getText());if(x==n){m.setText("Correct!");g.setEditable(false);}else if(x<n){m.setText("Too Low");g.setBackground(Color.BLUE);}else{m.setText("Too High");g.setBackground(Color.RED);}}catch(Exception z){m.setText("Enter a number");}});again.addActionListener(e->{n=new Random().nextInt(1000)+1;g.setText("");g.setEditable(true);g.setBackground(Color.WHITE);m.setText("Guess again!");});JPanel p=new JPanel();p.add(m);p.add(g);p.add(guess);p.add(again);JFrame f=new JFrame("12.14 Guess the Number");f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);f.add(p);f.setSize(700,140);f.setLocationRelativeTo(null);f.setVisible(true);
    }
}

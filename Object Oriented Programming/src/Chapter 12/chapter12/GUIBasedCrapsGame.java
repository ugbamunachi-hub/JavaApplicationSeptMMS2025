package chapter12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class GUIBasedCrapsGame {
    public static void main(String[] args) {
        Random r=new Random();JTextField d1=new JTextField(3),d2=new JTextField(3),sum=new JTextField(4),point=new JTextField(6);int[] pt={0};boolean[] first={true};JButton roll=new JButton("Roll Dice");roll.addActionListener(e->{int a=r.nextInt(6)+1,b=r.nextInt(6)+1,s=a+b;d1.setText(""+a);d2.setText(""+b);sum.setText(""+s);if(first[0]){first[0]=false;if(s==7||s==11)point.setText("Win!");else if(s==2||s==3||s==12)point.setText("Lose!");else{pt[0]=s;point.setText(""+s);}}else if(s==pt[0])point.setText("Win!");else if(s==7)point.setText("Lose!");});JPanel p=new JPanel();p.add(new JLabel("Die1"));p.add(d1);p.add(new JLabel("Die2"));p.add(d2);p.add(new JLabel("Sum"));p.add(sum);p.add(new JLabel("Point"));p.add(point);p.add(roll);JFrame f=new JFrame("12.16 Craps");f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);f.add(p);f.setSize(600,150);f.setLocationRelativeTo(null);f.setVisible(true);
    }
}

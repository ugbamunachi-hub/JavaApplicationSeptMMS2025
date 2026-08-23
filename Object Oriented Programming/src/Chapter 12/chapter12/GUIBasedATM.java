package chapter12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class GUIBasedATM {
    public static void main(String[] args) {
        double[] bal={1000};JLabel l=new JLabel("Balance: $1000.00");JButton w=new JButton("Withdraw $100"),d=new JButton("Insert Envelope"),c=new JButton("Remove Cash");w.addActionListener(e->{if(bal[0]>=100)bal[0]-=100;l.setText(String.format("Balance: $%.2f",bal[0]));});d.addActionListener(e->{bal[0]+=100;l.setText(String.format("Balance: $%.2f",bal[0]));});c.addActionListener(e->JOptionPane.showMessageDialog(null,"Cash removed."));JPanel p=new JPanel();p.add(l);p.add(w);p.add(c);p.add(d);JFrame f=new JFrame("12.18 ATM");f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);f.add(p);f.setSize(500,120);f.setLocationRelativeTo(null);f.setVisible(true);
    }
}

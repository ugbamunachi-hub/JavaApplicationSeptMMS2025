package chapter12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Ecofont {
    public static void main(String[] args) {
        JTextField t=new JTextField("Type text here",20);JLabel l=new JLabel();int[] size={9};JButton up=new JButton("Increase Font Size"),down=new JButton("Decrease Font Size");Runnable update=()->{l.setText(t.getText());l.setFont(new Font("SansSerif",Font.PLAIN,size[0]));};t.addActionListener(e->update.run());up.addActionListener(e->{size[0]++;update.run();});down.addActionListener(e->{if(size[0]>1)size[0]--;update.run();});JPanel p=new JPanel();p.add(t);p.add(up);p.add(down);JFrame f=new JFrame("12.19 Ecofont");f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);f.add(p,BorderLayout.NORTH);f.add(l,BorderLayout.CENTER);f.setSize(700,220);f.setLocationRelativeTo(null);update.run();f.setVisible(true);
    }
}

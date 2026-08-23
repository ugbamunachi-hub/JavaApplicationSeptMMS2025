package chapter12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class DisplayingEvents {
    public static void main(String[] args) {
        JTextArea out=new JTextArea(); JButton b=new JButton("Action"); b.addActionListener(e->out.append(e.toString()+"\n")); JCheckBox c=new JCheckBox("Item");c.addItemListener(e->out.append(e.toString()+"\n"));JTextField k=new JTextField(12);k.addKeyListener(new KeyAdapter(){public void keyPressed(KeyEvent e){out.append(e.toString()+"\n");}public void keyReleased(KeyEvent e){out.append(e.toString()+"\n");}});JPanel p=new JPanel();p.add(b);p.add(c);p.add(k);JFrame f=new JFrame("12.15 Displaying Events");f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);f.add(p,BorderLayout.NORTH);f.add(new JScrollPane(out),BorderLayout.CENTER);f.setSize(650,400);f.setLocationRelativeTo(null);f.setVisible(true);
    }
}

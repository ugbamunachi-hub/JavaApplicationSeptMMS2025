package chapter12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class GUI129 {
    public static void main(String[] args) {
        JFrame f=new JFrame("12.9 GUI"); f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); JPanel p=new JPanel(new GridLayout(3,2,8,8)); p.add(new JLabel("First Name")); p.add(new JTextField()); p.add(new JLabel("Last Name")); p.add(new JTextField()); p.add(new JButton("OK")); p.add(new JButton("Cancel")); f.add(p); f.setSize(350,180); f.setLocationRelativeTo(null); f.setVisible(true);
    }
}

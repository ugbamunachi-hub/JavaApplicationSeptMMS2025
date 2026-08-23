package chapter12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class GUI128 {
    public static void main(String[] args) {
        JFrame f=new JFrame("12.8 GUI"); f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); JPanel p=new JPanel(); p.add(new JLabel("Label")); p.add(new JTextField(12)); p.add(new JButton("OK")); f.add(p); f.setSize(400,120); f.setLocationRelativeTo(null); f.setVisible(true);
    }
}

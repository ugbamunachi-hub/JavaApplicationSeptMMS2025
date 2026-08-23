package chapter12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class GUI1211 {
    public static void main(String[] args) {
        JFrame f=new JFrame("12.11 GUI"); f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); JPanel p=new JPanel(new BorderLayout()); p.add(new JLabel("Select an option"),BorderLayout.NORTH); p.add(new JList<>(new String[]{"One","Two","Three"}),BorderLayout.CENTER); f.add(p); f.setSize(300,250); f.setLocationRelativeTo(null); f.setVisible(true);
    }
}

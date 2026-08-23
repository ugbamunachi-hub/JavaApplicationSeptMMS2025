package chapter12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class GUI1210 {
    public static void main(String[] args) {
        JFrame f=new JFrame("12.10 GUI"); f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); f.add(new JScrollPane(new JTextArea(10,30))); f.setSize(450,300); f.setLocationRelativeTo(null); f.setVisible(true);
    }
}

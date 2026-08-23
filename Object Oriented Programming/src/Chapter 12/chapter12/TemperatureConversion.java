package chapter12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class TemperatureConversion {
    public static void main(String[] args) {
        JTextField in=new JTextField(10); JLabel out=new JLabel("Celsius: "); JButton b=new JButton("Convert"); b.addActionListener(e->{try{double f=Double.parseDouble(in.getText());out.setText(String.format("Celsius: %.2f",(f-32)*5/9));}catch(Exception x){out.setText("Invalid input");}}); JPanel p=new JPanel(); p.add(new JLabel("Fahrenheit:"));p.add(in);p.add(b);p.add(out);JFrame f=new JFrame("12.12 Temperature Conversion");f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);f.add(p);f.setSize(500,120);f.setLocationRelativeTo(null);f.setVisible(true);
    }
}

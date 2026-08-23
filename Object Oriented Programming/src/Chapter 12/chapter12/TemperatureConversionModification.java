package chapter12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class TemperatureConversionModification {
    public static void main(String[] args) {
        JComboBox<String> a=new JComboBox<>(new String[]{"Fahrenheit","Celsius","Kelvin"}),b=new JComboBox<>(new String[]{"Fahrenheit","Celsius","Kelvin"});JTextField in=new JTextField(8);JLabel out=new JLabel("Result:");JButton go=new JButton("Convert");go.addActionListener(e->{try{double v=Double.parseDouble(in.getText());String x=(String)a.getSelectedItem(),y=(String)b.getSelectedItem();double c=x.equals("Fahrenheit")?(v-32)*5/9:x.equals("Kelvin")?v-273.15:v;double r=y.equals("Fahrenheit")?c*9/5+32:y.equals("Kelvin")?c+273.15:c;out.setText(String.format("Result: %.2f %s",r,y));}catch(Exception z){out.setText("Invalid input");}});JPanel p=new JPanel();p.add(a);p.add(in);p.add(b);p.add(go);p.add(out);JFrame f=new JFrame("12.13 Temperature Conversion");f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);f.add(p);f.setSize(650,120);f.setLocationRelativeTo(null);f.setVisible(true);
    }
}

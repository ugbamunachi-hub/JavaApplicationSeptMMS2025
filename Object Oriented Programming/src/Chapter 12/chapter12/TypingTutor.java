package chapter12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class TypingTutor {
    public static void main(String[] args) {
        JTextArea area=new JTextArea(4,50);JPanel keys=new JPanel(new GridLayout(4,1));String[] rows={"QWERTYUIOP","ASDFGHJKL","ZXCVBNM","1234567890"};Map<Character,JButton> map=new HashMap<>();for(String row:rows){JPanel rp=new JPanel();for(char c:row.toCharArray()){JButton b=new JButton(""+c);map.put(Character.toLowerCase(c),b);b.addActionListener(e->area.append(b.getText()));rp.add(b);}keys.add(rp);}JFrame f=new JFrame("12.20 Typing Tutor");f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);f.add(new JScrollPane(area),BorderLayout.NORTH);f.add(keys);f.setSize(800,350);f.setLocationRelativeTo(null);f.setVisible(true);f.addKeyListener(new KeyAdapter(){public void keyPressed(KeyEvent e){JButton b=map.get(Character.toLowerCase(e.getKeyChar()));if(b!=null)b.setBackground(Color.YELLOW);}public void keyReleased(KeyEvent e){JButton b=map.get(Character.toLowerCase(e.getKeyChar()));if(b!=null)b.setBackground(null);}public void keyTyped(KeyEvent e){if(!Character.isISOControl(e.getKeyChar()))area.append(""+e.getKeyChar());}});f.setFocusable(true);
    }
}

package chapter12;
import javax.swing.*; import java.awt.*;
public class DrawFrame extends JFrame {
    public DrawFrame(){super("12.17 Interactive Drawing"); JLabel s=new JLabel("Coordinates: "); DrawPanel p=new DrawPanel(s);
        JButton undo=new JButton("Undo"),clear=new JButton("Clear"); JComboBox<String> shape=new JComboBox<>(new String[]{"Line","Rectangle","Oval"}); JCheckBox fill=new JCheckBox("Filled");
        undo.addActionListener(e->p.clearLastShape()); clear.addActionListener(e->p.clearDrawing()); shape.addActionListener(e->p.setShapeType(shape.getSelectedIndex())); fill.addActionListener(e->p.setFilledShape(fill.isSelected()));
        JPanel top=new JPanel();top.add(undo);top.add(clear);top.add(shape);top.add(fill);add(top,BorderLayout.NORTH);add(p);add(s,BorderLayout.SOUTH);setSize(800,600);setDefaultCloseOperation(EXIT_ON_CLOSE);setLocationRelativeTo(null);}
}

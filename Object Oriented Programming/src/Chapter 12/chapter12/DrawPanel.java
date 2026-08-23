package chapter12;
import javax.swing.*; import java.awt.*; import java.awt.event.*;
public class DrawPanel extends JPanel {
    private final ShapeRec[] shapes=new ShapeRec[100]; private int count; private int type; private ShapeRec current; private Color color=Color.BLACK; private boolean filled; private final JLabel status;
    public DrawPanel(JLabel s){status=s;setBackground(Color.WHITE);MouseHandler h=new MouseHandler();addMouseListener(h);addMouseMotionListener(h);}
    public void setShapeType(int t){type=t;} public void setFilledShape(boolean f){filled=f;} public void clearLastShape(){if(count>0){shapes[--count]=null;repaint();}} public void clearDrawing(){count=0;repaint();}
    protected void paintComponent(Graphics g){super.paintComponent(g);Graphics2D x=(Graphics2D)g;for(int i=0;i<count;i++)shapes[i].draw(x);if(current!=null)current.draw(x);}
    class MouseHandler extends MouseAdapter implements MouseMotionListener{
        public void mousePressed(MouseEvent e){current=new ShapeRec(type,color,filled,e.getX(),e.getY(),e.getX(),e.getY());}
        public void mouseReleased(MouseEvent e){if(current!=null&&count<100){current.x2=e.getX();current.y2=e.getY();shapes[count++]=current;current=null;repaint();}}
        public void mouseMoved(MouseEvent e){status.setText("Coordinates: ("+e.getX()+", "+e.getY()+")");}
        public void mouseDragged(MouseEvent e){if(current!=null){current.x2=e.getX();current.y2=e.getY();status.setText("Coordinates: ("+e.getX()+", "+e.getY()+")");repaint();}}
    }
    static class ShapeRec{int type,x1,y1,x2,y2;Color c;boolean fill;ShapeRec(int t,Color c,boolean f,int a,int b,int d,int e){type=t;this.c=c;fill=f;x1=a;y1=b;x2=d;y2=e;}
        void draw(Graphics2D g){g.setColor(c);int x=Math.min(x1,x2),y=Math.min(y1,y2),w=Math.abs(x2-x1),h=Math.abs(y2-y1);if(type==0)g.drawLine(x1,y1,x2,y2);else if(type==1){if(fill)g.fillRect(x,y,w,h);else g.drawRect(x,y,w,h);}else{if(fill)g.fillOval(x,y,w,h);else g.drawOval(x,y,w,h);}}
    }
}

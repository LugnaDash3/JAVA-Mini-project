import java.awt.*;
class FourWin
 {
    public static void main(String args[]) 
{
        Frame f1 = new Frame("Red Window");
        f1.setSize(300, 200);
        f1.setLocation(0, 0);       f1.setBackground(Color.red);
        f1.setVisible(true);
        Frame f2 = new Frame("Blue Window");
        f2.setSize(300, 200);
       f2.setLocation(1243, 0);  f2.setBackground(Color.blue);
        f2.setVisible(true);
        Frame f3 = new Frame("Yellow Window");
        f3.setSize(300, 200);
      f3.setLocation(1243, 620);  f3.setBackground(Color.yellow);
        f3.setVisible(true);
        Frame f4 = new Frame("Green Window");
        f4.setSize(300, 200);
        f4.setLocation(0, 620);  f4.setBackground(Color.green);
        f4.setVisible(true);
    }
}

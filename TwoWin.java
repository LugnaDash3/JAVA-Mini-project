import java.awt.*;
class TwoWin
{ 
   public static void main (String args[])
   {  
      Frame f1 = new Frame("Red Window");
         f1.setSize(300,200);
         f1.setBackground(Color.red);
         f1.setVisible(true);
      Frame f2 = new Frame("Green Window");
         f2.setSize(300,200);
         f2.setLocation(1243,0);
         f2.setBackground(Color.green);
         f2.setVisible(true);
    }
}

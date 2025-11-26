import java.awt.*;
class MyWin3 extends Frame
{
Button b,b1,b2;
MyWin3()
{
setSize(400,300);
b=new Button("Red");
b1=new Button("Green");
b2=new Button("Blue");
setLayout(null);
b.setBounds(30,125,100,50);
b1.setBounds(150,125,100,50);
b2.setBounds(270,125,100,50);
b.setBackground(Color.red);
b1.setBackground(Color.green);
b2.setBackground(Color.blue);
add(b);
add(b1);
add(b2);
setVisible(true);
}
public static void main (String args[])
{
new MyWin3();
}
}

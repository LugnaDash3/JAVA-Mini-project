import java.awt.*;
class MyWin2 extends Frame
{
Button b,b1;
MyWin2()
{
setSize(400,300);
b=new Button("Red");
b1=new Button("Green");
setLayout(null);
b.setBounds(90,125,100,50);
b1.setBounds(210,125,100,50);
b.setBackground(Color.red);
b1.setBackground(Color.green);
add(b);
add(b1);
setVisible(true);
}
public static void main (String args[])
{
new MyWin2();
}
}

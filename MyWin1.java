import java.awt.*;
class MyWin1 extends Frame
{
Button b;
MyWin1()
{
setSize(400,300);
b=new Button("OK");
setLayout(null);
b.setBounds(150,125,100,50);
add(b);
setVisible(true);
}
public static void main (String args[])
{
new MyWin1();
}
}

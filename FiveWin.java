import java.awt.*;
class FiveWin
{
public static void main(String args[])
{
int width = 300;
int height = 200;
Toolkit tk = Toolkit.getDefaultToolkit();
Dimension screen = tk.getScreenSize();
int screenWidth = screen.width;
int screenHeight = screen.height;

Frame f1 = new Frame("Red Window");
f1.setSize(width, height);
f1.setLocation(0, 0);
f1.setBackground(Color.red);
f1.setVisible(true);

Frame f2 = new Frame("Blue Window");
f2.setSize(width, height);
f2.setLocation(screenWidth - width, 0);
f2.setBackground(Color.blue);
f2.setVisible(true);

Frame f3 = new Frame("Yellow Window");
f3.setSize(width, height);
f3.setLocation(screenWidth - width, screenHeight - height - 50);
f3.setBackground(Color.yellow);
f3.setVisible(true);

Frame f4 = new Frame("Green Window");
f4.setSize(width, height);
f4.setLocation(0, screenHeight - height - 50);
f4.setBackground(Color.green);
f4.setVisible(true);

Frame f5 = new Frame("Pink Window");
f5.setSize(width, height);
f5.setLocation((screenWidth - width) / 2, (screenHeight - height) / 2);
f5.setBackground(Color.pink);
f5.setVisible(true);
}
}

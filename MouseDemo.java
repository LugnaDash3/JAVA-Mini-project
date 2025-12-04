import java.awt.*;
import java.awt.event.*;

public class MouseDemo extends Frame implements MouseListener {

    Label l;

    MouseDemo() {
        l = new Label("Mouse Events Will Appear Here");
        l.setBounds(50, 50, 300, 30);

        add(l);
        addMouseListener(this);
   
        setSize(400, 400);
        setTitle("Click Inside/Outside window");
        setLayout(null);
        setVisible(true);
    }

    public void mouseClicked(MouseEvent e) {
        l.setText("Mouse Clicked at (" + e.getX() + "," + e.getY() + ")");
    }

    public void mousePressed(MouseEvent e) {
        l.setText("Mouse Pressed");
    }

    public void mouseReleased(MouseEvent e) {
        l.setText("Mouse Released");
    }

    public void mouseEntered(MouseEvent e) {
        l.setText("Mouse Entered Frame");
    }

    public void mouseExited(MouseEvent e) {
        l.setText("Mouse Exited Frame");
    }

  
    public static void main(String[] args) {
        new MouseDemo();
    }
}

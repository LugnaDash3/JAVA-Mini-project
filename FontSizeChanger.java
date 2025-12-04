import java.awt.*;
import java.awt.event.*;

public class FontSizeChanger extends Frame implements KeyListener {

    Label text;
    int fontSize = 20;  // initial size

    FontSizeChanger() {

        text = new Label("Use UP and DOWN arrow keys to change font size");
        text.setBounds(30, 100, 450, 40);
        text.setFont(new Font("Arial", Font.PLAIN, fontSize));

        add(text);

        addKeyListener(this);

        setSize(500, 300);
        setLayout(null);
        setVisible(true);
    }

    public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_UP) {     // Increase font
            fontSize += 2;
            text.setFont(new Font("Arial", Font.PLAIN, fontSize));
        }

        if (key == KeyEvent.VK_DOWN) {   // Decrease font
            if (fontSize > 8)            // minimum limit
                fontSize -= 2;
            text.setFont(new Font("Arial", Font.PLAIN, fontSize));
        }
    }

    public void keyReleased(KeyEvent e) {}
    public void keyTyped(KeyEvent e) {}

    public static void main(String[] args) {
        new FontSizeChanger();
    }
}

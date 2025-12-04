import java.awt.*;
import java.awt.event.*;

 class KeyboardDemo extends Frame implements KeyListener {

    Label l;

    KeyboardDemo() {

        l = new Label("Press Any Key...");
        l.setBounds(50, 50, 250, 30);

        add(l);
        addKeyListener(this);

        setSize(400, 300);
        setTitle("Press any Key from Keyboard");
        setLayout(null);
        setVisible(true);
    }

    public void keyPressed(KeyEvent e) {
        l.setText("Key Pressed: " + e.getKeyChar());
    }

    public void keyReleased(KeyEvent e) {
        l.setText("Key Released: " + e.getKeyChar());
    }

    public void keyTyped(KeyEvent e) {
        l.setText("Key Typed: " + e.getKeyChar());
    }

    public static void main(String[] args) {
        new KeyboardDemo();
    }
}

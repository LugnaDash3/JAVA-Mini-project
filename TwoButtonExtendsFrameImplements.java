import java.awt.*;
import java.awt.event.*;

public class TwoButton extends Frame implements ActionListener {

    Button btnRed, btnGreen;

    public TwoButton() {
        setLayout(null);   // Using manual layout

        btnRed = new Button("Red");
        btnGreen = new Button("Green");

        btnRed.setBounds(50, 80, 100, 40);
        btnGreen.setBounds(200, 80, 100, 40);

        add(btnRed);
        add(btnGreen);

        btnRed.addActionListener(this);
        btnGreen.addActionListener(this);

        setSize(360, 200);
        setTitle("Color Change Window");
        setVisible(true);

        // Close window
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnRed) {
            setBackground(Color.RED);
        } else if (e.getSource() == btnGreen) {
            setBackground(Color.GREEN);
        }
    }

    public static void main(String[] args) {
        new TwoButton();
    }
}

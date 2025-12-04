import java.awt.*;
import java.awt.event.*;

public class TextInput extends Frame implements ActionListener {

    TextField tf;
    Label lbl;

    public TextInput() {

        setLayout(null);

        Label l = new Label("Enter Name:");
        l.setBounds(50, 70, 100, 30);
        add(l);

        tf = new TextField();
        tf.setBounds(160, 70, 150, 30);
        add(tf);

        lbl = new Label("Output will appear here");
        lbl.setBounds(50, 120, 260, 30);
        add(lbl);

        tf.addActionListener(this);  // Fires when ENTER is pressed

        setSize(350, 200);
        setTitle("TextField-Type and Enter");
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent w) {
                System.exit(0);
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        String text = tf.getText();
        lbl.setText("You typed: " + text);
    }

    public static void main(String[] args) {
        new TextInput();
    }
}

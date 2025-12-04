import java.awt.*;
import java.awt.event.*;

class BackColor extends Frame implements ActionListener {

    // Declare buttons
    Button redButton, greenButton, blueButton;

    // Constructor
    BackColor() {
        // Create buttons
        redButton = new Button("Red");
        redButton.setBackground(Color.red);
        greenButton = new Button("Green");
        greenButton.setBackground(Color.green);
        blueButton = new Button("Blue");
        blueButton.setBackground(Color.blue);

        // Set positions and sizes
        redButton.setBounds(50, 100, 80, 40);
        greenButton.setBounds(150, 100, 80, 40);
        blueButton.setBounds(250, 100, 80, 40);

        // Add action listeners
        redButton.addActionListener(this);
        greenButton.addActionListener(this);
        blueButton.addActionListener(this);

        // Add buttons to frame
        add(redButton);
        add(greenButton);
        add(blueButton);

        // Frame properties
        setSize(400, 250);
        setLayout(null); // Absolute positioning
        setVisible(true);
    }

    // Event handling
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == redButton) {
            setBackground(Color.RED);
        } else if (e.getSource() == greenButton) {
            setBackground(Color.GREEN);
        } else if (e.getSource() == blueButton) {
            setBackground(Color.BLUE);
        }
    }

    // Main method
    public static void main(String[] args) {
        new BackColor();
    }
}

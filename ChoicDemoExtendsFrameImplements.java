import java.awt.*;
import java.awt.event.*;

public class ChoiceDemo extends Frame implements ItemListener {

    Choice choice;
    Label lbl;

    public ChoiceDemo() {

        setLayout(null);

        Label l = new Label("Select a Color:");
        l.setBounds(50, 70, 100, 30);
        add(l);

        choice = new Choice();
        choice.add("Red");
        choice.add("Green");
        choice.add("Blue");
        choice.add("Yellow");
        choice.add("Black");

        choice.setBounds(160, 70, 120, 30);
        add(choice);

        lbl = new Label("Selected: None");
        lbl.setBounds(50, 120, 250, 30);
        add(lbl);

        choice.addItemListener(this);

        setSize(350, 200);
        setTitle("Choice Event Handling");
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent w) {
                System.exit(0);
            }
        });
    }

    public void itemStateChanged(ItemEvent e) {
        String selected = choice.getSelectedItem();
        lbl.setText("Selected: " + selected);
    }

    public static void main(String[] args) {
        new ChoiceDemo();
    }
}

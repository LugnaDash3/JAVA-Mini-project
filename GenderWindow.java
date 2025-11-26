import java.awt.*;
import java.awt.event.*;

class GenderWindow extends Frame implements ItemListener 
{
    Label l1, l2;
    CheckboxGroup genderGroup;
    Checkbox male, female;
    Button b;

    GenderWindow() 
{
        setSize(400, 250);
        setTitle("Gender Selection Window");

        
        l1 = new Label("Select Gender:");
        l2 = new Label("");
        genderGroup = new CheckboxGroup();
        male = new Checkbox("Male", genderGroup, false);
        female = new Checkbox("Female", genderGroup, false);
        b = new Button("Submit");

        
        setLayout(null);

        
        l1.setBounds(60, 80, 100, 25);
        male.setBounds(180, 80, 60, 25);
        female.setBounds(250, 80, 70, 25);
        b.setBounds(150, 130, 80, 30);
        l2.setBounds(150, 180, 150, 25);

        
        add(l1);
        add(male);
        add(female);
        add(b);
        add(l2);

        
        male.addItemListener(this);
        female.addItemListener(this);

        
        setVisible(true);
    }

    
    public void itemStateChanged(ItemEvent e) 
{
        if (male.getState()) 
{
            l2.setText("You selected: Male");
        } else if (female.getState()) {
            l2.setText("You selected: Female");
        }
    }

    public static void main(String args[]) 
{
        new GenderWindow();
    }
}

import java.awt.*;

class LoginWindow extends Frame 
{
    Label l1, l2;
    TextField t1, t2;
    Button b;

    LoginWindow() 
{
        setSize(400, 250);
        setTitle("Login Window");

        l1 = new Label("Username:");
        l2 = new Label("Password:");
        t1 = new TextField();
        t2 = new TextField();
        t2.setEchoChar('*'); 
        b = new Button("Login");

        
        setLayout(null);

        
        l1.setBounds(70, 70, 80, 25);
        t1.setBounds(160, 70, 150, 25);
        l2.setBounds(70, 110, 80, 25);
        t2.setBounds(160, 110, 150, 25);
        b.setBounds(150, 160, 80, 30);

        
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b);

        
        setVisible(true);
    }

    public static void main(String args[]) 
{
        new LoginWindow();
    }
}

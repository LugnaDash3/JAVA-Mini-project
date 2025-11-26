import java.awt.*;
import java.awt.event.*;

class CollegeWindow extends Frame implements ItemListener
{
    Label l1, l2;
    Choice collegeList;
    Button b;

    CollegeWindow() 
    {
        setSize(450, 300);
        setTitle("College Selection Window");

        l1 = new Label("Select Your College:");
        l2 = new Label("");
        collegeList = new Choice();
        b = new Button("Submit");

        collegeList.add("Select");
        collegeList.add("KIIT College of Engineering");
        collegeList.add("Silicon Institute of Technology");
        collegeList.add("SoA College of Engineering");
        collegeList.add("Trident Academy of Technology");
        collegeList.add("C.V Raman College of Engineering");

        collegeList.add("IIIT Bhubaneswar");
        collegeList.add("Odisha University of Technology and Research (OUTR)");
        collegeList.add("CET Bhubaneswar");
        collegeList.add("Gandhi Institute for Education and Technology (GIET)");
        collegeList.add("ITER - Siksha O Anusandhan");
        collegeList.add("KIIMS Bhubaneswar");
        collegeList.add("SRUSTI Academy of Management");
        collegeList.add("Hitech College of Engineering");
        collegeList.add("DRIEMS University");
        collegeList.add("KIIT Polytechnic");
        collegeList.add("BIITM Bhubaneswar");
        collegeList.add("Regional College of Management");
        collegeList.add("NM Institute of Engineering and Technology");
        collegeList.add("National Institute of Science and Technology (NIST)");
        collegeList.add("Bhubaneswar Engineering College");

        setLayout(null);

        l1.setBounds(60, 80, 160, 25);
        collegeList.setBounds(230, 80, 180, 25);
        b.setBounds(180, 130, 80, 30);
        l2.setBounds(100, 180, 300, 25);

        add(l1);
        add(collegeList);
        add(b);
        add(l2);

        collegeList.addItemListener(this);

        setVisible(true);
    }

    public void itemStateChanged(ItemEvent e)
    {
        String selectedCollege = collegeList.getSelectedItem();
        if (!selectedCollege.equals("Select"))
        {
            l2.setText("You selected: " + selectedCollege);
        }
        else
        {
            l2.setText("");
        }
    }

    public static void main(String args[]) 
    {
        new CollegeWindow();
    }
}

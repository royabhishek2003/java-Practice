package layout;

import java.awt.*;
import java.awt.event.*;

public class GridLayoutExample extends Frame implements ActionListener {

    Label l1, l2, l3;
    TextField t1, t2, t3;
    Button b1, b2;

    GridLayoutExample() {

        // Create labels
        l1 = new Label("Name");
        l2 = new Label("Age");
        l3 = new Label("Course");

        // Create text fields
        t1 = new TextField();
        t2 = new TextField();
        t3 = new TextField();

        // Create buttons
        b1 = new Button("Submit");
        b2 = new Button("Clear");

        // Set GridLayout
        setLayout(new GridLayout(4, 2, 10, 10));

        // Add components
        add(l1);
        add(t1);

        add(l2);
        add(t2);

        add(l3);
        add(t3);

        add(b1);
        add(b2);

        // Event handling
        b1.addActionListener(this);
        b2.addActionListener(this);

        // Frame settings
        setTitle("Student Form");
        setSize(400, 250);
        setVisible(true);
    }

    // Event handling
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == b1) {

            System.out.println("Name: " + t1.getText());
            System.out.println("Age: " + t2.getText());
            System.out.println("Course: " + t3.getText());
        }

        if (e.getSource() == b2) {

            t1.setText("");
            t2.setText("");
            t3.setText("");
        }
    }

    public static void main(String[] args) {

        new GridLayoutExample();
    }
}
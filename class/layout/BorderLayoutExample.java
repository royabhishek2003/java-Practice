package layout;

import java.awt.*;
import java.awt.event.*;

public class BorderLayoutExample extends Frame implements ActionListener {

    Label l1, l2, l3;
    TextField t1, t2, t3;
    Button b1, b2;

    BorderLayoutExample() {

        // Create labels
        l1 = new Label("Name");
        l2 = new Label("Age");
        l3 = new Label("Course");

        // Create text fields
        t1 = new TextField(15);
        t2 = new TextField(15);
        t3 = new TextField(15);

        // Create buttons
        b1 = new Button("Submit");
        b2 = new Button("Clear");

        // Create panels
        Panel p1 = new Panel();
        Panel p2 = new Panel();
        Panel p3 = new Panel();

        // Panel 1 - Name
        p1.add(l1);
        p1.add(t1);

        // Panel 2 - Age
        p2.add(l2);
        p2.add(t2);

        // Panel 3 - Course
        p3.add(l3);
        p3.add(t3);

        // Set BorderLayout
        setLayout(new BorderLayout());

        // Add panels to BorderLayout
        add(p1, BorderLayout.NORTH);
        add(p2, BorderLayout.CENTER);
        add(p3, BorderLayout.SOUTH);

        // Event handling
        b1.addActionListener(this);
        b2.addActionListener(this);

        // Button panel
        Panel buttonPanel = new Panel();

        buttonPanel.add(b1);
        buttonPanel.add(b2);

        add(buttonPanel, BorderLayout.EAST);

        // Frame settings
        setTitle("Student Form");
        setSize(500, 250);
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

        new BorderLayoutExample();
    }
}
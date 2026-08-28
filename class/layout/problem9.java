// WAP to create a JComboBox and do event Handling 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// set Bounce method 4 parameter to set the custom layout 

public class problem9 extends JFrame implements ItemListener {
    
    JLabel l1= new JLabel("Welcome");
    JComboBox<String> c1 = new JComboBox<>();

    problem9(){
        setSize(500,400);
        setLayout(new java.awt.FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c1.addItem("java");
        c1.addItem("Cpp");
        add(c1);
        add(l1);
        c1.addItemListener(this);
        setVisible(true);
    }

    public void itemStateChanged(ItemEvent e){
        String str= (String)c1.getSelectedItem();
        l1.setText("Selected Item is "+ str);
        
    }
    public static void main(String args[]){
        new problem9();
    }
}

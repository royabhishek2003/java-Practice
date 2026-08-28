// WAP to use illustrate the itemListener for checkbox and radio button 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class problem8 extends JFrame implements ItemListener {
    // JCheckBox box1 = new JCheckBox("Java");
    // JCheckBox box2 = new JCheckBox("Cpp");
    // JCheckBox box3 = new JCheckBox("JavaScript");
    JLabel l1= new JLabel("Welcome");
    JRadioButton b1= new JRadioButton("Male");
    JRadioButton b2= new JRadioButton("Female");

    problem8(){
       
        setSize(500,400);
        setLayout(new java.awt.FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // add(box1); add(box2);add(box3);
        
        add(l1);
        // box1.addItemListener(this);
        // box2.addItemListener(this);
        // box3.addItemListener(this);

        ButtonGroup bg= new ButtonGroup();
        bg.add(b1);
        bg.add(b2);
        add(b1); add(b2);
        setVisible(true);

        b1.addItemListener(this);
        b2.addItemListener(this);
    }

    public void itemStateChanged(ItemEvent e){
        String str= "Selected: ";
        // if(box1.isSelected()){
        //     str= str + "java";
        // }
        // if(box2.isSelected()){
        //     str= str + "Cpp";
        // }
        // if(box3.isSelected()){
        //     str= str + "JavaScript";
        // }
        if(b1.isSelected()){
            l1.setText("Gender: Male");
        }

        if(b2.isSelected()){
            l1.setText("Gender: Female");
        }

    //    l1.setText(str);
    }
    public static void main(String args[]){
        new problem8();
    }
}

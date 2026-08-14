import java.awt.Font;
import java.awt.*;
import javax.swing.*;

// first way to design a frame 
// if i want to design a frame then the main class should extend the JFrame class
public class Frame extends JFrame{
    JLabel level1= new JLabel("Name");
    JLabel level2= new JLabel("Roll");
    JTextField tf1= new JTextField();
    JTextField tf2= new JTextField();
    JButton bt1= new JButton();
    Frame(){
        setSize(500,400);
        setVisible(true);
        setTitle("Student Application Form");
        setLocation(200,200);

        setLayout(null); // i am gonna use my own layout 
        // setLayout(new FlowLayout());
    }
    public static void main(String args[]){
        new Frame();
    }
}


// Second way to design a frame 
// public class Frame {
//     public static void main(String args[]){
//         JFrame f1= new JFrame("Student application form");
//         f1.setSize(500,400);
//         f1.setVisible(true);
//         f1.setTitle("Student Application Form");
//         f1.setLocation(200,200);
//     }
// }
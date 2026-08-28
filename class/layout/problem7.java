// WAP to use MouseMotionListener
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class problem7 extends JFrame implements MouseMotionListener {
    JLabel l1=  new JLabel("Welcome");

    problem7(){
       
        setSize(500,400);
        setLayout(new java.awt.FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(l1);
        addMouseMotionListener(this);
        setVisible(true);
    }

    public void mouseMoved(MouseEvent e){
        l1.setText("Mouse Moved: X = " + e.getX() + ", Y = " + e.getY());
    }
    public void mouseDragged(MouseEvent e){
         l1.setText("Mouse Dragged: X = " + e.getX() + ", Y = " + e.getY());
    }
    public static void main(String args[]){
        new problem7();
    }
}

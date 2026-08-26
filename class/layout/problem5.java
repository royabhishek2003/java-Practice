// WAP to do mouse click event using MouseAdapter which is not interface 
  import javax.swing.*;
  import java.awt.*;
  import java.awt.event.*;
public class problem5 extends JFrame{
    JLabel l1= new JLabel("Welcome");
    problem5(){
        setSize(500,400);
        setVisible(true);
        setLayout(new FlowLayout());
        add(l1);
        addMouseListener( new MouseAdapter(){
            public void mouseClicked(MouseEvent e){
                l1.setText("MouseClicked");
            }
        });
    }
    public static void main(String args[]){
        new problem5();
    }
}       

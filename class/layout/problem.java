// package layout;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


// accept the readius of the circle and find its area 
public class problem extends JFrame implements ActionListener {
   
    JLabel l1= new JLabel("Radius");
    JTextField f1= new JTextField(15);
    JButton b1= new JButton("Area");

    problem(){
        setVisible(true);
        setSize(400,500);
        setLayout(new FlowLayout());
        add(l1);add(f1);add(b1);

        b1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == b1) {
            double r= Double.parseDouble(f1.getText());
            double area= 3.14*r*r;
            JOptionPane.showMessageDialog(this, area);

        }
    }

    public static void main(String args[]){
        new problem();
    }
}

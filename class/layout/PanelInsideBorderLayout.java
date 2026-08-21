package layout;
import java.awt.*;
import javax.swing.*;


// WAP to design two pwnel inside a frame 
public class PanelInsideBorderLayout extends JFrame {

        JPanel p1= new JPanel();
        JPanel p2= new JPanel();
        JLabel l1= new JLabel("First Pannel");
        JLabel l2= new JLabel("Second Pannel");
        PanelInsideBorderLayout(){

            setSize(500,400);
            setVisible(true);
            p1.setBackground(Color.RED);
            p2.setBackground(Color.YELLOW);
            setLayout(new GridLayout(2,1));
            p1.setLayout(new FlowLayout());
            add(p1);
            add(p2);
            p1.add(l1);
            p2.add(l2);
        }
        public static void main(String args[]){

            new PanelInsideBorderLayout();
        }
}

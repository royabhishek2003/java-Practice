import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class problem2 extends JFrame implements MouseListener {

    JLabel l1 = new JLabel("Mouse Testing");

    problem2() {
        setSize(400, 500);
        setLayout(new FlowLayout());

        add(l1);

        addMouseListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void mouseEntered(MouseEvent e) {
        // JOptionPane.showMessageDialog(this, "Mouse Entered");
        l1.setText("Mouse Entered");
    }

    public void mouseExited(MouseEvent e) {
        // JOptionPane.showMessageDialog(this, "Mouse Exited");
        l1.setText("Mouse Exited");
    }

    public void mousePressed(MouseEvent e) {
        // JOptionPane.showMessageDialog(this, "Mouse Pressed");
        l1.setText("Mouse Pressed");
    }

    public void mouseReleased(MouseEvent e) {
        // JOptionPane.showMessageDialog(this, "Mouse Released");
        l1.setText("Mouse Released");
    }

    public void mouseClicked(MouseEvent e) {
        // JOptionPane.showMessageDialog(this, "Mouse Clicked");
        l1.setText("Mouse Clicked");
    }

    public static void main(String args[]) {
        new problem2();
    }
}
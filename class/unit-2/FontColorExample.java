import javax.swing.*;
import java.awt.*;

public class FontColorExample extends JFrame {

    JLabel label= new JLabel("Welcome to Java");;
    JTextField feild= new JTextField(15);
    JButton button = new JButton("Save");
   

    FontColorExample() {

       
        setTitle("Font and Color Example");
        setSize(400, 200);
        setVisible(true);
        setLayout(new FlowLayout());
        // setting color 
        Color c = new Color(171, 172, 90);
        label.setOpaque(true);
        label.setBackground(c);
        button.setForeground(c);
        // setting font 
        Font f1= new Font("Ariel",Font.ITALIC,26);
        label.setFont(f1);
        add(label);
        add(feild);
        add(button);
    }

    public static void main(String[] args) {
        new FontColorExample();
    }
}
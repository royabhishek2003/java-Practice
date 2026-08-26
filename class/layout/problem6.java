// WAP to display popup window after clicking a button \
  import javax.swing.*;
  import java.awt.*;
  import java.awt.event.*;
public class problem6 extends JFrame  implements ActionListener {
    JButton b1= new JButton("click");

    problem6(){
        setSize(500,400);
        setVisible(true);
        setLayout(new FlowLayout());
        b1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {

        // if (e.getSource() == b1) {
        //     JOptionPane.showMessageDialog(null, "Buttton is clicked  ");

        // }
            if (e.getActionCommand().equals("click")) {
            // JOptionPane.showMessageDialog(null, "Button is clicked");
            //  JOptionPane.showMessageDialog(null,"Button Clicked ", "Error",JOptionPane.ERROR_MESSAGE);
             // for diffferent symbol 
             // WARNING_MESSAGE
             // QUESTION_MESSAGE
             //PLANE_MESSAGE
             // BY DEFAULT -> INFORMATION_MESSAGE



             // confirming dialog 
             JOptionPane.showConfirmDialog(null,"Are you Sure you want to Exit");

             JOptionPane.showConfirmDialog(null,"Are you Sure you want to Exit","save",JOptionPane.YES_NO_CANCEL_OPTION);

        }   



    }
    public static void main(String args[]){
        new problem6();
    }
}   


//implementing the ActionListener outside the class
  import javax.swing.*;
  import java.awt.*;
  import java.awt.event.*;
  class Problem3 extends JFrame
  {
	  JButton b1=new JButton("Save");
	  Problem3()
	  {
		  setSize(500,400);
		  setVisible(true);
		  setLayout(new FlowLayout());
		  add(b1);
		  b1.addActionListener(new abc());
	 }
	 public static void main(String arg[])
	 {
		 new Problem3();
	 }
 }
 class abc implements ActionListener
 {
	 public void actionPerformed(ActionEvent e)
	 {
		 System.out.println("Button clicked");
	 }
 }
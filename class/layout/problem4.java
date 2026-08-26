//Keyboard Event

  import javax.swing.*;
  import java.awt.*;
  import java.awt.event.*;
  class problem4 extends JFrame implements KeyListener
  {
	  JLabel l1=new JLabel("Mouse Event");
	  problem4()
	  {
		  setSize(500,400);
		  setVisible(true);
		  setLayout(new FlowLayout());
		  add(l1);
		  addKeyListener(this);

	 }
	 public void keyPressed(KeyEvent e)
	 {
            l1.setText("Key Pressed "+ e.getKeyChar());
	 }

	  public void keyReleased(KeyEvent e)
	{
	 		l1.setText("Key Released "+ e.getKeyChar());
	 }
	  public void keyTyped(KeyEvent e)
	 	{
	 		l1.setText("Mouse Released "+ e.getKeyChar());
	 }
	 public static void main(String arg[])
	 {
		 new problem4();
	 }
 }
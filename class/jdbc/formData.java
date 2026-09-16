import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
class lpu extends JFrame implements ActionListener
{
	Connection con=null;
	Statement stmt;
	JLabel l1=new JLabel("Roll No");
	JLabel l2=new JLabel("Name");
	JLabel l3=new JLabel("Mark");

	JTextField t_roll=new JTextField(15);
	JTextField t_name=new JTextField(15);
	JTextField t_mark=new JTextField(15);

	JButton b_save=new JButton("Save");
	JButton b_retrive=new JButton("Retive");
	JButton b_update=new JButton("update");
	JButton b_delete=new JButton("delete");
	lpu()
	{
		setSize(500,400);
		setVisible(true);
		setLayout(new FlowLayout());
		add(l1);add(t_roll);add(b_retrive);
		add(l2);add(t_name);
		add(l3);add(t_mark);
		add(b_save);add(b_update);add(b_delete);
		b_save.addActionListener(this);
		b_retrive.addActionListener(this);
		b_update.addActionListener(this);
		b_delete.addActionListener(this);
		dbconnect();
	}
	public void actionPerformed(ActionEvent e)
	{
        String r=t_roll.getText();
        String n=t_name.getText();
        String m=t_mark.getText();

		if(e.getSource()==b_retrive)
		{
			try{
				ResultSet rs=stmt.executeQuery("select * from student where roll='"+r+"'");
				while(rs.next())
				{
					t_name.setText(rs.getString("name"));
					t_mark.setText(rs.getString("mark"));
				}

			}
			catch(Exception ef){}
		}
		if(e.getSource()==b_save)
		{
		}
		if(e.getSource()==b_update)
	    {
		}
		if(e.getSource()==b_delete)
		{
		}
	}
	void dbconnect()
	{
		try{
			String url="jdbc:mysql://localhost:3306/studentdb1";
			String user="root";
			String password="1452";
			//load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//Establish the connection
			con=DriverManager.getConnection(url,user,password);
			System.out.println("Connection successfull");
			//create ststement object
			stmt=con.createStatement();

			//create the tablec
			stmt.executeUpdate("create table if not exists student(roll int primary key,name varchar(20),mark int)");
			System.out.println("Table created successfull");

			stmt.executeUpdate("insert ignore into student values(101,'muna',50)");
			stmt.executeUpdate("insert ignore into student values(102,'manas',60)");
			stmt.executeUpdate("insert ignore into student values(103,'mohit',40)");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}
	public static void main(String arg[])
	{
		new lpu();
	}
}
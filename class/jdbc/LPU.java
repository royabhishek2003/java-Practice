*//Specifying JDBC driver information externally,*
import java.sql.*;
import java.util.Properties;
import java.io.*;
class Lpu
{
	public static void main(String arg[])
	{
		try
		{
			Properties p=new Properties();
			FileInputStream fis=new FileInputStream("xyz.properties");
			p.load(fis);
			String driver=p.getProperty("driver");
			String url=p.getProperty("url");
			String username=p.getProperty("user");
			String password=p.getProperty("password");
			//load the driver
			Class.forName(driver);
			//Establish the connection
			Connection con=DriverManager.getConnection(url,username,password);
			System.out.println("Connection successfull");
		}catch(Exception e){System.out.println(e);}
	}
}
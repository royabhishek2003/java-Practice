
import java.sql.*;

public class jdbc1 {
    public static void main(String args[]){
        try{
            String url="jdbc:mysql://localhost:3306/lpudatabase";
            String user= "root";
            String password ="root";

            // load the driver 
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establish the connection 
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Connection successfull");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}

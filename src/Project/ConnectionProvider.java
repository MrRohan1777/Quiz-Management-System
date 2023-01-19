
package Project;
import java.sql.*;

public class ConnectionProvider {
    
    
    public static Connection getCon()
     
    {   try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qems?zeroDateTimeBehavior=CONVERT_TO_NULL","root","969276");
                System.out.println("Connected");
                return con;
                   
            }
            catch(Exception e)
            {
                System.out.println("catch block...........");
                 return (null);
            }
                 
                  
    }
    }

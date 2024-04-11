package travel.management.system;
import java.sql.*;
public class Conn {
   
    Connection c;
    Statement s;
    Conn(){
   try{
       //register the driver 
       Class.forName("com.mysql.cj.jdbc.Driver");
       //creating the connection string
       c = DriverManager.getConnection("jdbc:mysql:///travelmanagementsystem","root","vishu_vishu7906");
       //creating the statement
       s = c.createStatement();
   }  catch(Exception e ){
       e.printStackTrace();
   }
        
        
        
        
}
}
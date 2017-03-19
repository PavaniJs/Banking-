
import java.sql.Connection;
import java.sql.DriverManager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pavanirandika
 */
public class DB {
    
    
    
    public static Connection getcon()throws Exception{
    
    Class.forName("com.mysql.jdbc.Driver");
        Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/Project","root","");
        
        return c;
    
    
    
    }
    
    
}

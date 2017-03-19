
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pavanirandika
 */
public class Cl {
    
    private static Connection c;
    public static void createConnection() throws Exception{
    
    Class.forName("com.mysql.jdbc.Driver");
    c = DriverManager.getConnection("jdbc:mysql://localhost:3306/Project","root","");
    
    }
    public static void inupdel(String sql) throws Exception{
    
    if(c==null){
    
    createConnection();
    
    }
    c.createStatement().executeUpdate(sql);
        
    }
    
    public static ResultSet search(String sql) throws Exception{
    
    if(c==null){
    createConnection();
    
    }
    return c.createStatement().executeQuery(sql);
    }
     
    public static Connection getconnection() throws Exception{
    
    if(c==null){
    createConnection();
    
    }
    return c;
    }
    
    
    
}

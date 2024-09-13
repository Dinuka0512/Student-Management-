/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentmanagement.Database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author dinuka
 */
public class DBConnection {
    private static DBConnection dbconnection;
    private Connection connection;
    
    private final String url = "jdbc:mysql://localhost/StudentManage";
    private final String user = "dinuka";
    private final String password = "Lakmal@0512";
    
    private DBConnection () throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection(url,user,password);
    }
    
    public static DBConnection getInstance() throws ClassNotFoundException, SQLException{
        if(dbconnection == null){
            dbconnection = new DBConnection();
        }
        return dbconnection;
    }
    
    public Connection getConnection(){
        return connection;
    }
}

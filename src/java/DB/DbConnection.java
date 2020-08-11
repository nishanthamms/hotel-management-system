/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Nishantha
 */
public class DbConnection {
    private static final String DBURL = "jdbc:mysql://localhost:3306/sunrise";
     private static final String DBUSER = "root";
     private static final String DBPASS =""; 
    
    public Connection getConnection() throws ClassNotFoundException, SQLException{
     Class.forName("com.mysql.jdbc.Driver"); 
     Connection con=(Connection) DriverManager.getConnection(DBURL,DBUSER,DBPASS); 
     return con;
    }
}

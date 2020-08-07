/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbConnection;

import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ISURU
 */
public class DbConnection {
   static String url = "jdbc:mysql://localhost:3306/plymouth";
	static String user ="root";
	static String password ="";
	static String driver = "com.mysql.jdbc.Driver";
        static com.mysql.jdbc.Connection connection= null;
	
public com.mysql.jdbc.Connection getConnection() throws ClassNotFoundException, SQLException {
	Class.forName(driver);
	connection = (com.mysql.jdbc.Connection) DriverManager.getConnection(url, user, password);
	System.out.println(" connection sucsess");
	return connection;
	}
}
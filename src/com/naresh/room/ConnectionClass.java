/**
 * 
 */
package com.naresh.room;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Naresh
 *
 */
public class ConnectionClass {
	private static Connection connection=null;
	
	public static Connection getConnection() throws SQLException,ClassNotFoundException{
		Class.forName("oracle.jdbc.OracleDriver");
		if(connection==null){
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
		}
		return connection;
	}

}

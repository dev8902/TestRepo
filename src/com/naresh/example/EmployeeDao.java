/**
 * 
 */
package com.naresh.example;

import java.sql.Connection;

import com.naresh.room.*;


/**
 * @author Naresh
 *
 */
public class EmployeeDao{
	
	private Connection connection;
	private Connection getConn(Connection connection) throws Exception{
		connection=ConnectionClass.getConnection();
		return connection;
	}

}

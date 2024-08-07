package com.techlab.contoller;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;

	public class DatabaseUtil {
	    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/bank_applications";
	    private static final String JDBC_USER = "root";
	    private static final String JDBC_PASSWORD = "admin";

	    public static Connection getConnection() throws SQLException {
	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	        } catch (ClassNotFoundException e) {
	            throw new SQLException("JDBC Driver not found", e);
	        }
	        return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
	    }
	}
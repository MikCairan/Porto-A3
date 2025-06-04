package com.ATres.Porto.Base;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectaBanco {
	
	private static ConectaBanco conectaBanco;
	
	private static ConectaBanco getInstance() {
		if (conectaBanco == null) {
			conectaBanco = new ConectaBanco();
		}
		return conectaBanco;
	}
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		//Class.forName("com.mysql.jdbc.Driver");
		
		
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/porto","root","1312");
	}

	public static void main (String[]args) {
		try {
	    System.out.println(getInstance().getConnection());
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}

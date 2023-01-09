package Electricity;

import java.sql.*;

public class Conn {
	Connection c;// instances inbuilt package default variables
	Statement s;
	public Conn() {
		try {
			Class.forName("com.mysql8.jdbc.Driver");//establishing connection with jdbc driver
			c = DriverManager.getConnection("jdbc:mysql8:///ebs","root","root"); // getting connection  with user name password
			s = c.createStatement(); //initialised a statement with no arguments
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}

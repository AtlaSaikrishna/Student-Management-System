package student_management_system;

import java.sql.*;

public class DBConnection {
	private static final String url ="jdbc:mysql://localhost:3306/studentDB";
	private static final String username = "root";
	private static String password = "sai12345";
	static Connection con;
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, username, password);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	return con;
 }
}

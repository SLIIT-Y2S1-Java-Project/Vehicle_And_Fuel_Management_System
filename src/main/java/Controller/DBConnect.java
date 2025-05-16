package Controller;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
	
	public static Connection getConnection() throws  SQLException, ClassNotFoundException{
		String url = "jdbc:mysql://localhost:3306/onlinevehiclemanagementsystem";
		String user = "root";
		String pass = "1234";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection(url, user, pass);
		
		return conn;
	}	
	
}

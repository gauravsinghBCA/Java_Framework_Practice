package in.JDBCUtil;


import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;



public class JDBCutil {  //--------for insert data
      
	//task to get the properties from the application file and leading the driver and loading the driver with connection
	public static Connection getJdbcConnection() throws IOException, SQLException{
		FileInputStream fis = new FileInputStream("Application.properties");
		Properties p = new Properties(); // it is subclass of hashtable 
		p.load(fis);
	
		String url = p.getProperty("url");
		String user= p.getProperty("user");
		String password = p.getProperty("password");
		
		System.out.println(url);
		System.out.println(user);
		System.out.println(password);
		
		Connection conn = DriverManager.getConnection(url, user, password);
		return conn;
	}
	
	public static void closeResource(Connection connection,Statement statement) throws SQLException {
		 if(connection !=null) {
			 connection.close();
		 } if(statement !=null) {
			 statement.close();
		 }
	}
}


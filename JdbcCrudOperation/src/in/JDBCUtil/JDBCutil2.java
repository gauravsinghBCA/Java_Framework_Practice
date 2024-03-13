package in.JDBCUtil;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCutil2 {
   
	public static Connection getJdbcConnection() throws IOException, SQLException{
		FileInputStream fis = new FileInputStream("Application.properties");
		Properties p = new Properties();
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
	
	public static void closeResource(Connection connection,PreparedStatement preparedStatement,ResultSet result) throws SQLException {
		 if(connection !=null) {
			 connection.close();
		 } if(preparedStatement !=null) {
			 preparedStatement.close();
		 } if(result != null) {
			 result.close();
		 }
	}
}

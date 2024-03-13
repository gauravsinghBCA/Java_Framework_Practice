package insertQuery;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


import in.JDBCUtil.JDBCutil;

public class InsertMysql {

	public static void main(String[] args) {
		
		Connection connection = null;
		Statement statement = null;
		
		try {
			connection= JDBCutil.getJdbcConnection();
			if(connection != null) {
				statement = connection.createStatement();
				String myinsertquery = "insert into student(roll,name,result) values(125,'nikhil','pass')";
				int roweffected = statement.executeUpdate(myinsertquery);
				if(roweffected==1) {
					System.out.println("row effected");
				}
				else {
					System.out.println("row not effected");
				}
			}
		}
		
		catch (IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				JDBCutil.closeResource(connection, statement);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}

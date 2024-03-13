package insertQuery;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import in.JDBCUtil.JDBCutil2;

public class seclectQuery {

	public static void main(String[] args) {
		
		Connection connection = null;
		PreparedStatement preparedstatement = null;
		ResultSet result = null;
		 
		try {
			connection = JDBCutil2.getJdbcConnection();
			if(connection != null) {
				String mysqlquery = "select * from student";
				preparedstatement = connection.prepareStatement(mysqlquery);
				if(preparedstatement !=null) {
					
					result = preparedstatement.executeQuery();
					while(result != null) {
						if(result.next()) {
							System.out.println("roll\t name\t result");
							System.out.println(result.getInt(1)+"\t"+result.getString(2)+"\t"+result.getString(3));
						}
					}
				}
			}
		} 
		catch (IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

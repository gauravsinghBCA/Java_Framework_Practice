package insertQuery;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import in.JDBCUtil.JDBCutil1;

public class InsertMysql1 {

	public static void main(String[] args) {  
		
		Connection connection = null;
		PreparedStatement preparedstatement = null;
		
		try {
			connection = JDBCutil1.getJdbcConnection();
			if(connection !=null) {
				String mysqlQuery = "insert into student (roll,name,result) values(?,?,?)";
				preparedstatement = connection.prepareStatement(mysqlQuery);
				
				if(preparedstatement !=null) {
					preparedstatement.setInt(1, 6);
					preparedstatement.setString(2, "jishu");
					preparedstatement.setString(3, "pass");
					int roweffected = preparedstatement.executeUpdate();
					if(roweffected==1) {
						System.out.println("row effected");
					}
					else {
						System.out.println("row not effected");
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

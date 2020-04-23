package question2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GetData {

	public static void main(String[] args) {
		

		String jdbcURL = "jdbc:mysql://localhost:3306/employee";
		String username = "root";
		String password = "123456";
		
		
		try
		{
			
			Connection connection = DriverManager.getConnection(jdbcURL, username, password);
			
			
			
			
			if(connection != null)
			{
				System.out.println("Connection established successfully\n\n\n");
			}
			else
			{
				throw new SQLException();
			}
			
			
			
			
			
			String sql = "SELECT * FROM emp";
			
			Statement statement = connection.createStatement();
			
			ResultSet result = statement.executeQuery(sql);
			
			
			while(result.next())
			{
				
				
				
				System.out.println("UserID : " + result.getInt(1) );
				System.out.println("FirstName : " + result.getString(2) );
				System.out.println("LastName : " + result.getString(3) );
				System.out.println();
				System.out.println();
			}
			
			
			
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}

		
		
	}

}

package question1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class PushData {

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
			
			
			
			
			String sql1 = "INSERT INTO emp (firstname , lastname)"
               + "VALUES ('SHASHWAT' , 'KUMAR')";
			

			String sql2 = "INSERT INTO emp (firstname , lastname)"
               + "VALUES ('SHRIKANT' , 'LAL')";
			

			String sql3 = "INSERT INTO emp (firstname , lastname)"
               + "VALUES ('NITISH' , 'SINGLA')";
			

			String sql4 = "INSERT INTO emp (firstname , lastname)"
               + "VALUES ('PIYUSH' , 'VISHNOI')";
			

			String sql5 = "INSERT INTO emp (firstname , lastname)"
               + "VALUES ('VIBHAV' , 'SHARMA')";
			
			

			Statement statement = connection.createStatement();

			
			int rows=0;
			
			rows = statement.executeUpdate(sql1);
			rows = statement.executeUpdate(sql2);
			rows = statement.executeUpdate(sql3);
			rows = statement.executeUpdate(sql4);
			rows = statement.executeUpdate(sql5);
			
			
			
			if(rows > 0)
			{
				System.out.println("New Data has been added" + rows);
			}
			
			
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}

	}

}

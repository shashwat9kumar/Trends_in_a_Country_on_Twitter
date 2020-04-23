package pkg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class User_manager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String jdbcURL = "jdbc:mysql://localhost:3306/sampledb";
		String username = "root";
		String password = "123456";
		
		try
		{
			Connection connection = DriverManager.getConnection(jdbcURL, username, password);
			
			
			
			if(connection != null)
			{
				
				String sql = "SELECT * FROM users";
				
				Statement statement = connection.createStatement();
				
				ResultSet result = statement.executeQuery(sql);
				
				
				while(result.next())
				{
					System.out.println("UserID : " + result.getInt(1) );
					System.out.println("UserName : " + result.getString(2) );
					System.out.println("FirstName : " + result.getString(3) );
					System.out.println("LastName : " + result.getString(4) );
					System.out.println();
					System.out.println();
				}
				
				
				
				
				connection.close();
			}
			
			else
			{
				throw new SQLException();
			}
			
			
			
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}

	}

}


// String sql = "INSERT INTO users (username , firstname , lastname)"
//               + "VALUES ('R171218093' , 'SHASHWAT' , 'KUMAR')";

//  Statement statement = connection.createStatement();

// int rows = statement.executeUpdate(sql);








// //jdbc:sqlplus://localhost/18c
















/*





System.out.println("Connection Established");
				
				String sql = "INSERT INTO users (username , firstname , lastname)"
						     + "VALUES (? , ? , ?)";
				
				
				
				String un = "R171218099" , fn = "SHRIKANT" , ln = "LAL" ;
				
				
				
				PreparedStatement statement = connection.prepareStatement(sql);
				statement.setString(1, un);
				statement.setString(2, fn);
				statement.setString(3, ln);
				
				
				int rows = statement.executeUpdate();
				
				
				if(rows > 0)
				{
					System.out.println("New Row Inserted");
				}






*/
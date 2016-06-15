package GizzTech;

import java.sql.*;

public class MainExecutable {

	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/GizzTechSYS";//gives the file path to the database plus the table to be used
	
	static MyConnector myconnector;
	
	static final String Username = "root";//variable to use in place of the user name.
	static final String PWD = "mozzay";//variable for use in place of the password.
	
	static Connection conn = null;
	static Statement stmt = null;

	public static void main(String[] args) {
		
		try{
					
					Class.forName(JDBC_DRIVER);//register drivers
					
					//open connetion.
					
					conn = DriverManager.getConnection(DB_URL,Username, PWD);// query to connect to the database
					
					System.out.println("you are in control of your database");
					
					stmt = conn.createStatement();
					
		}
		catch(Exception e){
			
			System.out.println("we cant give you control because "+ e.getMessage());
			
		}
		finally{
			if (conn != null){
				
				try{
					
					conn.close();
					
				}catch(SQLException e){
					
					e.printStackTrace();
				}
			}
			
		}
		
	}

}

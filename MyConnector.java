package GizzTech;

import java.sql.Connection;
import java.sql.Statement;

public class MyConnector {
	
	Connection conn;
	Statement stmt;
	
	
	
	public MyConnector (Connection conn, Statement stmt)
	{
		this.conn = conn;
		this.stmt = stmt;
	}

}

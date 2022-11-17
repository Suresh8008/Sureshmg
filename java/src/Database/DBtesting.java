package Database;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;


public class DBtesting {

	@Test
public void testDB() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver loaded");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/suresh","root","Suresh8008@#");
		
		System.out.println("Connected to mysql Db");
		
		Statement st=con.createStatement();
		int res=st.executeUpdate("insert into Studentinfo values(1,'suresh','bsc')");
		
		System.out.println(res+" rows inserted");
		
		st.close();
		con.close();
	}
}

package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class SelectDB {

	
	@Test
	public void testDB() throws ClassNotFoundException, SQLException {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/suresh","root","Suresh8008@#");
			
			System.out.println("Connected to mysql Db");
			
			Statement st=con.createStatement();
		 ResultSet rs=st.executeQuery("select * from Studentinfo;");
		 System.out.println("Database records are:");
		 
		 while(rs.next()) {
			 int Stuid=rs.getInt("Stuid");
			 String StuName=rs.getString("StuName");
			 String StuGroup=rs.getString("StuGroup");
			 System.out.println(Stuid+"  "+StuName+"  "+StuGroup+"  ");
			 
			 		
		}
		 rs.close();
		 st.close();
		 con.close();
		 }
}

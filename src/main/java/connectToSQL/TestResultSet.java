package connectToSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestResultSet{
	public static void main(String[] xyz) {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection c = DriverManager.getConnection("jdbc:mysql://localhost/Nationwide", "root", "root");
			Statement s = c.createStatement();
			
			ResultSet RS = s.executeQuery("select * from school");
					
					while(RS.next()) {
						System.out.println(RS.getInt(1));
						System.out.println(RS.getString(2));
						System.out.println(RS.getInt(3));
					}
		}
			catch(Exception E) {
				System.out.println(E.toString());
		}
		
		
	}
}



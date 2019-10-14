package connectToSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class MainCode {

	public static void main(String xyz[]) {
		
			try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection c = DriverManager.getConnection("jdbc:mysql://localhost/Nationwide", "root", "root");
			Statement s = c.createStatement();
			
			s.executeUpdate("insert into tdp values('Peter')");
			}
			catch(Exception E) {
				System.out.println(E.toString());
			}

		
	}
}

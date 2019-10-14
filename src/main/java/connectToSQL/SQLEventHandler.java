package connectToSQL;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;

public class SQLEventHandler implements ActionListener {
	
	TextField Name;
	TextField Regno;
	TextField Marks;
	String RegnoOut;
	String NameOut;
	String MarksOut;
	
	public SQLEventHandler (TextField T1, TextField T2, TextField T3) {
	
	Regno=T1;
	Name=T2;
	Marks=T3;
	
	}
	
	public void actionPerformed(ActionEvent AE) {
	RegnoOut = Regno.getText();
	NameOut = Name.getText();
	MarksOut = Marks.getText();
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection c = DriverManager.getConnection("jdbc:mysql://localhost/Nationwide", "root", "root");
		Statement s = c.createStatement();
		
		s.executeUpdate("insert into school values("+RegnoOut+", '"+NameOut+"', "+MarksOut+")");
		}
		catch(Exception E) {
			System.out.println(E.toString());
		}
	}
}

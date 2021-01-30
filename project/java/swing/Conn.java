package project.java.swing;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
public class Conn {
	Connection c = null;
	java.sql.PreparedStatement pst;
	public static Connection dbConnect() {
		try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql:///noiaassignments","root","");
		return c;
		}
	
		catch(Exception e) {
			System.out.println(e);
			return null;
		}
		
		
	}
	
	

}

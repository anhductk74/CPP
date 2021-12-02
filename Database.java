import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;


public class Database {
	public static void main(String[] args) {
		
	
	Connection con = null;
		try {
			String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=Student;user=sa;password=123456789";
			con = DriverManager.getConnection(dbURL);
			if(con!=null) {
				JOptionPane.showMessageDialog(null, "Kết nối thành công");
				
				
				
			}
			
		} catch (SQLException ex){
			JOptionPane.showMessageDialog(null, ""+ex);
		}
		System.out.println(con);
	}
	
}
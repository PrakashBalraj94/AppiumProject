package dbConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class DBconnection {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		String host = "localhost";
		String port = "3306";
		
		Connection con = DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/prakashdb", "root", "Prakash@94");
		
		Statement st = con.createStatement();
		
		ResultSet rs = st.executeQuery("select * from EmployeeInfo where name = 'sam'");
		
		while (rs.next()) {
			
			System.out.println(rs.getString("ID"));
			System.out.println(rs.getString("Location"));
			System.out.println(rs.getString("Age"));
			
		}

	}

}

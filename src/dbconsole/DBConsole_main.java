package dbconsole;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConsole_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int order,rank;
		String title;
		ResultSet rs;
		MySQL mysql = new MySQL(null);
		rs = mysql.selectAll();
		
try {
	while(rs.next()){
	                order = rs.getInt("order");
	                title = rs.getString("title");
	                rank = rs.getInt("rank");
	                System.out.println("order�F" + order);
	                System.out.println("title�F" + title);
	                System.out.println("rank�F" + rank);
	            }
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}
}

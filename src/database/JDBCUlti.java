package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUlti {
	public static Connection getConnection() {
		Connection c = null;
		try {
//Đăng kí MySQL Driver với DriverManager
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
String url=""
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return c;
	}

	public static void closeConnection(Connection c) {

	}
}

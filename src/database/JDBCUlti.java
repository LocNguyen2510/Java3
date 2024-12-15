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
//			các thông số
			String url = "jdbc:mySQL://localhost:3307/ontap";
			String username = "root";
			String password = "";

//			tạo kết nối
			c = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return c;
	}

	public static void closeConnection(Connection c) {

	}
}

package testJDBCUtil;

import java.sql.Connection;

import database.JDBCUltil;

public class test {
	public static void main(String[] args) {
		// bước 1: tạo kết nối
		Connection connection = JDBCUltil.getConnection();
		JDBCUltil.printInfo(connection);
//		bước 5: ngắt kết nối
		JDBCUltil.closeConnection(connection);
	}
}

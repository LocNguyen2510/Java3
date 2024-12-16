package testJDBCUtil;

import java.sql.Connection;

import database.JDBCUltil;

public class test {
	public static void main(String[] args) {

		Connection connection = JDBCUltil.getConnection();
		JDBCUltil.printInfo(connection);
		JDBCUltil.closeConnection(connection);
	}
}

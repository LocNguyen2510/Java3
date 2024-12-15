package testJDBCUtil;

import java.sql.Connection;

import database.JDBCUlti;

public class test {
	public static void main(String[] args) {

		Connection connection = JDBCUlti.getConnection();
		System.out.println(connection);
	}
}

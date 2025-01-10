package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import database.JDBCUtil3;
import model.User2;

public class UserDAO2 implements DAOInterface2<User2> {
	public static UserDAO2 getInstance() {
		return new UserDAO2();
	}

	@Override
	public int add(User2 t) {
		int ketQua = 0;
		try {
			// Bước 1: tạo kết nối đến CSDL
			Connection con = JDBCUtil3.getConnection();
			// Buowcs 2: tạo ra đối tượng statement
			Statement st = con.createStatement();
			// Bước 3: thực thi câu lệnh SQL
			String sql = "INSERT INTO User(username, password,hovaten)" + "VALUES('" + t.getUsername() + "','"
					+ t.getPassword() + "','" + t.getHovaten() + "')";

			ketQua = st.executeUpdate(sql);

//			Bước 4:
			System.out.println("Bạn đã thực thi: " + sql);
			System.out.println("Có " + ketQua + " dòng bị thay đổi !!");

//			Bước 5:
			JDBCUtil3.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ketQua;
	}

	@Override
	public int update(User2 t) {
		int ketQua = 0;
		try {
			// Bước 1: tạo kết nối đến CSDL
			Connection con = JDBCUtil3.getConnection();
			// Buowcs 2: tạo ra đối tượng statement
			Statement st = con.createStatement();
			// Bước 3: thực thi câu lệnh SQL
			String sql = "UPDATE User" + " SET " + " password='" + t.getPassword() + "'" + ", hovaten='"
					+ t.getHovaten() + " WHERE username='" + t.getUsername() + "\'";
			System.out.println(sql);

			ketQua = st.executeUpdate(sql);

//			Bước 4:
			System.out.println("Bạn đã thực thi: " + sql);
			System.out.println("Có " + ketQua + " dòng bị thay đổi !!");

//			Bước 5:
			JDBCUtil3.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ketQua;
	}

	@Override
	public int delete(User2 t) {
		int ketQua = 0;
		try {
			// Bước 1: tạo kết nối đến CSDL
			Connection con = JDBCUtil3.getConnection();
			// Buowcs 2: tạo ra đối tượng statement
			Statement st = con.createStatement();
			// Bước 3: thực thi câu lệnh SQL
			String sql = "DELETE from User" + " WHERE username='" + t.getUsername() + "'";
			System.out.println(sql);

			ketQua = st.executeUpdate(sql);

//			Bước 4:
			System.out.println("Bạn đã thực thi: " + sql);
			System.out.println("Có " + ketQua + " dòng bị thay đổi !!");

//			Bước 5:
			JDBCUtil3.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ketQua;

	}

	@Override
	public ArrayList<User2> selectAll() {
		ArrayList<User2> ketQua = new ArrayList<User2>();
		try {
			// Bước 1: tạo kết nối đến CSDL
			Connection con = JDBCUtil3.getConnection();
			// Buowcs 2: tạo ra đối tượng statement
			Statement st = con.createStatement();
			// Bước 3: thực thi câu lệnh SQL
			String sql = "SELECT * FROM User";
			System.out.println(sql);

			ResultSet rs = st.executeQuery(sql);

//			Bước 4:
			while (rs.next()) {
				String username = rs.getString("username");
				String password = rs.getString("password");
				String hovaten = rs.getString("hovaten");

				User2 User = new User2(username, password, hovaten);
				ketQua.add(User);
			}
//			Bước 5:
			JDBCUtil3.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ketQua;
	}

	@Override
	public User2 selectById(User2 t) {
		User2 ketQua = null;
		try {
			// Bước 1: tạo kết nối đến CSDL
			Connection con = JDBCUtil3.getConnection();
			// Buowcs 2: tạo ra đối tượng statement
			Statement st = con.createStatement();
			// Bước 3: thực thi câu lệnh SQL
			String sql = "SELECT * FROM User where username='" + t.getUsername() + "'";
			System.out.println(sql);

			ResultSet rs = st.executeQuery(sql);

//			Bước 4:
			while (rs.next()) {
				String username = rs.getString("username");
				String password = rs.getString("password");
				String hovaten = rs.getString("hovaten");

				ketQua = new User2(username, password, hovaten);

			}
//			Bước 5:
			JDBCUtil3.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ketQua;
	}

	@Override
	public ArrayList<User2> selectByCondition(String condition) {
		ArrayList<User2> ketQua = new ArrayList<User2>();
		try {
			// Bước 1: tạo kết nối đến CSDL
			Connection con = JDBCUtil3.getConnection();
			// Buowcs 2: tạo ra đối tượng statement
			Statement st = con.createStatement();
			// Bước 3: thực thi câu lệnh SQL
			String sql = "SELECT * FROM User WHERE" + condition;
			System.out.println(sql);

			ResultSet rs = st.executeQuery(sql);

//			Bước 4:
			while (rs.next()) {
				String username = rs.getString("username");
				String password = rs.getString("password");
				String hovaten = rs.getString("hovaten");

				User2 User = new User2(username, password, hovaten);
				ketQua.add(User);
			}
//			Bước 5:
			JDBCUtil3.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ketQua;
	}

}

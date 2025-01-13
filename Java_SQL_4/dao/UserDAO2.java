package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
			String sql = "INSERT INTO User(username, password,hovaten)" + "VALUES(?, ?, ?";

			// Buowcs 2: tạo ra đối tượng statement
			PreparedStatement pst = con.prepareStatement(sql);
			// Bước 3: thực thi câu lệnh SQL
			pst.setString(1, t.getUsername());
			pst.setString(2, t.getPassword());
			pst.setString(3, t.getHovaten());
			ketQua = pst.executeUpdate();

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

			// Bước 3: thực thi câu lệnh SQL
			String sql = "UPDATE User" + " SET " + " password= ?" + ", hovaten= ?" + " WHERE username= ?";
			System.out.println(sql);
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, t.getPassword());
			st.setString(2, t.getHovaten());
			st.setString(3, t.getUsername());
			ketQua = st.executeUpdate();

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

			// Bước 3: thực thi câu lệnh SQL
			String sql = "DELETE from User" + " WHERE username=?";
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, t.getUsername());
			System.out.println(sql);

			ketQua = st.executeUpdate();

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
			// Bước 3: thực thi câu lệnh SQL
			String sql = "SELECT * FROM User";
			PreparedStatement st = con.prepareStatement(sql);
			System.out.println(sql);

			ResultSet rs = st.executeQuery();

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
			// Bước 3: thực thi câu lệnh SQL
			String sql = "SELECT * FROM User where username=?";
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, t.getUsername());
			System.out.println(sql);

			ResultSet rs = st.executeQuery();

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
			// Bước 3: thực thi câu lệnh SQL
			String sql = "SELECT * FROM User WHERE" + "?";
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, condition);
			System.out.println(sql);

			ResultSet rs = st.executeQuery();

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

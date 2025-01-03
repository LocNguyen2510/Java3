package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import database.JDBCUtil2;
import model.Sach1;

public class SachDAO1 implements DAOInterface1<Sach1> {
	public static SachDAO1 getInstance() {
		return new SachDAO1();
	}

	@Override
	public int add(Sach1 t) {
		int ketQua = 0;
		try {
			// Bước 1: tạo kết nối đến CSDL
			Connection con = JDBCUtil2.getConnection();
			// Buowcs 2: tạo ra đối tượng statement
			Statement st = con.createStatement();
			// Bước 3: thực thi câu lệnh SQL
			String sql = "INSERT INTO sach(id, tenSach,giaBan,namXuatBan)" + "VALUES('" + t.getId() + "','"
					+ t.getTenSach() + "','" + t.getGiaBan() + "','" + t.getNamXuatBan() + "')";

			ketQua = st.executeUpdate(sql);

//			Bước 4:
			System.out.println("Bạn đã thực thi: " + sql);
			System.out.println("Có " + ketQua + " dòng bị thay đổi !!");

//			Bước 5:
			JDBCUtil2.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ketQua;
	}

	@Override
	public int update(Sach1 t) {
		int ketQua = 0;
		try {
			// Bước 1: tạo kết nối đến CSDL
			Connection con = JDBCUtil2.getConnection();
			// Buowcs 2: tạo ra đối tượng statement
			Statement st = con.createStatement();
			// Bước 3: thực thi câu lệnh SQL
			String sql = "UPDATE sach" + " SET " + " tenSach='" + t.getTenSach() + "'" + ", giaBan=" + t.getGiaBan()
					+ ", namXuatBan=" + t.getNamXuatBan() + " WHERE id='" + t.getId() + "\'";
			System.out.println(sql);

			ketQua = st.executeUpdate(sql);

//			Bước 4:
			System.out.println("Bạn đã thực thi: " + sql);
			System.out.println("Có " + ketQua + " dòng bị thay đổi !!");

//			Bước 5:
			JDBCUtil2.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ketQua;
	}

	@Override
	public int delete(Sach1 t) {
		int ketQua = 0;
		try {
			// Bước 1: tạo kết nối đến CSDL
			Connection con = JDBCUtil2.getConnection();
			// Buowcs 2: tạo ra đối tượng statement
			Statement st = con.createStatement();
			// Bước 3: thực thi câu lệnh SQL
			String sql = "DELETE from sach" + " WHERE id='" + t.getId() + "'";
			System.out.println(sql);

			ketQua = st.executeUpdate(sql);

//			Bước 4:
			System.out.println("Bạn đã thực thi: " + sql);
			System.out.println("Có " + ketQua + " dòng bị thay đổi !!");

//			Bước 5:
			JDBCUtil2.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ketQua;

	}

	@Override
	public ArrayList<Sach1> selectAll() {
		ArrayList<Sach1> ketQua = new ArrayList<Sach1>();
		try {
			// Bước 1: tạo kết nối đến CSDL
			Connection con = JDBCUtil2.getConnection();
			// Buowcs 2: tạo ra đối tượng statement
			Statement st = con.createStatement();
			// Bước 3: thực thi câu lệnh SQL
			String sql = "SELECT * FROM sach";
			System.out.println(sql);

			ResultSet rs = st.executeQuery(sql);

//			Bước 4:
			while (rs.next()) {
				String id = rs.getString("id");
				String tenSach = rs.getString("tenSach");
				float giaBan = rs.getFloat("giaBan");
				int namXuatBan = rs.getInt("namXuatBan");

				Sach1 sach = new Sach1(id, tenSach, giaBan, namXuatBan);
				ketQua.add(sach);
			}
//			Bước 5:
			JDBCUtil2.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ketQua;
	}

	@Override
	public Sach1 selectById(Sach1 t) {
		Sach1 ketQua = null;
		try {
			// Bước 1: tạo kết nối đến CSDL
			Connection con = JDBCUtil2.getConnection();
			// Buowcs 2: tạo ra đối tượng statement
			Statement st = con.createStatement();
			// Bước 3: thực thi câu lệnh SQL
			String sql = "SELECT * FROM sach where id='" + t.getId() + "'";
			System.out.println(sql);

			ResultSet rs = st.executeQuery(sql);

//			Bước 4:
			while (rs.next()) {
				String id = rs.getString("id");
				String tenSach = rs.getString("tenSach");
				float giaBan = rs.getFloat("giaBan");
				int namXuatBan = rs.getInt("namXuatBan");

				ketQua = new Sach1(id, tenSach, giaBan, namXuatBan);

			}
//			Bước 5:
			JDBCUtil2.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ketQua;
	}

	@Override
	public ArrayList<Sach1> selectByCondition(String condition) {
		ArrayList<Sach1> ketQua = new ArrayList<Sach1>();
		try {
			// Bước 1: tạo kết nối đến CSDL
			Connection con = JDBCUtil2.getConnection();
			// Buowcs 2: tạo ra đối tượng statement
			Statement st = con.createStatement();
			// Bước 3: thực thi câu lệnh SQL
			String sql = "SELECT * FROM sach WHERE" + condition;
			System.out.println(sql);

			ResultSet rs = st.executeQuery(sql);

//			Bước 4:
			while (rs.next()) {
				String id = rs.getString("id");
				String tenSach = rs.getString("tenSach");
				float giaBan = rs.getFloat("giaBan");
				int namXuatBan = rs.getInt("namXuatBan");

				Sach1 sach = new Sach1(id, tenSach, giaBan, namXuatBan);
				ketQua.add(sach);
			}
//			Bước 5:
			JDBCUtil2.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ketQua;
	}

}

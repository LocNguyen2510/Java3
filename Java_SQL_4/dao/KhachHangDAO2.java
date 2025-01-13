package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import database.JDBCUtil3;
import model.KhachHang2;

public class KhachHangDAO2 implements DAOInterface2<KhachHang2> {
	public static KhachHangDAO2 getInstance() {
		return new KhachHangDAO2();
	}

	@Override
	public int add(KhachHang2 t) {
		int ketQua = 0;
		try {
			Connection con = JDBCUtil3.getConnection();

			String sql = "INSERT INTO khachhang(id, hoVaTen,ngaySinh,diaChi)" + "VALUES(?, ?, ?, ?)";
			PreparedStatement st = con.prepareStatement(null);
			st.setString(1, t.getId());
			st.setString(2, t.getHoVaTen());
			st.setInt(3, t.getNgaySinh());
			st.setString(4, t.getDiaChi());
			ketQua = st.executeUpdate(sql);
			System.out.println("Chuỗi SQL  : " + sql);
			JDBCUtil3.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ketQua;
	}

	@Override
	public int update(KhachHang2 t) {
		int ketQua = 0;
		try {
			Connection con = JDBCUtil3.getConnection();
			Statement st = con.createStatement();
			String sql = "UPDATE khachhang" + " SET " + " hoVaTen='" + t.getHoVaTen() + "'" + ", ngaySinh="
					+ t.getNgaySinh() + ", diaChi='" + t.getDiaChi() + "'" + " WHERE id ='" + t.getId() + "\'";
			ketQua = st.executeUpdate(sql);
			System.out.println("Chuỗi SQL  : " + sql);
			System.out.println("Có " + ketQua + " dòng bị thay đổi !!");
			JDBCUtil3.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ketQua;
	}

	@Override
	public int delete(KhachHang2 t) {
		int ketQua = 0;
		try {
			Connection con = JDBCUtil3.getConnection();
			Statement st = con.createStatement();
			String sql = "DELETE from khachhang" + " WHERE id='" + t.getId() + "'";
			ketQua = st.executeUpdate(sql);
			System.out.println("Chuỗi SQL  : " + sql);
			System.out.println("Có " + ketQua + " dòng bị thay đổi !!");
			JDBCUtil3.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ketQua;
	}

	@Override
	public ArrayList<KhachHang2> selectAll() {
		ArrayList<KhachHang2> ketQua = new ArrayList<KhachHang2>();
		try {
			Connection con = JDBCUtil3.getConnection();
			Statement st = con.createStatement();
			String sql = "SELECT * FROM khachhang";
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				String id = rs.getString("id");
				String hoVaTen = rs.getString("hoVaTen");
				int ngaySinh = rs.getInt("ngaySinh");
				String diaChi = rs.getString("diaChi");
				KhachHang2 kh = new KhachHang2(id, hoVaTen, ngaySinh, diaChi);
				ketQua.add(kh);
			}
			JDBCUtil3.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ketQua;
	}

	@Override
	public KhachHang2 selectById(KhachHang2 t) {
		KhachHang2 ketQua = null;
		try {
			Connection con = JDBCUtil3.getConnection();
			Statement st = con.createStatement();
			String sql = "SELECT * from khachhang where id='" + t.getId() + "'";
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				String id = rs.getString("id");
				String hoVaTen = rs.getString("hoVaTen");
				int ngaySinh = rs.getInt("ngaySinh");
				String diaChi = rs.getString("diaChi");
				ketQua = new KhachHang2(id, hoVaTen, ngaySinh, diaChi);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ketQua;
	}

	@Override
	public ArrayList<KhachHang2> selectByCondition(String condition) {
		ArrayList<KhachHang2> ketQua = new ArrayList<KhachHang2>();
		try {
			Connection con = JDBCUtil3.getConnection();
			Statement st = con.createStatement();
			String sql = "SELECT * from khachhang where" + condition;
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				String id = rs.getString("id");
				String hoVaTen = rs.getString("hoVaTen");
				int ngaySinh = rs.getInt("ngaySinh");
				String diaChi = rs.getString("diaChi");
				KhachHang2 kh = new KhachHang2(id, hoVaTen, ngaySinh, diaChi);
				ketQua.add(kh);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ketQua;
	}

}

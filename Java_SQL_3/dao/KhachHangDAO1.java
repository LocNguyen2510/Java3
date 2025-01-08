package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import database.JDBCUtil2;
import model.KhachHang1;

public class KhachHangDAO1 implements DAOInterface1<KhachHang1> {
	public static KhachHangDAO1 getInstance() {
		return new KhachHangDAO1();
	}

	@Override
	public int add(KhachHang1 t) {
		int ketQua = 0;
		try {
			Connection con = JDBCUtil2.getConnection();
			Statement st = con.createStatement();
			String sql = "INSERT INTO khachhang(id, hoVaTen,ngaySinh,diaChi)" + "VALUES('" + t.getId() + "','"
					+ t.getHoVaTen() + "'," + t.getNgaySinh() + ",'" + t.getDiaChi() + "')";
			ketQua = st.executeUpdate(sql);
			System.out.println("Chuỗi SQL  : " + sql);
			JDBCUtil2.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ketQua;
	}

	@Override
	public int update(KhachHang1 t) {
		int ketQua = 0;
		try {
			Connection con = JDBCUtil2.getConnection();
			Statement st = con.createStatement();
			String sql = "UPDATE khachhang" + " SET " + " hoVaTen='" + t.getHoVaTen() + "'" + ", ngaySinh="
					+ t.getNgaySinh() + ", diaChi='" + t.getDiaChi() + "'" + " WHERE id ='" + t.getId() + "\'";
			ketQua = st.executeUpdate(sql);
			System.out.println("Chuỗi SQL  : " + sql);
			System.out.println("Có " + ketQua + " dòng bị thay đổi !!");
			JDBCUtil2.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ketQua;
	}

	@Override
	public int delete(KhachHang1 t) {
		int ketQua = 0;
		try {
			Connection con = JDBCUtil2.getConnection();
			Statement st = con.createStatement();
			String sql = "DELETE from khachhang" + " WHERE id='" + t.getId() + "'";
			ketQua = st.executeUpdate(sql);
			System.out.println("Chuỗi SQL  : " + sql);
			System.out.println("Có " + ketQua + " dòng bị thay đổi !!");
			JDBCUtil2.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ketQua;
	}

	@Override
	public ArrayList<KhachHang1> selectAll() {
		ArrayList<KhachHang1> ketQua = new ArrayList<KhachHang1>();
		try {
			Connection con = JDBCUtil2.getConnection();
			Statement st = con.createStatement();
			String sql = "SELECT * FROM khachhang";
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				String id = rs.getString("id");
				String hoVaTen = rs.getString("hoVaTen");
				int ngaySinh = rs.getInt("ngaySinh");
				String diaChi = rs.getString("diaChi");
				KhachHang1 kh = new KhachHang1(id, hoVaTen, ngaySinh, diaChi);
				ketQua.add(kh);
			}
			JDBCUtil2.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ketQua;
	}

	@Override
	public KhachHang1 selectById(KhachHang1 t) {
		KhachHang1 ketQua = null;
		try {
			Connection con = JDBCUtil2.getConnection();
			Statement st = con.createStatement();
			String sql = "SELECT * from khachhang where id='" + t.getId() + "'";
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				String id = rs.getString("id");
				String hoVaTen = rs.getString("hoVaTen");
				int ngaySinh = rs.getInt("ngaySinh");
				String diaChi = rs.getString("diaChi");
				ketQua = new KhachHang1(id, hoVaTen, ngaySinh, diaChi);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ketQua;
	}

	@Override
	public ArrayList<KhachHang1> selectByCondition(String condition) {
		ArrayList<KhachHang1> ketQua = new ArrayList<KhachHang1>();
		try {
			Connection con = JDBCUtil2.getConnection();
			Statement st = con.createStatement();
			String sql = "SELECT * from khachhang where" + condition;
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				String id = rs.getString("id");
				String hoVaTen = rs.getString("hoVaTen");
				int ngaySinh = rs.getInt("ngaySinh");
				String diaChi = rs.getString("diaChi");
				KhachHang1 kh = new KhachHang1(id, hoVaTen, ngaySinh, diaChi);
				ketQua.add(kh);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ketQua;
	}

}

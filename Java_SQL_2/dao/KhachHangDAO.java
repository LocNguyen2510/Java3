package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import database.JDBCUtil1;
import model.KhachHang;

public class KhachHangDAO implements DAOInterface<KhachHang> {
	public static KhachHangDAO getInstance() {
		return new KhachHangDAO();
	}

	@Override
	public int add(KhachHang t) {
		int ketQua = 0;
		try {
			Connection con = JDBCUtil1.getConnection();
			Statement st = con.createStatement();
			String sql = "INSERT INTO sach(id, hoVaTen,ngaySinh,diaChi)" + "VALUES('" + t.getId() + "','"
					+ t.getHoVaTen() + "','" + t.getNgaySinh() + "','" + t.getDiaChi() + "')";
			ketQua = st.executeUpdate(sql);
			System.out.println("Chuỗi SQL  : " + sql);
			JDBCUtil1.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ketQua;
	}

	@Override
	public int update(KhachHang t) {
		int ketQua = 0;
		try {
			Connection con = JDBCUtil1.getConnection();
			Statement st = con.createStatement();
			String sql = "UPDATE khachhang" + " SET " + " hoVaTen='" + t.getHoVaTen() + "'" + ", ngaySinh='"
					+ t.getNgaySinh() + "'" + ", diaChi='" + t.getDiaChi() + " WHERE id ='" + t.getId() + "\'";
			ketQua = st.executeUpdate(sql);
			System.out.println("Chuỗi SQL  : " + sql);
			System.out.println("Có " + ketQua + " dòng bị thay đổi !!");
			JDBCUtil1.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ketQua;
	}

	@Override
	public int delete(KhachHang t) {
		int ketQua = 0;
		try {
			Connection con = JDBCUtil1.getConnection();
			Statement st = con.createStatement();
			String sql = "DELETE from khachhang" + "WHERE id='" + t.getId() + "'";
			ketQua = st.executeUpdate(sql);
			System.out.println("Chuỗi SQL  : " + sql);
			System.out.println("Có " + ketQua + " dòng bị thay đổi !!");
			JDBCUtil1.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ketQua;
	}

	@Override
	public ArrayList<KhachHang> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public KhachHang selectById(KhachHang t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<KhachHang> selectByCondition(String condition) {
		// TODO Auto-generated method stub
		return null;
	}

}

package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import database.JDBCUtil1;
import model.KhachHang;

public class KhachHangDAO implements DAOInterface<KhachHang> {
	public static SachDAO getInstance() {
		return new SachDAO();
	}

	@Override
	public int add(KhachHang t) {
		int ketQua = 0;
		try {
			Connection con = JDBCUtil1.getConnection();
			Statement st = con.createStatement();
			String sql = "INSERT INTO khachHang(id, hoVaTen, ngaySinh, diaChi)" + "VALUES('" + t.getId() + "','"
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
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(KhachHang t) {
		// TODO Auto-generated method stub
		return 0;
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

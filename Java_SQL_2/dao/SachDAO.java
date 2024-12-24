package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import database.JDBCUtil1;
import model.Sach;

public class SachDAO implements DAOInterface<Sach> {

	@Override
	public int add(Sach t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Sach t) {
		try {
			// Bước 1: tạo kết nối đến CSDL
			Connection con = JDBCUtil1.getConnection();
			// Buowcs 2: tạo ra đối tượng statement
			Statement st = con.createStatement();
			// Bước 3: thực thi câu lệnh SQL
			String sql = "INSERT INTO sach(id, tenSach,giaBan,namXuatBan)" + "VALUES(" + t.getId() + ","
					+ t.getTenSach() + "," + t.getGiaBan() + "," + t.getNamXuatBan() + ")";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return 0;
	}

	@Override
	public int delete(Sach t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<Sach> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Sach selectById(Sach t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Sach> selectByCondition(String condition) {
		// TODO Auto-generated method stub
		return null;
	}

}

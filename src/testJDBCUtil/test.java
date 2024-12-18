package testJDBCUtil;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import database.JDBCUltil;

public class test {
	public static void main(String[] args) {
		try {
//  bước 1: tạo kết nối
			Connection connection = JDBCUltil.getConnection();
//	Bước 2:	tạo ra đối tương statement
			Statement st = connection.createStatement();
//	Bước 3: thực thi 1 câu lệnh sql
			String sql = " INSERT INTO persons(last_name,first_name,gender,dob,income)"
					+ "VALUES(\"Sang\",\"Phan\",\"Male\",\"2005-11-27\",12000000)";
			int check = st.executeUpdate(sql);
//	Bước 4: xử lí kết quả
			System.out.println("Số dòng thay đổi: " + check);
			if (check > 0) {
				System.out.println("Thêm dữ liệu thành công");
			} else {
				System.out.println("Thêm dữ liệu thất bại");
			}
//	bước 5: ngắt kết nối
			JDBCUltil.closeConnection(connection);
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}
}

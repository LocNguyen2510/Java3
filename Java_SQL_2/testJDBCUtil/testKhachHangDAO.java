package testJDBCUtil;

import dao.KhachHangDAO;

public class testKhachHangDAO {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			KhachHangDAO kh = new KhachHangDAO("KH" + i, "Ten", '2001-10-2', "Da Nang");
			KhachHangDAO.getInstance(kh);
		}
	}
}

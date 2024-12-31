package testJDBCUtil;

import dao.KhachHangDAO;
import model.KhachHang;

public class testKhachHangDAO {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			KhachHang khachhang = new KhachHang("KH" + i, "Ten", 2001, "Da Nang");
			KhachHangDAO.getInstance().add(khachhang);
		}
		// KhachHang khachhang1 = new KhachHang("KH3", "DinhLoc", 2002, "Da Nang");
		// KhachHangDAO.getInstance().update(khachhang1);
	}
}

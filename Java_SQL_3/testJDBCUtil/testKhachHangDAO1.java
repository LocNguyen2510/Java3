package testJDBCUtil;

import java.util.ArrayList;

import dao.KhachHangDAO1;
import model.KhachHang1;

public class testKhachHangDAO1 {
	public static void main(String[] args) {
		ArrayList<KhachHang1> list = KhachHangDAO1.getInstance().selectAll();
		for (KhachHang1 khachHang1 : list) {
			System.out.println(khachHang1.toString());
		}
//		for (int i = 0; i < 10; i++) {
//			KhachHang khachhang = new KhachHang("KH" + i, "Ten", 2001, "Da Nang");
//			KhachHangDAO.getInstance().add(khachhang);
//		}
//		KhachHang khachhang1 = new KhachHang("KH3", "DinhLoc", 2002, "Da Nang");
//		KhachHangDAO.getInstance().update(khachhang1);
	}
}

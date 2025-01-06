package testJDBCUtil;

import java.util.ArrayList;

import dao.KhachHangDAO1;
import model.KhachHang1;

public class testKhachHangDAO1 {
	public static void main(String[] args) {
		ArrayList<KhachHang1> list = KhachHangDAO1.getInstance().selectAll();
		for (KhachHang1 kh : list) {
			System.out.println(kh.toString());
		}
		for (int i = 0; i < 20; i++) {
			KhachHang1 khachhang = new KhachHang1("KH" + i, "Ten", 2001, "Da Nang");
			KhachHangDAO1.getInstance().delete(khachhang);
		}
		for (int i = 1; i < 10; i++) {
			KhachHang1 khachhang = new KhachHang1("" + i, "Ten", 2001, "Da Nang");
			KhachHangDAO1.getInstance().add(khachhang);
		}
		KhachHang1 khachhang1 = new KhachHang1("" + 3, "DinhLoc", 2002, "Da Nang");
		KhachHangDAO1.getInstance().update(khachhang1);
	}
}

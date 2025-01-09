package testJDBCUtil;

import java.util.ArrayList;

import dao.KhachHangDAO2;
import model.KhachHang2;

public class testKhachHangDAO2 {
	public static void main(String[] args) {
		ArrayList<KhachHang2> list = KhachHangDAO2.getInstance().selectAll();
		for (KhachHang2 kh : list) {
			System.out.println(kh.toString());
		}
		System.out.println("-----------------------------------------");
		KhachHang2 find = new KhachHang2();
		find.setId("" + 3);
		KhachHang2 kh = KhachHangDAO2.getInstance().selectById(find);
		System.out.println(kh);
		System.out.println("-----------------------------------------");
		ArrayList<KhachHang2> list1 = KhachHangDAO2.getInstance().selectByCondition(" ngaySinh=2001");
		for (KhachHang2 kh1 : list1) {
			System.out.println(kh1.toString());
//		for (int i = 0; i < 20; i++) {
//			KhachHang2 khachhang = new KhachHang2("KH" + i, "Ten", 2001, "Da Nang");
//			KhachHangDAO2.getInstance().delete(khachhang);
//		}
//		for (int i = 1; i < 10; i++) {
//			KhachHang2 khachhang = new KhachHang2("" + i, "Ten", 2001, "Da Nang");
//			KhachHangDAO2.getInstance().add(khachhang);
//		}
//		KhachHang2 KhachHang2 = new KhachHang2("" + 3, "DinhLoc", 2002, "Da Nang");
//		KhachHangDAO2.getInstance().update(KhachHang2);
		}
	}
}

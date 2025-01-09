package testJDBCUtil;

import java.util.ArrayList;

import dao.SachDAO2;
import model.Sach2;

public class testSachDAO2 {
	public static void main(String[] args) {
		ArrayList<Sach2> list = SachDAO2.getInstance().selectAll();
		for (Sach2 sach : list) {
			System.out.println(sach.toString());
		}
		System.out.println("---------------------------");
		Sach2 find = new Sach2();
		find.setId("LTC");
		Sach2 sach2 = SachDAO2.getInstance().selectById(find);
		System.out.println(sach2);
		System.out.println("---------------------------");
		ArrayList<Sach2> list2 = SachDAO2.getInstance().selectByCondition(" giaBan<25000");
		for (Sach2 sach : list2) {
			System.out.println(sach.toString());
		}

////		Test insert: 
////		Sach Sach2 = new Sach("LTJV", "Lập trình Java", 50000, 2024);
////		Sach sach2 = new Sach("LTC", "Lập trình C", 75000, 2025);
////		Sach sach3 = new Sach("LTC#", "Lập trình C#", 35000, 2022);
////		SachDAO.getInstance().add(sach3);
//		for (int i = 0; i < 20; i++) {
//			Sach sach = new Sach("LT" + i, "Lập trình " + i, 20000, 2012);
//			SachDAO.getInstance().add(sach);
//		}
////		Test update
//		Sach Sach2 = new Sach("LTJV", "Lập trình Java", 23000, 2010);
//		SachDAO.getInstance().update(Sach2);
//
//		Test delete
//		for (int i = 10; i < 20; i++) {
//			Sach2 sach = new Sach2("LT" + i, "Lập trình " + i, 20000, 2012);
//			SachDAO2.getInstance().delete(sach);
//		}
//
	}
}

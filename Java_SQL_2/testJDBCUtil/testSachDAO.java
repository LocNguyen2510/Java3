package testJDBCUtil;

import dao.SachDAO;
import model.Sach;

public class testSachDAO {
	public static void main(String[] args) {
		Sach sach1 = new Sach("LTJV", "Lập trình Java", 50000, 2024);
		Sach sach2 = new Sach("LTC", "Lập trình C", 75000, 2025);
		SachDAO.getInstance().add(sach2);
	}
}

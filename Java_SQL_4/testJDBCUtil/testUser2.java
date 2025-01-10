package testJDBCUtil;

import dao.UserDAO2;
import model.User2;

public class testUser2 {
	public static void main(String[] args) {
		User2 u1 = new User2("u1", "123123", "loc Nguyen");
		UserDAO2.getInstance().add(u1);
		User2 u_find = new User2("u1", "123123", "loc Nguyen");
		User2 list = UserDAO2.getInstance().selectById(u_find);
		System.out.println(list.toString());
	}
}

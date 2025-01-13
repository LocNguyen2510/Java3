package testJDBCUtil;

import dao.UserDAO2;
import model.User2;

public class testUser2 {
	public static void main(String[] args) {
		User2 u1 = new User2("u1", "123123", "loc Nguyen");
		UserDAO2.getInstance().add(u1);
//		User2 u_find = new User2("u1", "123123", "loc Nguyen");
//		User2 list = UserDAO2.getInstance().selectById(u_find);
//		System.out.println(list.toString());

		User2 u_find = new User2("x\' or 1=1; -- ", "", "");
		User2 u_result = UserDAO2.getInstance().selectById(u_find);
		System.out.println(u_result);
//		for (int i = 0; i < 20; i++) {
//			User2 user = new User2("User" + i, "123123", "Nguyen Locj");
//			UserDAO2.getInstance().add(user);

//		}
	}
}

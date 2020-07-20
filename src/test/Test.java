package test;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import daoimpl.UserInfoDaoLpml;
import daoimpl.MoneyJieKouIpml;
import daoimpl.UserJieKouImpl;
import vo.Money;
import vo.User;
import vo.UserInfo;

public class Test {
	public static void main(String[] args) {
		List<User> list1 = new ArrayList<User>();
		User d = new User() ;
		UserJieKouImpl a = new UserJieKouImpl();
//		MoneyJieKouIpml aa  = new MoneyJieKouIpml();
//		UserInfoDaoLpml  aaa = new UserInfoDaoLpml();
//		System.out.println(aaa.UserInFodelete(10));
//		System.out.println(aa.moneydelete(10));
//		System.out.println(a.userdelete(10));
		list1  = a.userSeek(d);
		System.out.println(list1.size());
		
		
 		
	}
}

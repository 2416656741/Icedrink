package tool;

public class BiaoDaShi {
	//验证用户名  校验规则 ：数字 字母  并且 数字不能开头，长度5-10
	public static boolean yonghuming(String s){
		return s.matches("^[a-zA-Z]\\w{4,9}$");	
	}
	//密码校验：有字母数字组成 
	public static boolean  mima(String password) {
			return password.matches("[a-zA-Z0-9]{6,10}");
	}
	//手机号检测
	public static boolean  shoujihao(String pass) {
		return pass.matches("^1[3-9][0-9]{9}");	
	}
	//邮箱检测
	public static boolean  youxiang(String passp) {
		return passp.matches("[0-9a-zA-Z]{3,9}@[a-zA-Z1-9]{1,5}.com$");	
	}
	
	

}

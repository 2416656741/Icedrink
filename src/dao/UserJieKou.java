package dao;

import java.util.List;

import vo.User;

public interface UserJieKou {
	//查询操作
	public List<User> userSeek(User user);
	//增加记录操作
	public boolean insertuser(User user);
	//修改操作
	public boolean useralter(long uid, String upassword);
	//删除操作
	public boolean userdelete(long uid);
	
	
	
}

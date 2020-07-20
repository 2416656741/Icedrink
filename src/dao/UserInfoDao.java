package dao;

import vo.UserInfo;;

public interface UserInfoDao {
	//查找操作
	public UserInfo UserInfoseek(long uid);
	//增加记录操作
	public boolean UserInfoinsert(long uid);
	//修改操作
	public boolean UserInfoalter(UserInfo userinfo);
	//删除操作
	public boolean UserInFodelete(long uid);
}

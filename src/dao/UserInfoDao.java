package dao;

import vo.UserInfo;;

public interface UserInfoDao {
	//���Ҳ���
	public UserInfo UserInfoseek(long uid);
	//���Ӽ�¼����
	public boolean UserInfoinsert(long uid);
	//�޸Ĳ���
	public boolean UserInfoalter(UserInfo userinfo);
	//ɾ������
	public boolean UserInFodelete(long uid);
}

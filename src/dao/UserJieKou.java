package dao;

import java.util.List;

import vo.User;

public interface UserJieKou {
	//��ѯ����
	public List<User> userSeek(User user);
	//���Ӽ�¼����
	public boolean insertuser(User user);
	//�޸Ĳ���
	public boolean useralter(long uid, String upassword);
	//ɾ������
	public boolean userdelete(long uid);
	
	
	
}

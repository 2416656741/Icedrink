package tool;

public class BiaoDaShi {
	//��֤�û���  У����� ������ ��ĸ  ���� ���ֲ��ܿ�ͷ������5-10
	public static boolean yonghuming(String s){
		return s.matches("^[a-zA-Z]\\w{4,9}$");	
	}
	//����У�飺����ĸ������� 
	public static boolean  mima(String password) {
			return password.matches("[a-zA-Z0-9]{6,10}");
	}
	//�ֻ��ż��
	public static boolean  shoujihao(String pass) {
		return pass.matches("^1[3-9][0-9]{9}");	
	}
	//������
	public static boolean  youxiang(String passp) {
		return passp.matches("[0-9a-zA-Z]{3,9}@[a-zA-Z1-9]{1,5}.com$");	
	}
	
	

}

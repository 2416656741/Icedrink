package vo;

public class User {
	private Long uid;//�û�id
	private String ulogin;//��¼��
	private String upassword;//��¼����
	private int ulimit;//Ȩ�޵ȼ�
	public Long getUid() {
		return uid;
	}
	public void setUid(Long uid) {
		this.uid = uid;
	}
	public String getUlogin() {
		return ulogin;
	}
	public void setUlogin(String ulogin) {
		this.ulogin = ulogin;
	}
	public String getUpassword() {
		return upassword;
	}
	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}
	public int getUlimit() {
		return ulimit;
	}
	public void setUlimit(int ulimit) {
		this.ulimit = ulimit;
	}

}                     

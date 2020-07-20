package vo;

public class User {
	private Long uid;//用户id
	private String ulogin;//登录名
	private String upassword;//登录密码
	private int ulimit;//权限等级
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

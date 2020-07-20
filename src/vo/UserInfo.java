package vo;

public class UserInfo {
	private Long uid;//用户编号
	private String uname;//用户姓名
	private String usex;
	private Long uphone; 
	private String uemail;
	public Long getUid() {
		return uid;
	}
	public void setUid(Long uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUsex() {
		return usex;
	}
	public void setUsex(String usex) {
		this.usex = usex;
	}
	public Long getUphone() {
		return uphone;
	}
	public void setUphone(Long uphone) {
		this.uphone = uphone;
	}
	public String getUemail() {
		return uemail;
	}
	public void setUemail(String uemail) {
		this.uemail = uemail;
	}
	@Override
	public String toString() {
		return "UserInfo [uid=" + uid + ", uname=" + uname + ", usex=" + usex + ", uphone=" + uphone + ", uemail="
				+ uemail + "]";
	}
}

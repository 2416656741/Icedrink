package vo;

public class Inventory {
	private Long gid;//��Ʒid
	private String intime;//����ʱ��
	private String outime;//����ʱ��
	private Long surplus;//���
	public Long getGid() {
		return gid;
	}
	public void setGid(Long gid) {
		this.gid = gid;
	}
	public String getIntime() {
		return intime;
	}
	public void setIntime(String intime) {
		this.intime = intime;
	}
	public String getOutime() {
		return outime;
	}
	public void setOutime(String outime) {
		this.outime = outime;
	}
	public Long getSurplus() {
		return surplus;
	}
	public void setSurplus(Long surplus) {
		this.surplus = surplus;
	}
	@Override
	public String toString() {
		return "Inventory [gid=" + gid + ", intime=" + intime + ", outime=" + outime + ", surplus=" + surplus + "]";
	}
	
}

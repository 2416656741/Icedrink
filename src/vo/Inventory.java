package vo;

public class Inventory {
	private Long gid;//商品id
	private String intime;//进货时间
	private String outime;//出货时间
	private Long surplus;//库存
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

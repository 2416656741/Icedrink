package vo;

public class Goods {
	private Long gid;//饮品Id
	private String gname;//饮品名称
	private Long gprice;//饮品价格
	private String gdescribe;//饮品描述
	public Long getGid() {
		return gid;
	}
	public void setGid(Long gid) {
		this.gid = gid;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public Long getGprice() {
		return gprice;
	}
	public void setGprice(Long gprice) {
		this.gprice = gprice;
	}
	public String getGdescribe() {
		return gdescribe;
	}
	public void setGdescribe(String gdescribe) {
		this.gdescribe = gdescribe;
	}
	@Override
	public String toString() {
		return "Goods [gid=" + gid + ", gname=" + gname + ", gprice=" + gprice + ", gdescribe=" + gdescribe + "]";
	}
	
}

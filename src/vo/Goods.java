package vo;

public class Goods {
	private Long gid;//��ƷId
	private String gname;//��Ʒ����
	private Long gprice;//��Ʒ�۸�
	private String gdescribe;//��Ʒ����
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

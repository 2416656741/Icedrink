package vo;

public class Order {
	private Integer oid;//订单Id
	private Integer uid;//用户id
	private String otime;//下单时间
	private Integer oprice;//订单价格
	private String ostate;//订单状态
	public Integer getOid() {
		return oid;
	}
	public void setOid(Integer oid) {
		this.oid = oid;
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getOtime() {
		return otime;
	}
	public void setOtime(String otime) {
		this.otime = otime;
	}
	public Integer getOprice() {
		return oprice;
	}
	public void setOprice(Integer oprice) {
		this.oprice = oprice;
	}
	public String getOstate() {
		return ostate;
	}
	public void setOstate(String ostate) {
		this.ostate = ostate;
	}
	@Override
	public String toString() {
		return "Order [oid=" + oid + ", uid=" + uid + ", otime=" + otime + ", oprice=" + oprice + ", ostate=" + ostate
				+ "]";
	}
	
}

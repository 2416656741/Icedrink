package vo;

public class Money {
	private Long uid;//�û�id
	private Long balance;//���
	public Long getUid() {
		return uid;
	}
	public void setUid(Long uid) {
		this.uid = uid;
	}
	public Long getBalance() {
		return balance;
	}
	public void setBalance(Long balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Money [uid=" + uid + ", balance=" + balance + "]";
	}
}

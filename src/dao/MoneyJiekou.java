package dao;

import vo.Money;


public interface MoneyJiekou {
	//���Ҳ���
	public Money moneyseek(long uid);
	//���Ӽ�¼����
	public boolean moneyinsert(long uid);
	//�޸Ĳ���
	public boolean moneyalter(long uid,long u);
	//ɾ������
	public boolean moneydelete(long uid);
	
	
}

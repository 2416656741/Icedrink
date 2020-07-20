package dao;

import vo.Money;


public interface MoneyJiekou {
	//查找操作
	public Money moneyseek(long uid);
	//增加记录操作
	public boolean moneyinsert(long uid);
	//修改操作
	public boolean moneyalter(long uid,long u);
	//删除操作
	public boolean moneydelete(long uid);
	
	
}

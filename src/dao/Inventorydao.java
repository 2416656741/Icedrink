package dao;

import java.util.List;


import vo.Inventory;

public interface Inventorydao {

	public int adddrink(Inventory drink);
	//增加商品
	public long deldrink(long gid);
	//删除
	public int update(Inventory drink);

	//修改
	public Inventory selInventory(long gid);
	//单体查询
	public List<Inventory> selInventory1();
	//群体查询

}

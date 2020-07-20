package dao;

import java.util.List;

import vo.Order;

public interface Orderdao {
	public int addOrder(Order goods);
	//增加商品
	public int  delOrder(int oid) ;
	//删除
	public int updateOrder(Order goods) ;
	//修改
	public List<Order> selOrder() ;
	//群体查询
	public Order selOrder1(int gid);
	//单体查询

}

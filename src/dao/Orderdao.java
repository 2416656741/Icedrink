package dao;

import java.util.List;

import vo.Order;

public interface Orderdao {
	public int addOrder(Order goods);
	//������Ʒ
	public int  delOrder(int oid) ;
	//ɾ��
	public int updateOrder(Order goods) ;
	//�޸�
	public List<Order> selOrder() ;
	//Ⱥ���ѯ
	public Order selOrder1(int gid);
	//�����ѯ

}

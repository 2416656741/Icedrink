package dao;

import java.util.List;


import vo.Inventory;

public interface Inventorydao {

	public int adddrink(Inventory drink);
	//������Ʒ
	public long deldrink(long gid);
	//ɾ��
	public int update(Inventory drink);

	//�޸�
	public Inventory selInventory(long gid);
	//�����ѯ
	public List<Inventory> selInventory1();
	//Ⱥ���ѯ

}

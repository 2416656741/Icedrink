package dao;

import java.util.List;

import vo.Goods;

public interface Goodsdao {
	public int addGoods(Goods goods);
	//������Ʒ
	public long  delGoods(long gid) ;
	//ɾ��
	public int updateGoods(Goods goods) ;
	//�޸�
	public List<Goods> selInventory1() ;
	//Ⱥ���ѯ
	public Goods selInventory(long gid);
	//�����ѯ
}

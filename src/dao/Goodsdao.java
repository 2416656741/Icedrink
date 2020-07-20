package dao;

import java.util.List;

import vo.Goods;

public interface Goodsdao {
	public int addGoods(Goods goods);
	//增加商品
	public long  delGoods(long gid) ;
	//删除
	public int updateGoods(Goods goods) ;
	//修改
	public List<Goods> selInventory1() ;
	//群体查询
	public Goods selInventory(long gid);
	//单体查询
}

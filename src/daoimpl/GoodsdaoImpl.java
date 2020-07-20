package daoimpl;

import java.sql.ResultSet;
import java.util.List;

import java.util.ArrayList;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;


import dao.Goodsdao;
import tool.DbConStream;
import vo.Goods;
import vo.Inventory;


public class GoodsdaoImpl implements Goodsdao {
	private ResultSet rs = null;
	private Connection  conn =null;
	PreparedStatement ps = null;
	@Override
	//增加
	public int addGoods(Goods goods) {
		// TODO Auto-generated method stub
		conn = DbConStream.getConn();
		int i =0;
		String sql = "insert into goods values(default,?,?,?)";
		// gid intime outime surplus
		try {
			PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
			ps.setString(1,goods.getGname() );
			ps.setLong(2,goods.getGprice() );
			ps.setString(3,goods.getGdescribe() );
			i = ps.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DbConStream.close(rs,ps,conn);
		}
		return i;
	}

	@Override
	//删除
	public long delGoods(long gid) {

		// TODO Auto-generated method stub
		conn = DbConStream.getConn();
		int i =0;
		String sql = "delete from Goods where gid = ?";
		
		// gid intime outime surplus
		try {
			PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
			ps.setLong(1,gid);
			i = ps.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DbConStream.close((ResultSet) rs,ps,conn);
		}
		return i;
	}

	@Override
	//修改
	public int updateGoods(Goods goods) {
		// TODO Auto-generated method stub
		conn = DbConStream.getConn();
		int i =0;
		String sql = "update  Goods set gname=?,gprice=?,Gdescribe=? where gid = ?";
		
		// gid intime outime surplus
		try {
			PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
			ps.setString(1,goods.getGname() );
			ps.setLong(2,goods.getGprice() );
			ps.setString(3,goods.getGdescribe() );
			ps.setLong(4,goods.getGid() );
			i = ps.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DbConStream.close((ResultSet) rs,ps,conn);
		}
		return i;
	}
	@Override
	//单体查询
	public Goods selInventory(long gid) {
		// TODO Auto-generated method stub
				conn = DbConStream.getConn();
				Goods goods = new Goods();
				String sql = "select * from Goods where gid = ?";
				
				// gid intime outime surplus
				try {
					PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
					ps.setLong(1,gid);
					rs = ps.executeQuery();
					if(rs.next()) {
					goods.setGid(rs.getLong("gid"));
					goods.setGname(rs.getString("gname"));
					goods.setGprice(rs.getLong("Gprice"));
					goods.setGdescribe(rs.getString("Gdescribe"));
					}
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}finally {
					
					DbConStream.close((ResultSet) rs,ps,conn);
				}
				return goods;
		
	}
	@Override
	//群体查询
	public List<Goods> selInventory1() {
		conn = DbConStream.getConn();
		List<Goods> list = null;
		String sql = "select * from Goods ";
		
		// gid intime outime surplus
		try {
			PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
			rs = ps.executeQuery();
			list =new  ArrayList<Goods>();
			while(rs.next()) { 
			Goods gg = new Goods();
			gg.setGid(rs.getLong("gid"));
			gg.setGname(rs.getString("gname"));
			gg.setGprice(rs.getLong("gprice"));
			gg.setGdescribe(rs.getString("gdescribe"));
			list.add(gg);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			DbConStream.close((ResultSet) rs,ps,conn);
		}
		return list;
	}

}

package daoimpl;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import dao.Orderdao;
import tool.DbConStream;
import vo.Inventory;
import vo.Order;

public class OrderdaoImpl implements Orderdao {
	private ResultSet rs = null;
	private Connection  conn =null;
	PreparedStatement ps = null;
	@Override
	//增加
	public int addOrder(Order goods) {
		// TODO Auto-generated method stub
		conn = DbConStream.getConn();
		int i =0;
		String sql = "insert into tOrder values(default,?,?,?,?)";
		// gid intime outime surplus
		try {
			PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
     		ps.setInt(1,goods.getUid() );
			ps.setString(2,goods.getOtime() );
			ps.setInt(3,goods.getOprice() );
			ps.setString(4,goods.getOstate() );
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
	public int delOrder(int oid) {
		// TODO Auto-generated method stub
		conn = DbConStream.getConn();
		int i =0;
		String sql = "delete from torder where oid = ?";
		
		// gid intime outime surplus
		try {
			PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
			ps.setLong(1,oid);
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
	public int updateOrder(Order goods) {
		// TODO Auto-generated method stub
		conn = DbConStream.getConn();
		int i =0;
		String sql = "update  torder set uid=?,otime=?,oprice=?,ostate=? where oid =?";
		
		// gid intime outime surplus
		try {
			PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
			ps.setInt(1,goods.getUid() );
			ps.setString(2,goods.getOtime() );
			ps.setInt(3,goods.getOprice() );
			ps.setString(4,goods.getOstate() );
			ps.setInt(5,goods.getOid() );
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
	//群体查询
	public List<Order> selOrder() {
		// TODO Auto-generated method stub
		conn = DbConStream.getConn();
		List<Order> list = null;
		String sql = "select * from tOrder ";
		
		// gid intime outime surplus
		try {
			PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
			rs = ps.executeQuery();
			list =new  ArrayList<Order>();
			while(rs.next()) { 
			Order gg = new Order();
			gg.setOid(rs.getInt("oid"));
			gg.setUid(rs.getInt("uid"));
			gg.setOtime(rs.getString("otime"));
			gg.setOprice(rs.getInt("oprice"));
			gg.setOstate(rs.getString("ostate"));
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

	@Override
	//单体查询
	public Order selOrder1(int oid) {
		// TODO Auto-generated method stub
		conn = DbConStream.getConn();
		Order goods = new Order();
		String sql = "select * from torder where oid = ?";
		
		// gid intime outime surplus
		try {
			PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
			ps.setInt(1,oid);
			rs = ps.executeQuery();
			if(rs.next()) {
				goods.setOid(rs.getInt("oid"));
				goods.setUid(rs.getInt("uid"));
				goods.setOtime(rs.getString("otime"));
				goods.setOprice(rs.getInt("oprice"));
				goods.setOstate(rs.getString("ostate"));

			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			DbConStream.close((ResultSet) rs,ps,conn);
		}
		return goods;
	}

}

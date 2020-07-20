package daoimpl;



import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import dao.Inventorydao;
import tool.DbConStream;
import vo.Inventory;

public class InventorydaoImpl implements Inventorydao {
	private ResultSet rs = null;
	private Connection  conn =null;
	PreparedStatement ps = null;
	@Override
	public int adddrink(Inventory drink) {
		// TODO Auto-generated method stub
		conn = DbConStream.getConn();
		int i =0;
		String sql = "insert into Inventory values(?,?,?,?)";
		// gid intime outime surplus
		try {
			PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
     		ps.setLong(1,drink.getGid() );
			ps.setString(2,drink.getIntime() );
			ps.setString(3,drink.getOutime() );
			ps.setLong(4,drink.getSurplus() );
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
	public long deldrink(long gid) {
		// TODO Auto-generated method stub
		conn = DbConStream.getConn();
		int i =0;
		String sql = "delete from Inventory where gid = ?";
		
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
	public int update(Inventory drink) {
		// TODO Auto-generated method stub
		conn = DbConStream.getConn();
		int i =0;
		String sql = "update  Inventory set intime=?,outime=?,surplus=? where gid =?";
		
		// gid intime outime surplus
		try {
			PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
			ps.setString(1,drink.getIntime() );
			ps.setString(2,drink.getOutime() );
			ps.setLong(3,drink.getSurplus() );
			ps.setLong(4,drink.getGid() );
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
	//单个查询
	public Inventory selInventory(long gid) {
		// TODO Auto-generated method stub
		conn = DbConStream.getConn();
		Inventory drink = new Inventory();
		String sql = "select * from inventory where gid = ?";
		
		// gid intime outime surplus
		try {
			PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
			ps.setLong(1,gid);
			rs = ps.executeQuery();
			if(rs.next()) {
			drink.setGid(rs.getLong("gid"));
			drink.setIntime(rs.getString("intime"));
			drink.setOutime(rs.getString("Outime"));
			drink.setSurplus(rs.getLong("Surplus"));
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			DbConStream.close((ResultSet) rs,ps,conn);
		}
		return drink;
	}
	@SuppressWarnings("null")
	@Override
	public List<Inventory> selInventory1() {
		conn = DbConStream.getConn();
		List<Inventory> list = null;
		String sql = "select * from inventory ";
		
		// gid intime outime surplus
		try {
			PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
			rs = ps.executeQuery();
			list =new  ArrayList<Inventory>();
			while(rs.next()) { 
			Inventory gg = new Inventory();
			gg.setGid(rs.getLong("gid"));
			gg.setIntime(rs.getString("intime"));
			gg.setOutime(rs.getString("Outime"));
			gg.setSurplus(rs.getLong("Surplus"));
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

	public ResultSet getRs() {
		return rs;
	}

	public void setRs(ResultSet rs) {
		this.rs = rs;
	}

}

package daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import tool.DbConStream;
import vo.Money;
import vo.User;
import dao.MoneyJiekou;
//查询操作具体实现
public class MoneyJieKouIpml implements MoneyJiekou {
    Money money = null;
	@Override
	public Money moneyseek(long uid) {
		String sql = "select * from tmoney where uid = ? ";
		Connection conn = DbConStream.getConn();
		try {
			    
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setLong(1,uid);
			ResultSet rs = ps.executeQuery();
			if(rs.next()){ 
				money = new Money();
				money.setUid(rs.getLong("uid"));
				money.setBalance(rs.getLong("balance"));
			}
		} catch (Exception e) {	
			e.printStackTrace();
		}
		return money;
	}

	@Override//添加操作具体实现
	public boolean moneyinsert(long uid) {
		boolean ae = false;
		String sql = "insert into tmoney  values (?,0)";
		Connection conn = DbConStream.getConn();
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setLong(1,uid);
			int aee = ps.executeUpdate();
			ae = aee > 0 ? true : false;
		} catch (SQLException e) {	
			e.printStackTrace();
		}
		
		
		return ae;
	}
	@Override//修改操作具体实现
	public boolean moneyalter(long uid,long ubalance ) {
		boolean ace = false;
		String sql = "update tmoney set balance = ? where uid = ?";
		Connection conn = DbConStream.getConn();
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setLong(1,ubalance);
			ps.setLong(2,uid);
			int aee = ps.executeUpdate();
			ace = aee > 0 ? true : false;
		} catch (SQLException e) {	
			e.printStackTrace();
		}		
		return ace;
	}

	@Override//删除
	public boolean moneydelete(long uid) {
		boolean ace = false;
		Connection conn = DbConStream.getConn();
		String sql = " delete from  tmoney  where uid = ?";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setLong(1, uid);
			int aee = ps.executeUpdate();
		    ace = aee > 0 ? true : false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ace;
	}
}

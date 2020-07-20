package daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import tool.DbConStream;
import vo.Money;
import vo.UserInfo;
import dao.UserInfoDao;

public class UserInfoDaoLpml implements UserInfoDao {
	UserInfo userinfo = null;
	Connection conn = null;
	PreparedStatement ps = null;
	@Override//查找操作
	public UserInfo UserInfoseek(long uid) {
		String sql = "select * from userinfo where uid = ? ";
		conn = DbConStream.getConn();
		 try {
			ps = (PreparedStatement)conn.prepareStatement(sql);
			ps.setLong(1,uid);
			ResultSet rs = ps.executeQuery();
			if(rs.next()){ 
				userinfo = new UserInfo();
				userinfo.setUid(uid);
				userinfo.setUname(rs.getString("uname"));
				userinfo.setUsex(rs.getString("usex"));
				userinfo.setUphone(rs.getLong("uphone"));
				userinfo.setUemail(rs.getString("uemail"));			
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally{
			
		}
		return userinfo;
	}

	@Override//添加操作
	public boolean UserInfoinsert(long uid) {
		boolean ae = false;
		String sql = "insert into userinfo  values (?,'张一','男','10000000000','1@qq.com')";
		conn = DbConStream.getConn();
		try {
			ps = (PreparedStatement)conn.prepareStatement(sql);
			ps.setLong(1,uid);
			int aee = ps.executeUpdate();
			ae = aee > 0 ? true : false;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ae;
	}

	@Override//修改操作
	public boolean UserInfoalter(UserInfo userinfo1) {
		boolean ace = false;
		String sql = "update userinfo set uname = ? ,usex = ?,uphone = ?,uemail= ? where uid = ?";
		conn = DbConStream.getConn();
		try {
			ps = (PreparedStatement)conn.prepareStatement(sql);
			ps.setString(1,userinfo1.getUname());
			ps.setString(2,userinfo1.getUsex());
			ps.setLong(3, userinfo1.getUphone());
			ps.setString(4, userinfo1.getUemail());
			ps.setLong(5, userinfo1.getUid());
			int aee = ps.executeUpdate();
		    ace = aee > 0 ? true : false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ace;
	}

	@Override
	public boolean UserInFodelete(long uid) {
		boolean ace = false;
		conn = DbConStream.getConn();
		String sql = " delete from  userinfo  where uid = ?";
		try {
			ps = (PreparedStatement)conn.prepareStatement(sql);
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

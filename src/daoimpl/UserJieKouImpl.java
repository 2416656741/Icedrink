package daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;

import jframe.Yonghu;
import dao.UserJieKou;
import tool.DbConStream;
import vo.User;

public class UserJieKouImpl implements UserJieKou{

	@Override//查询操作的具体实现
	public  List<User> userSeek(User user) {
		List<User> list = new ArrayList<User>();
		String sql = "select * from user ";
		Connection conn = DbConStream.getConn();
		StringBuilder sql1 = new StringBuilder(sql);
		if(user.getUlogin() != null ){
				sql1.append(" and ulogin = " + "'" +user.getUlogin()+ "'");
						
		}
		 if(user.getUpassword() != null ){
				sql1.append(" and upassword = " + "'"+user.getUpassword()+"'");
		}
		String sql2 = sql1.toString().replaceFirst("and", "where");
		try {
	      	PreparedStatement ps = conn.prepareStatement(sql2);
	      	
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				user = new User();
				user.setUid(rs.getLong("uid"));
				user.setUlogin(rs.getString("ulogin"));
				user.setUpassword(rs.getString("upassword"));
				user.setUlimit(rs.getInt("ulimit"));
				list.add(user);
				
			}
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		//如果 当前集合的长度 > 0 , 至少一个人
		return list;
}

	@Override
	//注册业务具体实现
	public boolean insertuser(User user) {
		boolean aa = false;
		String sql = "insert into user  values (default,?,?,'1')";
		try {
			Connection conn = DbConStream.getConn();
			PreparedStatement ps = conn.prepareStatement(sql);
		
			ps.setString(1,user.getUlogin());
			ps.setString(2,user.getUpassword());
			System.out.println(sql);
			int a = ps.executeUpdate();
			aa = a > 0 ? true : false;
			
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return aa;
	}
	@Override//用户修改实现
	public boolean useralter(long uid,String upassword) {
		boolean aa = false;
		String sql = "update  user set upassword = ? where uid = ?";
		try {
			Connection conn = DbConStream.getConn();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setNString(1,upassword);
			ps.setLong(2,uid);
			int a = ps.executeUpdate();
			aa = a > 0 ? true : false;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return aa;
	}
     //删除
	@Override
	public boolean userdelete(long uid) {
		boolean aa = false;
		String sql = "delete from  user  where uid = ?";
		Connection conn = DbConStream.getConn();
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setLong(1,uid);
			int a = ps.executeUpdate();
			aa = a > 0 ? true : false;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return aa;
	}



	

}

package cn.gaopengtao.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.gaopengtao.entiy.User;
import cn.gaopengtao.util.MysqlJdbc;

public class BaseDaoImpl{
	private static Connection conn = null;
	private static PreparedStatement ps = null;
	/**
	 * 查询数据库是否存在用户名和密码
	 * @param sql
	 * @param ls
	 * @return
	 */
	public static User selectInfo(String sql, List<Object> ls) {
		
		ResultSet rs = null;
		User user = null;
		try {
			conn = MysqlJdbc.getConnection();
			ps  = conn.prepareStatement(sql);
			
			for(int i = 1;i<=ls.size();i++) { 
				ps.setObject(i, ls.get(i-1));
			}
			
			rs = ps.executeQuery();
			while(rs.next()) {
				user = new User();
				user.setUser_id(rs.getInt("user_id"));
				user.setUser_name(rs.getString("user_name"));
				user.setUser_account(rs.getString("user_account"));
				user.setUser_tel(rs.getString("user_tel"));
				user.setUser_email(rs.getString("user_email"));
				user.setUser_date(rs.getDate("user_date"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("出现异常");
			e.printStackTrace();
		}
		return user;
	}


	public static boolean updateInfo(String sql, List<Object> ls) {

		int i = 0;
		try {
			conn = MysqlJdbc.getConnection();
			ps = conn.prepareStatement(sql);
			for(int j = 1;j<=ls.size();j++) {
				ps.setObject(j, ls.get(j-1));
			}
			i = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(i>0) return true;
		return false;
	}
	
	
}

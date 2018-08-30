package cn.gaopengtao.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import cn.gaopengtao.dao.BaseDao;
import cn.gaopengtao.util.MysqlJdbc;

public class BaseDaoImpl implements BaseDao{
	private  Connection conn = null;
	private  PreparedStatement ps = null;

	@Override
	public ResultSet selectInfo(String sql, List<Object> ls) {
		// TODO Auto-generated method stub
		ResultSet rs = null;
		try {
			conn = MysqlJdbc.getConnection();
			ps  = conn.prepareStatement(sql);
			for(int i = 0;i<=ls.size();i++) {
				ps.setObject(i, ls.get(i-1));
			}
			rs = ps.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}

	@Override
	public int updateInfo(String sql, List<Object> ls) {
		// TODO Auto-generated method stub
		int i = 0;
		try {
			conn = MysqlJdbc.getConnection();
			ps = conn.prepareStatement(sql);
			for(int j = 0;j<=ls.size();j++) {
				ps.setObject(j, ls.get(j-1));
			}
			i = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}
	
	
}

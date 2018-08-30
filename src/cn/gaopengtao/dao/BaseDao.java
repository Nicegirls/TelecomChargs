package cn.gaopengtao.dao;

import java.sql.ResultSet;
import java.util.List;

public interface BaseDao{
	/**
	 * 查询数据库中数据是否存在
	 */
	public ResultSet selectInfo(String sql,List<Object> ls);
	/**
	 * 对数据库中数据进行修改
	 */
	public int updateInfo(String sql,List<Object> ls);
}

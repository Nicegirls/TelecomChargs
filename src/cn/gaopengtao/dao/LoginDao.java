package cn.gaopengtao.dao;

import java.sql.ResultSet;
import java.util.List;

import cn.gaopengtao.entiy.User;

public interface LoginDao {
	/**
	 * 检测用户登陆
	 * @param account
	 * @param psw
	 * @return
	 */
	public User checkLogin(String account,String psw);

}

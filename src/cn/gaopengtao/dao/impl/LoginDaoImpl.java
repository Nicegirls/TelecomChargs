package cn.gaopengtao.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import cn.gaopengtao.dao.LoginDao;
import cn.gaopengtao.entiy.User;
import cn.gaopengtao.util.MysqlJdbc;


public class LoginDaoImpl implements LoginDao{
	List list = new ArrayList<>();
	User user = null;
	@Override
	public User checkLogin(String account,String psw) {
		// TODO Auto-generated method stub
//		ResultSet rs = null;
		String sql = "select * from user where user_account = ? and user_psw = ?";
		list.clear();
		list.add(account);
		list.add(psw);
		user = BaseDaoImpl.selectInfo(sql, list);
		return user;		
	}
}

package cn.gaopengtao.service.impl;

import java.sql.ResultSet;
import java.util.List;

import cn.gaopengtao.dao.LoginDao;
import cn.gaopengtao.dao.impl.LoginDaoImpl;
import cn.gaopengtao.entiy.User;
import cn.gaopengtao.service.LoginService;

public class LoginServiceImpl implements LoginService{

	@Override
	public User CheckUserLoginService(String account,String psw) {
		// TODO Auto-generated method stub
		LoginDao loginDao = new LoginDaoImpl();
		return loginDao.checkLogin(account,psw);
	}
}

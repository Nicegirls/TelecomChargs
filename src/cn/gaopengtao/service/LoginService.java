package cn.gaopengtao.service;

import java.sql.ResultSet;
import java.util.List;

import cn.gaopengtao.entiy.User;

public interface LoginService {
	/**
	 * 检验用户登陆
	 * @param account
	 * @param psw
	 * @return
	 */
	public User CheckUserLoginService(String account,String psw);
}

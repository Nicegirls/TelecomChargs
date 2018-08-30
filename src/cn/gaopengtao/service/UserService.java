package cn.gaopengtao.service;

import cn.gaopengtao.entiy.User;

public interface UserService {
	/**
	 * 检验用户登陆
	 */
	User CheckUserLoginService(String name,String psw);
}

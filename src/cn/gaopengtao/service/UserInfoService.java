package cn.gaopengtao.service;

import cn.gaopengtao.entiy.User;

public interface UserInfoService {
	/**
	 * 修改用户信息
	 * @param user
	 * @return
	 */
	public boolean updateInfo(User user);
	/**
	 * 修改用户密码
	 * @param user
	 * @return
	 */
	public boolean updatepwd(User user);
}

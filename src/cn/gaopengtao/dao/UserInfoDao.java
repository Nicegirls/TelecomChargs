package cn.gaopengtao.dao;

import cn.gaopengtao.entiy.User;

public interface UserInfoDao {
	/**
	 * 修改用户自身信息
	 * @param user
	 * @return
	 */
	public boolean updateInfo(User user);
}

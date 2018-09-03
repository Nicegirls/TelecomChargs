package cn.gaopengtao.dao.impl;

import java.util.ArrayList;
import java.util.List;

import cn.gaopengtao.dao.UserInfoDao;
import cn.gaopengtao.entiy.User;

public class UserInfoDaoImpl implements UserInfoDao {
	List list = new ArrayList();
	@Override
	public boolean updateInfo(User user) {
		// TODO Auto-generated method stub
		String sql = "update user set user_name = ?,user_tel = ?,user_email = ?,user_date = NOW() where user_id = ?";
		list.clear();
		list.add(user.getUser_name());
		list.add(user.getUser_tel());
		list.add(user.getUser_email());
		list.add(user.getUser_id());
		return BaseDaoImpl.updateInfo(sql, list);
	}

}

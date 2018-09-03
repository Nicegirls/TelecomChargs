package cn.gaopengtao.service.impl;

import cn.gaopengtao.dao.UserInfoDao;
import cn.gaopengtao.dao.impl.UserInfoDaoImpl;
import cn.gaopengtao.entiy.User;
import cn.gaopengtao.service.UserInfoService;

public class UserInfoServiceImpl implements UserInfoService {

	@Override
	public boolean updateInfo(User user) {
		// TODO Auto-generated method stub
		UserInfoDao userInfoDao = new UserInfoDaoImpl(); 
		return userInfoDao.updateInfo(user);
	}

}

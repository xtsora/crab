package com.asiainfo.user.mapper;

import com.asiainfo.user.bean.UserDo;

public interface UserMapper {

	/**
	 * 创建用户
	 */
	public Integer insertUser(UserDo user); 
}

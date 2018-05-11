package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.User;

/**
 * Created by igezo on 2018/5/11.
 */
public interface IUserService {

    ServerResponse<User> login(String username, String password);
}

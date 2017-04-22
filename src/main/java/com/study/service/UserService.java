package com.study.service;

import com.github.pagehelper.PageInfo;
import com.study.model.User;

/**
 * Created by yangqj on 2017/4/21.
 */
public interface UserService extends IService<User>{
    public PageInfo<User> selectByPage(User user, int start, int length);
}
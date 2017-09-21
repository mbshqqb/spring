package com.zj.biz.bizImpl;

import com.zj.biz.UserBiz;
import com.zj.dao.UserDao;

import javax.annotation.Resource;
import java.util.List;

public class UserBizImpl implements UserBiz {

    @Resource(name = "userDao")
    List<UserDao>userDao;
    public void sayHello() {
        System.out.println(userDao.getClass().getName());
    }
}

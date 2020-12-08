package com.pluto.Login_regist.dao;

import com.pluto.Login_regist.pojo.User;

/**
 * @author 17763
 */
public interface UserDao {
    /**
     * 登录方法
     * @param userName 用户名
     * @param password 密码
     * @return 登录是否成功
     */
    public abstract  boolean isLogin(String userName,String password);

    /**
     * 注册方法
     */
    public abstract void isRegist(User user);


}


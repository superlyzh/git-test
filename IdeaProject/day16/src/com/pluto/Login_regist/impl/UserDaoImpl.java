package com.pluto.Login_regist.impl;

import com.pluto.Login_regist.dao.UserDao;
import com.pluto.Login_regist.pojo.User;

import java.util.ArrayList;

public class UserDaoImpl implements UserDao {
    private static ArrayList<User> array = new ArrayList<User>();

    @Override
    public boolean isLogin(String userName, String password) {
        boolean falg = false;
        for (User u:array) {
            if (u.getUserName().equals(userName)
                    &&u.getPassword().equals(password)){
                falg = true;
                break;
            }
        }
        return falg;
    }

    @Override
    public void isRegist(User user) {
        array.add(user);
    }

    @Override
    public String toString() {
        return "UserDaoImpl{" +
                "array=" + array +
                '}';
    }
}

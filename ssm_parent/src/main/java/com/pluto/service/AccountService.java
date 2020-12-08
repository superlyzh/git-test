package com.pluto.service;

import com.pluto.domain.Account;

import java.util.List;

/**
 * @ClassName AccountService
 * @Deacription TODO
 * @Author pluto
 * @Date 2020/12/8 11:53
 * @Version 1.0
 **/
public interface AccountService {

    //查询所有账户
    public List<Account> findAll();
    //保存账户信息
    public void saveAccount(Account account);

}

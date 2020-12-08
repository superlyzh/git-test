package com.pluto.service.impl;

import com.pluto.domain.Account;
import com.pluto.service.AccountService;

import java.util.List;

/**
 * @ClassName AccountServiceImpl
 * @Deacription TODO
 * @Author pluto
 * @Date 2020/12/8 11:54
 * @Version 1.0
 **/
public class AccountServiceImpl implements AccountService {
    public List<Account> findAll() {
        System.out.println("业务层:查询所有账户....");
        return null;
    }

    public void saveAccount(Account account) {
        System.out.println("业务层:保存账户....");
    }
}

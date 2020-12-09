package com.pluto.service.impl;

import com.pluto.dao.AccountDao;
import com.pluto.domain.Account;
import com.pluto.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName AccountServiceImpl
 * @Deacription TODO
 * @Author pluto
 * @Date 2020/12/8 11:54
 * @Version 1.0
 **/
@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Override
    public List<Account> findAll() {
        System.out.println("业务层:查询所有账户....");
        return accountDao.findAll();
    }

    @Override
    public void saveAccount(Account account) {
        System.out.println("业务层:保存账户....");
        accountDao.saveAccount(account);
    }
}

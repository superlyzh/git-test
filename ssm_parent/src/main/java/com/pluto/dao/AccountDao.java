package com.pluto.dao;


import com.pluto.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * @ClassName AccountDao
 * @Deacription TODO
 * @Author pluto
 * @Date 2020/12/8 11:48
 * @Version 1.0
 **/
@Repository
public interface AccountDao {
    //查询所有账户
    @Select("select * from account")
    public List<Account> findAll();
    //保存账户信息
    @Insert("insert into account(name,money) values(#{name},#{money})")
    public void saveAccount(Account account);

}

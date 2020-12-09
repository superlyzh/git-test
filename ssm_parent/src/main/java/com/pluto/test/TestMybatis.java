package com.pluto.test;


import com.pluto.dao.AccountDao;
import com.pluto.domain.Account;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @ClassName TestMybatis
 * @Deacription TODO
 * @Author pluto
 * @Date 2020/12/8 21:28
 * @Version 1.0
 **/
public class TestMybatis {
    @Test
    public void run1() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory fa = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = fa.openSession();
        AccountDao dao = sqlSession.getMapper(AccountDao.class);
        List<Account> all = dao.findAll();
        for (Account account : all) {
            System.out.println(account);
        }
        sqlSession.close();
        resourceAsStream.close();
    }
    @Test
    public void run2() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory fa = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = fa.openSession(true);
        AccountDao dao = sqlSession.getMapper(AccountDao.class);
        List<Account> all = dao.findAll();
        Account account = new Account();
        account.setId(4);
        account.setName("丹尼斯");
        account.setMoney(2000.0);
        dao.saveAccount(account);
        sqlSession.close();
        resourceAsStream.close();
    }
}

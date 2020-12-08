package com.pluto.internettest;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReflectTest {
    public static void main(String[] args) throws Exception {
        Properties pro = new Properties();
        InputStream is = ReflectTest.class.getClassLoader().getResourceAsStream("pro.properties");
        pro.load(is);

        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");

        Class cls =Class.forName(className);
        Object obj = cls.newInstance();
        cls.getMethod(methodName).invoke(obj);
    }
}

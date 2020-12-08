package com.pluto.properties;

import java.util.Properties;

public class PropertiesDemo1 {
    public static void main(String[] args) {
        Properties prop = new Properties();
        prop.setProperty("id","1001");
        prop.setProperty("user","tom");
        prop.setProperty("password","123");

        for (Object o:prop.keySet()) {
            System.out.println(o+"------"+prop.get(o));
        }
    }
}

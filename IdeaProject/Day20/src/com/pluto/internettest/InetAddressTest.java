package com.pluto.internettest;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {
    public static void main(String[] args) throws UnknownHostException {

        InetAddress[] allByName = InetAddress.getAllByName("127.0.0.1");
        for (InetAddress inetAddress : allByName) {
            System.out.println(inetAddress);
        }
        System.out.println(InetAddress.getAllByName("www.baidu.com"));
        System.out.println(InetAddress.getByName("127.0.0.1"));
        System.out.println(InetAddress.getByName("www.baidu.com"));

    }

}

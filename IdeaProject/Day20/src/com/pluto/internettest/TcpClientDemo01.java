package com.pluto.internettest;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;


/**
 * 客户端
 * @author 17763
 */
public class TcpClientDemo01 {
    public static void main(String[] args) throws IOException {
//        InetAddress serverIp = InetAddress.getByName("127.0.0.1");
//        int port = 8888;
        Socket socket = new Socket("127.0.0.1", 8888);
        OutputStream os = socket.getOutputStream();
        os.write("小华six".getBytes());

        InputStream is = socket.getInputStream();
        byte[] bys = new byte[1024];
        int len = is.read(bys);
            System.out.println(new String(bys,0,len));

    socket.close();

    }
}

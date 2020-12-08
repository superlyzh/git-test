package com.pluto.internettest;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务端
 * @author 17763
 */
public class TcpServerDemo01 {
    public static void main(String[] args) throws IOException {

        ServerSocket socket = new ServerSocket(8888);
        Socket accept = socket.accept();
        InputStream is = accept.getInputStream();
        byte[] bys = new byte[1024];
        int len = is.read(bys);
        System.out.println(new String(bys,0,len));

        OutputStream os = accept.getOutputStream();
        os.write("hello".getBytes());


        socket.close();
        accept.close();
    }
}

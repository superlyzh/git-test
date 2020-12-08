package com.pluto.internettest;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServerDemo02 {
    public static void main (String[] args) throws  IOException {
        ServerSocket sc = new ServerSocket(8888);
        Socket socket = sc.accept();
        InputStream is = socket.getInputStream();
        BufferedOutputStream bs = new BufferedOutputStream(new FileOutputStream("D:/socket.flv")) ;
        byte[] bys = new byte[1024];
        int len = 0;
        while((len = is.read(bys)) != -1){
            bs.write(bys,0,len);
        }
        socket.getOutputStream().write("收到,谢谢".getBytes());

        socket.close();
        bs.close();
        sc.close();
    }
}

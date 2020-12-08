package com.pluto.internettest;

import java.io.*;
import java.net.Socket;

public class TcpClientDemo02 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\机器人.flv"));
        Socket socket = new Socket("127.0.0.1",8888);
        while(true) {
            OutputStream os = socket.getOutputStream();
            byte[] bys = new byte[1024];
            int len = 0;
            while ((len = bis.read(bys)) != -1) {
                os.write(bys, 0, len);
            }
            socket.shutdownOutput();
            InputStream is = socket.getInputStream();
            while ((len = is.read(bys)) != -1) {
                System.out.println(new String(bys, 0, len));
            }
            bis.close();
            socket.close();
        }
    }
}

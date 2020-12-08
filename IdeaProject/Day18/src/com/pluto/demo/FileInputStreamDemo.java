package com.pluto.demo;

import java.io.*;

/**
 * @author 17763
 */
public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {

        InputStream is = new FileInputStream("D:\\BaiduNetdiskDownload\\javaLiuYi\\day16\\avi\\16.29_day16总结.avi");
        OutputStream os = new FileOutputStream("D:/a.avi");
        byte[] bys = new byte[1024];
        int i = 0;
        while((i = is.read(bys)) != -1) {
                os.write(bys,0,i);
        }
        os.close();
        is.close();

    }
}

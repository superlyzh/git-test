package com.pluto.demo;

import java.io.*;

/**
 * @author 17763
 */
public class BufferInputStreamDemo {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(
                new FileInputStream("D:\\11_转换流的原理.flv"));
        BufferedOutputStream bos = new BufferedOutputStream(
                new FileOutputStream("D:\\转换流.flv"));

       /* byte[] bys = new byte[1024];
        int len = 0;
        long start = System.currentTimeMillis();
        while((len = bis.read(bys))!=-1){
            bos.write(bys,0,len);
        }*/
        InputStream is = new FileInputStream("D:\\11_转换流的原理.flv");
        OutputStream os = new FileOutputStream("D:/a.flv");
        long start = System.currentTimeMillis();
        byte[] bys = new byte[1024];
        int i = 0;
        while((i = is.read(bys)) != -1) {
            os.write(bys,0,i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}

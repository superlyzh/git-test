package com.pluto.io;

import java.io.*;

public class OutputSteramTest {
    public static void main(String[] args) throws IOException {
        OutputStream os = new FileOutputStream("D:/demo.txt",true);

/*

        os.write(97);
        os.write("\r\n".getBytes());
        os.write(98);
        os.write("\r\n".getBytes());
*/

        os.close();

        InputStream is = new FileInputStream("D:/demo.txt");
        int by = -1;
       while((by = is.read())!=-1){
           System.out.println((char)by);
       }
        is.close();


    }
}

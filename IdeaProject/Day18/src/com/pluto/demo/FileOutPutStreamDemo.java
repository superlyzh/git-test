package com.pluto.demo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @author 17763
 */
public class FileOutPutStreamDemo {
    public static void main(String[] args) throws IOException {

        OutputStream os = null;
        try {
            os = new FileOutputStream("D:\\test1.txt",true);
            for (int i = 0; i < 10; i++) {
                os.write(("hello.IO"+i).getBytes());
                os.write("\r\n".getBytes());}
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            assert os != null;
            try {
                os.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }


    }
}

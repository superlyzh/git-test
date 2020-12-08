package com.pluto.io;

import java.io.File;

public class FilePathDemo {
    public static void main(String[] args) {
        File file = new File("D:\\BaiduNetdiskDownload\\javaLiuYi");
        filePath(file);
    }

    public static void filePath(File file){
        File[] listFiles = file.listFiles();
        for(File f:listFiles){
            if(f.isFile()){
                if(f.getName().endsWith(".avi")){
                    System.out.println(f.getAbsolutePath());
                }
            }else{
                filePath(f);
            }
        }
    }
}

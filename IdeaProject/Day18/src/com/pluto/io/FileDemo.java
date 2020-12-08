package com.pluto.io;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
            File f = new File("D:\\BaiduNetdiskDownload\\javaLiuYi\\day01");
        System.out.println(f.getAbsoluteFile());
        System.out.println(f.getPath());
        String[] list = f.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                    return new File(dir,name).isFile()&&name.endsWith(".jpg");
            }
        });
        for(String s:list){
            System.out.println(s);
        }
        File[] files = f.listFiles();
        for (File fi:files ) {
            if (fi.isFile()) {
                if(fi.getName().endsWith(".jpg")){
                    System.out.println(fi);
                }
            }
            }
        }
    }


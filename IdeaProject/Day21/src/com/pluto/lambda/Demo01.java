package com.pluto.lambda;

public class Demo01 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("线程执行啦");
            }
        }).start();

        new Thread(()-> System.out.println("lambda表达式执行了")).start();
    }

}

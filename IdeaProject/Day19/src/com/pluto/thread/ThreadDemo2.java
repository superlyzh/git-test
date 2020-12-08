package com.pluto.thread;

public class ThreadDemo2 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {

        System.out.println(Thread.currentThread().getName()+"Hello runnable"+i);
        }
    }
}
class ThreadTest2 {
    public static void main(String[] args) {
        ThreadDemo2 r =new ThreadDemo2();
        Thread t1 = new Thread(r,"one");
        t1.start();
        Thread t2 = new Thread(r,"two");
        t2.start();
    }

}

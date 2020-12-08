package com.pluto.thread;

public class ThreadDemo1 extends Thread{
    public ThreadDemo1(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()+"Hello"+i);
        }
    }
}
class ThreadTest1{
    public static void main(String[] args) {

        ThreadDemo1 t1 = new ThreadDemo1("one");
        t1.start();
        ThreadDemo1 t2 = new ThreadDemo1("two");
        t2.start();
        for (int i = 0; i < 100; i++) {
            System.out.println("World"+i);
        }

    }

}
package com.pluto.thread;

import java.util.Random;

public class ThreadDemo3 {
    public static void main(String[] args) {
        Cus c = new Cus();
        Thread t1 = new Thread(c);
        Thread t2 = new Thread(c);
        t1.start();
        t2.start();
    }
}

class Bank{

    private int sum;
     Object obj = new Object();
    public synchronized void  add(int cash) throws InterruptedException {

            sum += cash;
            Thread.sleep(10);
            System.out.println("sum=" + sum);
    }
}


class Cus implements Runnable{
    private Bank b= new Bank();

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            try {
                b.add(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
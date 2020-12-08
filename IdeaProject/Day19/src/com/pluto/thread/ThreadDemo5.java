package com.pluto.thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadDemo5 {
    public static void main(String[] args) {
        Baozipu bzp = new Baozipu();
        new Thread(new Producer(bzp)).start();
        new Thread(new Consumer(bzp)).start();
        new Thread(new Producer(bzp)).start();
        new Thread(new Consumer(bzp)).start();
    }



}

class Baozipu{
    private String name;
    private String bun;
    private int count = 1;
    private boolean flag = false;
    private Lock lock = new ReentrantLock();
    private Condition con = lock.newCondition();
    private Condition con_pro = lock.newCondition();
    public  void setBun(String name,String bun) throws InterruptedException {
        lock.lock();
        try {
            while (flag) {
                con_pro.await();
            }
            this.name = name + "--" + count++;
            this.bun = bun;
            System.out.println(name + "生产---" + bun);
            flag = true;
            con.signal();
        }finally {
            lock.unlock();
        }
    }

    public  void getBun() throws InterruptedException {
        lock.lock();
        try {
            while (!flag) {
                con.await();
            }
            System.out.println(name + "---吃" + bun);
            flag = false;
            con_pro.signal();
        } finally {
            lock.unlock();
        }
    }
}
class Producer implements Runnable{
    int x = 0;
    private Baozipu bz;
    public Producer(Baozipu bz) {
        this.bz = bz;
    }
    @Override
    public void run() {

        while(true){
            if(x == 0){
                try {
                    bz.setBun("张三","韭菜馅包子");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else{
                try {
                    bz.setBun("李四","猪肉包子");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            x = (x+1)%2;
        }
    }
}
class Consumer implements Runnable{
    private Baozipu bz;
    public Consumer(Baozipu bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        while(true){
            try {
                bz.getBun();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
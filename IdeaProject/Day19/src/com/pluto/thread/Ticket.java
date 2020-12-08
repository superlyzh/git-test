package com.pluto.thread;

public class Ticket extends Thread{
    private static  int Ticket = 100;
    public Ticket(String name){
        super(name);
    }
   private static Object obj = new Object();
    @Override
    public void run() {
        while(true){
            synchronized (obj) {
            if(Ticket > 0) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("sale:" + Thread.currentThread().getName()
                            + "正在卖第" + (Ticket--) + "张票");
                }else{
                break;
            }
                }
            }
        }
    }


class  SaleTicket {
    public static void main(String[] args) {
        Ticket t1 = new Ticket("窗口1");
        Ticket t2 = new Ticket("窗口2");
        Ticket t3 = new Ticket("窗口3");
        Ticket t4 = new Ticket("窗口4");

        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}
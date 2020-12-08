package com.pluto.thread;

public class ThreadDemo4 {
    public static void main(String[] args) {
        Student s = new Student();
        new Thread(new Input(s)).start();
        new Thread(new Output(s)).start();


    }

}
class Input implements  Runnable {
    private Student s;

    public Input(Student s) {
        this.s = s;
    }

    @Override
    public void run() {
        int x = 0;
        while (true) {
            if(x == 0){
                try {
                    s.set("mike","man");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else{
                try {
                    s.set("丽丽","女");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            x = (x+1)%2;
        }

    }
}
class Output implements Runnable{
    private Student s;

    public Output(Student s) {
        this.s = s;
    }

    @Override
    public void run() {
        synchronized (s) {
            while (true) {
                try {
                    s.out();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
class Student {
    private String name;
    private String sex;
    private boolean flag = false;

    public Student() {
    }

    public Student(String name, String sex) {

        this.name = name;
        this.sex = sex;
    }

    public synchronized void set(String name, String sex) throws InterruptedException {
        if(flag){
            this.wait();
         }
        this.name = name;
        this.sex = sex;

        flag = true;
        this.notify();
    }

    public synchronized void out() throws InterruptedException {
        if(!flag){
            this.wait();
        }
        System.out.println(name + "....." + sex);
        flag = false;
        this.notify();
    }
}

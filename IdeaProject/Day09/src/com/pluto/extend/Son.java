package com.pluto.extend;

/**
 * @author 17763
 */
public class Son extends Father {
    public  int i = 2;
    private int j = 2;
    public int m = 2;
    
    public void test(){
        System.out.println("父类继承的i:" + super.i);
        System.out.println("子类的i:"+ i);
        System.out.println("父类继承的j:"+super.getJ());
        System.out.println("子类的j:"+ j);
        System.out.println("父类继承的k:"+super.k);
        System.out.println("子类的m:"+ m);
    }

    @Override
    public void printsum(){
        System.out.println(i+j+m);
    }

    public static void main(String[] args) {
        Son s = new Son();
        s.test();
    }
}

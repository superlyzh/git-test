package com.pluto.lambda;

public class LambdaTest {
    public static void main(String[] args) {
        goSwimming(()-> System.out.println("lambda游泳啦"));
        Swimmable s = ()-> System.out.println("合法化");
        s.swimming();
        goSmoke( name ->{
            System.out.println("lambda抽"+name+"烟");
            return 6;
        });

    }
    public static  void goSwimming(Swimmable s){
        s.swimming();
    }
    public static  void goSmoke(Smokeable s){
        int i = s.smoking("中华");
        System.out.println("返回值:"+i);
    }
}

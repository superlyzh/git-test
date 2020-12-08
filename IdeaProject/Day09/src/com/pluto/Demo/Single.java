package com.pluto.Demo;

 public class Single {
    private  Single(){};
    private static Single s = new Single();
    public static  Single getInnstance(){
        return s;
    }
}

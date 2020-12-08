package com.pluto.extend;

public class Father {
    public int i = 1;
    private int j = 1;
    public int k = 1;

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }
    public void printsum(){
        System.out.println(i+j+k);
    }
}

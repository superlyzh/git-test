package com.pluto.Test;

public class Rectangle {
    //长
    private double length;
    //宽
    private double width;

    //面积
    protected   double getArea(){
      //  System.out.println("矩形面积为:"+length*weight);
        return length*width;
    }
    //周长
    protected double getPerimeter(){
        return (length*2) + (width*2);
    }

    //输出矩形信息：长：xx，宽：xx，面积：xx，周长：xx
    protected  void printRectMessage(){
        System.out.println("长:"+this.length);
        System.out.println("宽:"+this.width);
        System.out.println("面积:"+getArea());
        System.out.println("周长:"+getPerimeter());
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}

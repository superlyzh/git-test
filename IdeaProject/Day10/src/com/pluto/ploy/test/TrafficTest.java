package com.pluto.ploy.test;

public class TrafficTest {
    public static void main(String[] args) {
        Traffic[] traffic = {new Car(),new Bicycle(),new Traffic()};
        for (int i = 0; i < traffic.length; i++) {
            traffic[i].drive();
        }
    }
}

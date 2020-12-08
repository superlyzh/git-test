package com.pluto.ploy.test;

public class PersonTest {
    public static void goTOToilet(Person p){
        p.toilet();
    }

    public static void main(String[] args) {
        goTOToilet(new Man());
        goTOToilet(new Woman());
    }
}

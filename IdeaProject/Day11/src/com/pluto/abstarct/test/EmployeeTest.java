package com.pluto.abstarct.test;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] es = new Employee[5];
        es[0] = new Employee(111,"张三丰",300000);
        es[1] = new Employee(121,"刘三姐",150000);
        es[2] = new Employee(108,"王老五",200000);
        es[3] = new Employee(112,"唐老鸭",130000);
        es[4] = new Employee(120,"猪八戒",200000);

        for (int i = 0; i < es.length - 1; i++) {
            for (int j = 0; j < es.length-1-i; j++) {
                if(es[j].compareTo(es[j+1]) > 0){
                    Employee temp = es[j];
                    es[j] = es[j+1];
                    es[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < es.length; i++) {
            System.out.println(es[i].toString());
        }
    }
}

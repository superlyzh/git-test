package com.pluto.reflection;
//反射
class Test01 {
    public static void main(String[] args)throws ClassNotFoundException {
        //通过反射获取类的class对象
        Class c1 = Class.forName("com.pluto.reflection.user");
        System.out.println(c1);

        Class<User> userClass = User.class;
    }
}
//实体类
class User{
        private String name;
        private int id;
        private int age;

    public User() {
    }

    public User(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

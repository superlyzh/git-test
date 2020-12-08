package com.pluto.login;

import java.util.Scanner;

//模拟客户端
public class UserClient {
    //存储数据，模拟数据库
    private final static User[] users = new User[5];
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        do {
            System.out.println("-------------0821高级系统----------------");
            System.out.println("1.登录");
            System.out.println("2.注册");
            System.out.println("3.退出");
            System.out.println("请选择");
            String no = sc.nextLine();

            switch (no) {
                case "1":
                    System.out.println("-------------登录界面----------------");
                    System.out.println("请输入用户名:");
                    String regName  = sc.nextLine();
                    System.out.println("请输入密码:");
                    String regPassWord = sc.nextLine();
                    boolean success = false;
                    for (int i = 0; i < users.length; i++) {
                        if(users[i] != null) {
                            if (regName.equals(users[i].getUserName()) && regPassWord.equals(users[i].getPassWord())){
                                success = true;
                                break;
                            }
                        }
                    }
                    if(success){
                        System.out.println("登录失败");
                    }else{
                        System.out.println("登录失败");
                    }
                    break;
                case "2":
                    System.out.println("-------------注册界面----------------");
                    System.out.println("请输入用户名:");
                    String name  = sc.nextLine();
                    System.out.println("请输入密码:");
                    String passWord = sc.nextLine();
                    User user  = new User(name,passWord);
                    for (int i = 0; i < users.length; i++) {
                        if(users[i] == null){
                            users[i] = user;
                            break;
                        }
                    }
                    System.out.println("注册成功！");
                    break;
                case "3":
                    System.out.println("-------------退出----------------");
                    exit = true;
                    break;
            }
        }while(!exit);
    }

}

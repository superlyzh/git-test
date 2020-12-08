package com.pluto.Login_regist.test;

import com.pluto.Login_regist.dao.UserDao;
import com.pluto.Login_regist.game.GuessNumber;
import com.pluto.Login_regist.impl.UserDaoImpl;
import com.pluto.Login_regist.pojo.User;

import java.util.Scanner;

public class UserTest {
    public static void main(String[] args) {

        while(true) {
        System.out.println("-----------------------------");
        System.out.println("1:登录");
        System.out.println("2:注册");
        System.out.println("3:退出");
        System.out.println("请输入你的选择:");

        Scanner sc = new Scanner(System.in);

            String choiceString = sc.nextLine();
            UserDao  ud = new UserDaoImpl();

            switch (choiceString) {
                case "1":
                    System.out.println("----------登录界面-----------");
                    System.out.println("请输入用户名:");
                    String username = sc.nextLine();
                    System.out.println("请输入密码:");
                    String password = sc.nextLine();

                    if (ud.isLogin(username,password)) {
                        System.out.println("登录成功,可以开始玩游戏了");
                        System.out.println("输入y开始游戏,其他任意键结束");
                        String s = sc.nextLine();
                        while(true) {
                            if (s.equalsIgnoreCase("y")) {
                                GuessNumber.guessNumberGame();
                                System.out.println("输入y再次开始游戏,其他任意键结束");
                            } else {
                                break;
                            }
                        }
                        System.out.println("欢迎下次光临");
                        System.exit(0);

                    } else {
                        System.out.println(ud.toString());
                        System.out.println("用户名或密码错误,登录失败");
                    }

                    break;
                case "2":
                    System.out.println("----------注册界面-----------");
                    System.out.println("请输入用户名:");
                    String newUsername = sc.nextLine();
                    System.out.println("请输入密码:");
                    String newPassword = sc.nextLine();
                    User user  = new User(newUsername, newPassword);
                    ud.isRegist(user);
                    System.out.println("注册成功");

                    break;
                case "3":
                    System.out.println("谢谢使用，欢迎下次再来");
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }
}

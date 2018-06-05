package com.zhouhang.day05;

import java.util.Scanner;

/**
 * com.zhouhang.day05
 *
 * @author zhouhang
 * @date 2018/6/4 下午4:32
 */
public class LoginDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String userName = sc.next();
        System.out.println("请输入密码");
        String password = sc.next();



        // command + option + t
        try {
            login(userName, password);
        } catch (LoginException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void login(String name, String password) throws LoginException {
        if (!name.equals("admin")) {
            throw new LoginException(name + "是错误的用户名");
        } else if (!"admin".equals(password)) {
            throw new LoginException(password + "是错误的密码");
        }
    }
}

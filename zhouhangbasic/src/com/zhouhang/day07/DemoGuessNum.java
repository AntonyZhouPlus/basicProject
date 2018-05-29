package com.zhouhang.day07;

import java.util.Random;
import java.util.Scanner;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/15 17:37
 */
public class DemoGuessNum {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        int targetNumber = rd.nextInt(101);

        while (true){
            System.out.println("你猜一个数");
            int i = sc.nextInt();
            if(i > targetNumber){
                System.out.println("大了");
            }else if(i < targetNumber){
                System.out.println("小了");
            }else {
                System.out.println("对了");
                break;
            }
        }


    }
}

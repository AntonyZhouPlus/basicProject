package com.zhouhang.day07;

import com.zhouhang.day05.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/17 21:45
 */
public class Homework {
    public static void main(String[] args) {
        // method01();
        // method02();
        // method03();


    }

    public static void method03() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("abc");
        list.add("def");
        list.add("def");
        list.add("ghi");
        list.add("def");
        list.add("hij");
        list.add("jkol");
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == "def"){
             count++;
            }
        }
        for (int i = 0; i < count; i++) {
            list.remove("def");
        }

        System.out.println(list);
    }

    public static void method02() {
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 5; i++) {
            list.add(new Scanner(System.in).next());
        }


        System.out.println(list);
    }

    public static void method01() {
        System.out.println("请输入数组长度");
        int length = new Scanner(System.in).nextInt();
        int[] arr = new int[length];
        Random rd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(100) + 1;
        }
        int max = arr[0];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            max = max > arr[i] ? max : arr[i];
            sum += arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Max:" + max);
        System.out.println("AVG:" + sum / arr.length);
    }


}

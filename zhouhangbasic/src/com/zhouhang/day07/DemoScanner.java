package com.zhouhang.day07;

import java.util.Scanner;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/15 15:50
 */
public class DemoScanner {
    public static void main(String[] args) {
        method03();

    }


    // 键盘录入一个int整数n，在控制台输出1到n之间的数据
    public static void method01() {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个正整数:");
        int max = sc.nextInt();

        for (int i = 1; i <= max; i++) {
            System.out.print(i + " ");
        }
    }

    // 键盘录入5个int整数,存入合适的数组中，求数组元素的平均值
    public static void method02() {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int sum = 0;

        System.out.println("输入5个数：");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        System.out.println("平均值：" + (sum / arr.length));

    }

    // 键盘录入6个int整数,存入合适的数组中，要求奇数放在左侧，偶数放在右侧
    public static void method03() {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];

        System.out.println("输入6个数：");


        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int index = 0;
        int[] arr2 = new int[6];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr2[index] = arr[i];
                index++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr2[index] = arr[i];
                index++;
            }
        }

        System.out.println("目标数组打印");
        for (int i : arr2) {
            System.out.println(i + " ");
        }


    }

    public static void method04(){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];

        int left = 0;
        int right = arr.length - 1;

        for (int i = 0; i < 6; i++) {
            int num = sc.nextInt();
            if(num % 2 == 0){
                arr[right--] = num;
            }
            if(num % 2 != 0){
                arr[left++] = num;
            }
        }

        for (int i : arr){
            System.out.println(i + " ");
        }
    }


}

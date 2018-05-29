package com.zhouhang.day05;

/**
 * HomeWorkDay05
 *
 * @author Zhouhang Anthony
 * @date 2018/5/12 19:55
 */
public class HomeWorkDay05 {
    public static void main(String[] args) {
        test04();

    }

    /*看程序说结果，请不要提前运行*/
    public static void test02() {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] temp1 = arr1;
        int[] temp2 = arr1;
        System.out.println("通过temp1取出数组值: "); // 通过temp1取出数组值:

        for (int i = 0; i < temp1.length; i++) {
            System.out.print(temp1[i] + " "); // 12345
        }
        System.out.println();
        System.out.println("通过temp2取出数组值: "); // 通过temp2取出数组值:
        for (int i = 0; i < temp2.length; i++) {
            System.out.print(temp2[i] + " "); // 12345
        }
        System.out.println(); // 换行
        temp1[2] = 9;

        System.out.println("通过temp1取出数组值: "); // 通过temp1取出数组值:
        for (int i = 0; i < temp1.length; i++) {
            System.out.print(temp1[i] + " "); // 12945
        }
        System.out.println();
        System.out.println("通过temp2取出数组值: "); // 通过temp2取出数组值:
        for (int i = 0; i < temp2.length; i++) {
            System.out.print(temp2[i] + " "); // 12945
        }
        System.out.println();
    }

    /*看程序说结果，请不要提前运行*/
    public static void test03() {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {5, 6, 7};
        int[] temp = arr1;

        System.out.println("通过temp取出arr1中的元素: "); // 通过temp取出arr1中的元素:

        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + " "); // 1 2 3 4 5
        }

        temp = arr2;

        System.out.println("通过temp取出arr2中的元素: "); // 通过temp取出arr2中的元素:

        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + " "); // 5 6 7
        }
    }

    public static void test04() {
        /*1.定义一个用于存放班级分数的数组
        int[] score = {80,90,85,90,78,88,89,93,98,75};
        2.求出班级不及格人数(分数低于60分的就是不及格)
        3.求出班级的平均分
        4.求出班级的总分数*/
        int[] score = {80, 90, 85, 90, 78, 88, 89, 93, 98, 75};
        int countNotPass = 0;
        int sumScore = 0;


        for (int i : score) {
            if (i < 60) {
                countNotPass++;
            }
            sumScore += i;
        }
        System.out.println("不及格的人数： " + countNotPass);
        System.out.println("平均分： " + sumScore / score.length);
        System.out.println("总分： " + sumScore);

    }


}

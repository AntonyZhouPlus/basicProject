package com.zhouhang.day05;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/12 20:33
 */
public class HomeWorkDay05Add {
    public static void main(String[] args) {
//        test02();
//        test02();
//        test05();
//        test03();
//        test05();
        test06();


    }

    public static void test03() {
        int[] arr3 = {25, 98, 56, 45, 74, 85, 66};
        changeArray(arr3);
    }

    public static void test02() {
        int[] arr2 = {15, 26, 98, 56, 77, 42, 32, 14, 55};
        System.out.println("偶数数组遍历：");
        for (int i : getEvenArray(arr2)) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("=====================");
    }

    public static void test01() {
        int[] arr = {1, 2, 3, 4, 7, 6, 5};
        System.out.println("最大值的索引： " + getMaxIndex(arr));
        System.out.println("=====================");
    }

    public static int getMaxIndex(int[] arr) {
        /*写一个方法，传入一个数组，返回数组中元素最大值的索引。（数组中不考虑元素的重复）。*/
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[index]) {
                index = i;
            }
        }
        return index;
    }

    public static int[] getEvenArray(int[] arr) {
    /*写一个方法，传入数组int[] arr ，
    数组元素为{15,26,98,56,77,42,32,14,55}，
    在方法中将数组中索引为偶数的元素添加到新数组中，
    并将新数组返回，最后在main方法中调用法并遍历数组。*/
        int evenLength = 0;
        for (int i : arr) {
            if (i % 2 == 0) {
                evenLength++;
            }
        }
        int[] targetArray = new int[evenLength];
        int index = 0;
        for (int i : arr) {
            if (i % 2 == 0) {
                targetArray[index] = i;
                index++;
            }
        }
        return targetArray;
    }

    public static void changeArray(int[] arr) {
    /*有一个数组int类型的数组 arr，
    数组元素为{25,98,56,45,74,85,66}，
    将数组中的偶数替换成数据12；最后遍历数组。*/
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] = 12;
            }
        }
        System.out.println("变更后的数组为：");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void test04() {
        /*分析以下需求，并用代码实现
	1.键盘录入班级人数
	2.根据录入的班级人数创建数组
	3.利用随机数产生0-100的成绩(包含0和100)
	4.要求:
            (1)打印该班级的不及格人数
            (2)打印该班级的平均分
		    (3)演示格式如下:
    请输入班级人数:
    键盘录入:100
    控制台输出:
    不及格人数:19
    班级平均分:87*/
        System.out.println("请输入班级人数:");
        int numOfClass = new Scanner(System.in).nextInt();
        int[] scoreOfClass = new int[numOfClass];
        Random rd = new Random(101);
        int countNotPass = 0;
        int sumScore = 0;

        for (int i = 0; i < scoreOfClass.length; i++) {
            scoreOfClass[i] = rd.nextInt(101);
        }

        for (int i : scoreOfClass) {
            sumScore += i;
            if (i < 60) {
                countNotPass++;
            }
        }
        System.out.println("不及格人数:" + countNotPass);
        System.out.println("班级平均分:" + sumScore / numOfClass);
    }

    public static void test05() {
        /*假设有一个长度为5的数组，数组元素通过键盘录入，如下所示：
        int[] arr = {1,3,-1,5,-2}
        要求：
        创建一个新数组newArr[],新数组中元素的存放顺序与原数组中的元素逆序，并且如果原数组中的元素值小于0，
        在新数组中按0存储。最后输出原数组和新数组中的内容


        打印格式：
        请输入5个整数：
        1
        3
        -1
        5
        -2
        原数组内容：
        1 3 -1 5 -2
        新数组内容：
        0 5 0 3 1*/
        int[] originalArr = new int[5];
        int[] targetArr = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入5个整数：");
        for (int i = 0; i < originalArr.length; i++) {
            originalArr[i] = sc.nextInt();
        }
        System.out.println("原数组内容：");
        System.out.println(Arrays.toString(originalArr));

        for (int i = 0; i < targetArr.length; i++) {
            if (originalArr[originalArr.length - 1 - i] > 0) {
                targetArr[i] = originalArr[originalArr.length - 1 - i];
            } else {
                targetArr[i] = 0;
            }
        }
        System.out.println("新数组内容：");
        System.out.println(Arrays.toString(targetArr));


    }

    public static void test06() {
        /*设计，并定义一个学员类：Student，要求有以下属性：
        学员编号（String）
        姓名（String）
        性别（String）
        身高（double）
        年龄（int）
        使用封装的原则，并提供无参和全参的构造方法。
        ?定义MainApp类，并包含main()方法。
        ?程序启动后，应分别提示用户输入学员编号、姓名等信息。
        例如控制台显示：
        C:\>请输入学员编号：
        C:\>....
        C:\>请输入学员姓名：
        C:\>....
            .................
        ?数据接收到程序中，并定义局部变量存储；
        ?创建Student对象，通过构造方法将所有数据存储到Student对象中；
        ?打印对象中的每个属性值。*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the Student message in order :" +
                "id,name,gender,height,age");
        String id = sc.next();
        String name = sc.next();
        String gender = sc.next();
        double height = sc.nextDouble();
        int age = sc.nextInt();

        Student student = new Student(id,name,gender,height,age);

        System.out.println(student.toString());
    }




}

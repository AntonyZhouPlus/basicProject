package com.zhouhang.day05;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/14 9:06
 */
public class HomeWorkDay05AddPlus {
    public static void main(String[] args) {
        int[] arr1 = {2, 10, 3, 4, 20, 5};
        int[] arr2 = {1, 4, 1};
        int[] arr3 = {1, 2, 2, 6, 99, 99, 7};
        printArray(tenRun(arr1));
        System.out.println("=============");
        System.out.println(more14(arr2));
        System.out.println("=============");
        System.out.println(sum67(arr3));


    }

    // 打印数组方法
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.println(i + " ");
        }
    }

    /*有一个整型的数组，如果数组的元素是10的倍数，将其后面的所有值改为10的倍数
       直到遇到下一个10的倍数的元素，因此{2，10，3，4，20，5} 改为{2,10,10,10,20,20}*/
    public static int[] tenRun(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] % 10 == 0 && arr[i + 1] % 10 != 0) {
                arr[i + 1] = arr[i];
            }
        }
        return arr;
    }

    /*类中有一个方法，方法名more14;
    接收一个整型数组，如果1的出现次数大于4出现的次数，则返回true*/
    public static boolean more14(int[] arr) {
        int count1 = 0;
        int count4 = 0;

        for (int i : arr) {
            if (i == 1) {
                count1++;
            }
            if (i == 4) {
                count4++;
            }
        }
        return count1 > count4;
    }

    /*有一个整型数组，返回数组中的数字的总和，如果数组含有数6和7
    那么忽略不计入从6开始并延伸到有7的数字段（每6个将跟随至少一个7）。
    返回0表示没有数字。*/
    public static int sum67(int[] arr) {
        /*int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 6) {
                while (arr[i] != 7) {
                    i++;
                }
                sum -= 7;
            }
            sum += arr[i];
        }
        return sum;*/

        int sum = 0;
        boolean flag = true;
        for (int i : arr) {
            if (i == 6) {
                flag = false;
            }
            if (flag) {
                sum += i;
            }
            if (i == 7 && flag == false) {
                flag = true;
            }
        }
        return sum;
    }


}

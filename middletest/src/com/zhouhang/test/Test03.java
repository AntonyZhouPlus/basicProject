package com.zhouhang.test;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/15 10:13
 */

/*有一个int类型的数组arr,数组中元素为{15,26,98,56,77,42,30,14,45}。
        1.遍历数组，要求用“[元素1,元素2,元素3,元素4,元素5,元素6]”的方式将数组打印在控制台。（不允许使用Arrays.toString()方法）
        2.然后获取数组中元素的最大值，和最小值。打印格式为：“数组arr元素中最大值为：max”   “数组arr元素中最小值为：min”
        3.找出数组中元素即是3的倍数又是5的倍数的元素，以(“数组中即是3的倍数又是5的倍数的元素有:”+arr[i])  的方式输出到控制台*/
public class Test03 {
    public static void main(String[] args) {
        int[] arr = {15, 26, 98, 56, 77, 42, 30, 14, 45};

        printArray(arr);
        System.out.println("数组arr元素中最大值为:" + getArrayMax(arr));
        System.out.println("数组arr元素中最小值为:" + getArrayMin(arr));
        for (int i : getArray35(arr)){
            System.out.println("数组中即是3的倍数又是5的倍数的元素有:"+i);
        }
    }

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.println(array[i] + "]");
            } else {
                System.out.print(array[i] + " ,");
            }
        }
    }

    public static int getArrayMax(int[] array) {
        int max = array[0];

        for (int i : array) {
            max = max > i ? max : i;
        }

        return max;
    }

    public static int getArrayMin(int[] array) {
        int min = array[0];

        for (int i : array) {
            min = min < i ? min : i;
        }

        return min;
    }

    public static int[] getArray35(int[] array) {
        int count = 0; // 计算数组长度

        for (int i : array) {
            if (i % 3 == 0 && i % 5 == 0){
                count++;
            }
        }

        int[] arr = new int[count];
        
        int index = 0;
        for (int i : array) {
            if (i % 3 == 0 && i % 5 == 0){
                arr[index] = i;
                index++;
            }
        }

        return arr;
    }
}

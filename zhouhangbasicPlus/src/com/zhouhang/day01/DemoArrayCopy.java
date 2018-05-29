package com.zhouhang.day01;

import java.util.Arrays;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/28 16:42
 */
public class DemoArrayCopy {
    public static void main(String[] args) {
        // 已知int数组arr有三个元素分别是1 2 3 ，将这个数组中所有的元素都复制到一个新数组中，从1索引开始，新数组长度为10
        int[] array = {1,2,3};
        int[] arrayNew = new int[10];

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1){
                System.arraycopy(array,i,arrayNew,1,array.length);
            }
        }
        System.out.println(Arrays.toString(arrayNew));
    }
}

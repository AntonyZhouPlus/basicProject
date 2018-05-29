package com.zhouhang.sort;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/22 12:01
 */
public class CoderA extends Sort implements IMethod {

    @Override
    public void timeTestMethod() {
        int[] arr = getArray(9999);
        bubbleSort(arr);
    }
}

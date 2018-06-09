package com.zhouhang.day08;

/**
 * com.zhouhang.day08
 *
 * @author zhouhang
 * @date 2018/6/8 下午3:05
 */
public class DiguiDemo {
    public static void main(String[] args) {
        System.out.println(method2(24));

        System.out.println(rabbit(24));


    }

    public static int rabbit(int i){
        if(i == 1 || i == 2){
            return 1;
        }
        return i*method(i-2);

    }
    public static int method(int i) {
        if (i == 0) {
            return 0;
        }
        return i + method(i - 1);
    }

    public static int method2(int i) {
        if (i == 1 || i == 2) {
            return 1;
        }
        return method2(i-2) + method2(i - 1);
    }
}

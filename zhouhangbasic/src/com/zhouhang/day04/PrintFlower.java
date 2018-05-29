package com.zhouhang.day04;

/**
 * DemoScanner code 抽取方法的快捷键 Ctrl + Alt + M
 *
 * @author Zhouhang Anthony
 * @date 2018/5/11 14:54
 */
public class PrintFlower {
    static int FLOWER_MIN = 100;
    static int FLOWER_MAX = 999;

    public static void main(String[] args) {

        System.out.println(print(5));

    }

    public static int print(int countDefault) {
        int count = countDefault;

        for (int i = FLOWER_MIN; i <= FLOWER_MAX; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;
            if (ge * ge * ge + shi * shi * shi + bai * bai * bai == i) {
                System.out.println("水仙花数为：" + i);
                count++;
            }
        }

        System.out.println("总个数为:" + count);

        return count;
    }
}

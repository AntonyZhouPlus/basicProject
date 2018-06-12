package com.zhouhang.day08homework.test01;

import java.io.File;
import java.util.Scanner;

/**
 * com.zhouhang.Test02
 *
 * @author zhouhang
 * @date 2018/6/8 下午8:14
 * 键盘录入一个文件路径，根据文件路径创建文件对象，判断是文件还是文件夹
 * 如果是文件，则输出文件的大小
 * 如果是文件夹，则计算该文件夹下所有文件大小之和并输出(不包含子文件夹)
 */
public class TestFolderLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input the dir");
        File file = new File(sc.next());
        System.out.println(getLength(file)); // 389,716,509
    }

    public static long getLength(File dir) {
        long sum = 0;

        if (dir.isFile()) {
            return dir.length();
        } else if (dir.isDirectory()) {
            for (File file : dir.listFiles()) {
                if (file.isFile()) {
                    sum += file.length();
                } else {
                    sum += getLength(file);

                }
            }
            return sum;
        }
        return 0;

    }
}

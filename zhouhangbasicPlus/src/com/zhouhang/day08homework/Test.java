package com.zhouhang.day08homework;

import java.io.File;
import java.io.IOException;

/**
 * com.zhouhang.day08homework.Test
 *
 * @author zhouhang
 * @date 2018/6/8 下午8:08
 * 描述:检查D盘下是否存在文件a.txt,如果不存在则创建该文件。
 */
public class Test {
    public static void main(String[] args) throws IOException {
        File desktop = new File("/Users/zhouhang/Desktop");
//        boolean flag = true;
//
//        for (File file : desktop.listFiles()) {
//            if (file.getName().equals("a.txt")) {
//                flag = false;
//            }
//        }
//
//        if(flag){
//            new File(desktop,"a.txt").createNewFile();
//        }
//
////        在D盘下创建一个名为bbb的文件夹。
//        new File(desktop,"bbb").mkdirs();
////        描述:在D盘下创建一个名为ccc的文件夹，要求如下：
////        1.ccc文件夹中要求包含bbb子文件夹
////        2.bbb子文件夹要求包含aaa文件夹
//        new File(desktop,"ccc/bbb/aaa").mkdirs();
        File a = new File(desktop, "ccc/a.txt");
        System.out.println(a.length());
        System.out.println(a.getAbsolutePath());
        System.out.println(a.getParent());

    }
}

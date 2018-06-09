package com.zhouhang.day08homework.test04;

import java.io.File;

/**
 * com.zhouhang.day08homework.test04
 *
 * @author zhouhang
 * @date 2018/6/8 下午8:44
 * 获得指定文件夹下所有的java文件(不考虑子文件夹的)并输出到控制台
 */
public class Test04 {
    public static void main(String[] args) {
        File file = new File("/Users/zhouhang/Desktop/day07");
        getJAVA(file);
    }

    public static void getJAVA(File dir){
        if(dir.isFile()){
            if (dir.getName().endsWith(".java")) {
                System.out.println(dir);
            }
        } else if (dir.isDirectory()) {
            for (File file : dir.listFiles()) {
                if (file.isFile()) {
                    if (file.getName().endsWith(".java")) {
                        System.out.println(file);
                    }
                } else if (file.isDirectory()) {
                    getJAVA(file);
                }
            }
        } else {

            System.out.println("error");
        }


    }
}

package com.zhouhang.day08homework.test05;

import java.io.File;

/**
 * com.zhouhang.day08homework.Test05
 *
 * @author zhouhang
 * @date 2018/6/9 上午9:00
 */
public class Delete {
    public static void main(String[] args) {
        File file = new File("/Users/zhouhang/Desktop/day07");
        deleteAll(file);

    }

    public static boolean deleteAll(File dir){
        if (dir.isFile()) {
            return dir.delete();
        } else if (dir.isDirectory()) {
            for (File file : dir.listFiles()) {
                if (file.isFile()) {
                    file.delete();
                } else {
                    deleteAll(file);
                }
            }
            return dir.delete();
        } else {
            System.out.println("File is not exist");
            return false;
        }
    }
}

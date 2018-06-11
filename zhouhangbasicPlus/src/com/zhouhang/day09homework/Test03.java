package com.zhouhang.day09homework;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * com.zhouhang.day09homework
 *
 * @author zhouhang
 * @date 2018/6/10 下午8:57
 * 在D盘下，有一c.txt 文件中内容为：HelloWorld 
 * 在c.txt文件原内容基础上，添加五句 I love java，而且要实现一句一行操作(注：原文不可覆盖)。
 * 利用字节输出流对象往C盘下c.txt文件输出5句：”i love java”
 */
public class Test03 {
    final static String desktop = "/Users/zhouhang/Desktop";
    public static void main(String[] args) {

        File file = new File(desktop,"b.txt");

        try(FileOutputStream fis = new FileOutputStream(file)){
            for (int i = 0; i < 5; i++) {
                fis.write("i love java\n".getBytes());
            }
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}

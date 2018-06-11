package com.zhouhang.day09homework;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * com.zhouhang.day09homework
 *
 * @author zhouhang
 * @date 2018/6/10 下午8:55
 * 利用字节输出流一次写一个字节数组的方式向D盘的b.txt文件输出内容:"i love java"。
 */
public class Test02 {
    final static String desktop = "/Users/zhouhang/Desktop";
    public static void main(String[] args) {

        File file = new File(desktop,"b.txt");

        try(FileOutputStream fis = new FileOutputStream(file)){
            fis.write("i love java".getBytes());
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}

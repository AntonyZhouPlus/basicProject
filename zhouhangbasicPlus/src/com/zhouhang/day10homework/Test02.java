package com.zhouhang.day10homework;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * com.zhouhang.day10homework
 *
 * @author zhouhang
 * @date 2018/6/12 下午2:58
 * 利用高效字节输出流往C盘下的e.txt文件写出一个字节数组数据，如写出：”i love java”
 */
public class Test02 {
    public static void main(String[] args) throws IOException {
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("e.txt"));
        bos.write("i love java".getBytes());
        bos.close();
    }

}

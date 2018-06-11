package com.zhouhang.day09homework;

import java.io.*;

/**
 * com.zhouhang.day09homework
 *
 * @author zhouhang
 * @date 2018/6/10 下午8:37
 * 利用字节输出流一次写一个字节的方式，向D盘的a.txt文件输出字符‘a’。
 */
public class Test01 {
    public final static String desktop = "/Users/zhouhang/Desktop";
    public static void main(String[] args) {

        File file = new File(desktop,"a.txt");

        try(FileOutputStream fis = new FileOutputStream(file)){
            fis.write('a');
        }catch (IOException e){
            e.printStackTrace();
        }

    }

}

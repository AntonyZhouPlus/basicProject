package com.zhouhang.day10homework;

import java.io.*;

/**
 * com.zhouhang.day10homework
 *
 * @author zhouhang
 * @date 2018/6/12 下午3:12
 * 利用高效字节输入流和高效字节输出流完成文件的复制。
 * 要求：
 * 将C盘下的c.png文件复制到D盘下
 * 一次读写一个字节数组方式复制
 */
public class Test03 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("a.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("a_copy.txt"));
        byte[] bytes = new byte[5];
        int len;
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes,0,len);
        }
        bis.close();
        bos.close();
    }
}

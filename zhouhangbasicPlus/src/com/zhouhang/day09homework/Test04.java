package com.zhouhang.day09homework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * com.zhouhang.day09homework
 *
 * @author zhouhang
 * @date 2018/6/11 下午4:20
 * 描述:利用字节输入流读取D盘文件a.txt的内容，文件内容确定都为纯ASCII字符
 * 使用循环读取，一次读取一个字节，直到读取到文件末尾。将读取的字节输出到控制台
 */
public class Test04 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("store.txt");) {
            byte[] b = new byte[5];
            int len;
            while ((len = fis.read(b)) != -1) {
                System.out.println(new String(b,0,len));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

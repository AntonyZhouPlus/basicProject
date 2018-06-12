package com.zhouhang.day10homework;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * com.zhouhang.day10homework
 *
 * @author zhouhang
 * @date 2018/6/12 下午3:51
 * 利用转换输入流将当前项目根目录下使用gbk编码的a.txt文件的内容读取出来，并打印在控制台上。
 */
public class Test06 {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("a.txt"),"GBK");
        char[] chars = new char[5];
        int len;
        while ((len = isr.read(chars)) != -1) {
            System.out.print(new String(chars,0,len));
        }
        isr.close();
    }
}

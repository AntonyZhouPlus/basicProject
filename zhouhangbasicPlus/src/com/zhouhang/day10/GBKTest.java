package com.zhouhang.day10;

import com.zhouhang.day09homework.Test01;

import java.io.*;

/**
 * com.zhouhang.day10
 *
 * @author zhouhang
 * @date 2018/6/11 上午11:54
 */
public class GBKTest {
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream(Test01.desktop+"/gbktest.txt"),"GBK");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(Test01.desktop+"/source/b.txt"),"UTF-8");
        int c;
        while ((c = isr.read()) != -1) {
            osw.write(c);
        }
        isr.close();
        osw.close();
    }
}

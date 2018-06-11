package com.zhouhang.day10;

import java.io.*;

/**
 * com.zhouhang.day10
 *
 * @author zhouhang
 * @date 2018/6/11 上午11:12
 */
public class BufferedDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("store.txt"));
        String str;
        while ((str = br.readLine()) != null) {
            System.out.println(str);
        }
        br.close();
    }
}

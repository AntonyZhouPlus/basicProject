package com.zhouhang.day10;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * com.zhouhang.day10
 *
 * @author zhouhang
 * @date 2018/6/11 下午5:22
 */
public class PrintStreamDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("a.txt");
        file.createNewFile();
        PrintWriter pw = new PrintWriter("a.txt");
        pw.close();
    }
}

package com.zhouhang.day09;

import java.io.*;

/**
 * com.zhouhang.day09
 *
 * @author zhouhang
 * @date 2018/6/10 上午11:32
 */
public class Hello {
    public static void main(String[] args) throws IOException {
//        FileOutputStream fos = new FileOutputStream("/Users/zhouhang/Desktop/a.txt");
//        fos.write("别人笑我123太疯癫,\n我笑他人4231看不穿,\n不见武214林豪杰墓,\n无花1321a无酒锄作田。\n".getBytes());
//        fos.close();
//
//        FileReader fr = new FileReader("/Users/zhouhang/Desktop/a.txt");
//        char[] c = new char[5];
//        int len = -1;
//        while ((len = fr.read(c)) != -1) {
//            System.out.print(new String(c, 0, len));
//        }
        FileReader fr = new FileReader("/Users/zhouhang/Desktop/a2.txt");
        FileWriter fw = new FileWriter("/Users/zhouhang/Desktop/a2_copy.txt");

        char[] c = new char[1];
        int len = -1;
        while ((len = fr.read(c)) != -1){
            fw.write(c,0,len);
        }

        fr.close();
        fw.close();
    }
}

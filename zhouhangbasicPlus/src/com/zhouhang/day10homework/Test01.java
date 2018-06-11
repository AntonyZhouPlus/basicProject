package com.zhouhang.day10homework;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * com.zhouhang.day10homework
 *
 * @author zhouhang
 * @date 2018/6/11 下午8:44
 * 描述:利用高效字节输出流往C盘下的d.txt文件输出一个字节数。
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("a.txt",true));
        bos.write(89);
        bos.close();
    }
}

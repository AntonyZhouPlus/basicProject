package com.zhouhang.day08homework;

import java.io.File;
import java.io.IOException;

/**
 * com.zhouhang.day08homework.Test
 *
 * @author zhouhang
 * @date 2018/6/8 下午8:08
 * 描述:检查D盘下是否存在文件a.txt,如果不存在则创建该文件。
 */
public class Test {
    public static void main(String[] args) throws IOException {
        File a = new File("/Users/zhouhang/Desktop/a.txt");
        if(!a.exists()){
            a.createNewFile();

        }

    }
}

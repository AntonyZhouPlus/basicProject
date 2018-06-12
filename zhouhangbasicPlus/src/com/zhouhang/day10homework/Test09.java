package com.zhouhang.day10homework;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * com.zhouhang.day10homework
 *
 * @author zhouhang
 * @date 2018/6/12 下午4:16
 * 项目根路径下有text.txt文件，内容如下：
 * 	我爱黑马
 * 	123456
 * 利用IO流的知识读取text.txt文件的内容反转后写入text1.txt文件中，内容如下：
 * 	123456
 * 我爱黑马
 */
public class Test09 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("a.txt"),"GBK"));
        ArrayList<String> list = new ArrayList<>();
        String str;
        while ((str = br.readLine()) != null) {
            list.add(str);
        }
        br.close();
        Collections.reverse(list);
        PrintStream ps = new PrintStream("d.txt");
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            ps.println(it.next());
        }
        ps.close();
    }
}

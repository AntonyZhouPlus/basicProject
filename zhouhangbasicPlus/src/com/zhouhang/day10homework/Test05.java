package com.zhouhang.day10homework;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * com.zhouhang.day10homework
 *
 * @author zhouhang
 * @date 2018/6/12 下午3:47
 * 描述:现有一字符串：”我爱Java”。将该字符串保存到当前项目根目录下的a.txt文件中。
 * 要求：使用gbk编码保存。
 * 注意：idea的默认编码是utf-8,所以可以通过filesettingsfile encodings设置为gbk格式，否则打开a.txt文件看到的将会是乱码。
 */
public class Test05 {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("a.txt"),"GBK");
        osw.write("我爱JAVA");
        osw.close();
    }
}

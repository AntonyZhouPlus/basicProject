package com.zhouhang.day09;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * com.zhouhang.day09
 *
 * @author zhouhang
 * @date 2018/6/11 上午10:08
 */
public class PropertiesDemo {
    public static void main(String[] args) throws IOException {
        Properties p = new Properties();
        FileReader fr = new FileReader("store.txt");
        p.load(fr);
        fr.close();
        for (String s : p.stringPropertyNames()) {
            System.out.println(s + "===" + p.getProperty(s));
        }
    }

    private static void store() throws IOException {
        Properties p = new Properties();
        p.setProperty("A","1");
        p.setProperty("B","2");
        p.setProperty("C","3");
        FileWriter fw = new FileWriter("store.txt");
        p.store(fw,"Test");
        fw.close();
    }

    private static void print() {
        Properties p = new Properties();
        p.setProperty("A","1");
        p.setProperty("B","2");
        p.setProperty("C","3");
        for (String s : p.stringPropertyNames()) {
            System.out.println(s + "===" + p.getProperty(s));
        }
    }
}

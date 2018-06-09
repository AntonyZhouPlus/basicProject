package com.zhouhang.day08;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.net.URI;
import java.util.Date;

/**
 * com.zhouhang.day08
 *
 * @author zhouhang
 * @date 2018/6/8 上午10:38
 * 判断D盘根目录下是否有a文件夹，如果没有则将其创建出来。
 * 在a文件夹下创建一个b文件夹，并在b文件夹中创建一个c文件夹
 * 将创建出来的c文件夹删除
 */
public class FileDemo {
    public static void main(String[] args) throws IOException {
        File f = new File("/Users/zhouhang/Desktop");

        filterPrint(f);

    }

    public static void filterPrint(File dir){
        File[] files = dir.listFiles(pathname -> pathname.isDirectory() ||
                (pathname.isFile() && pathname.getName().endsWith(".docx")));
        for (File file : files) {
            if (file.isDirectory()){
                filterPrint(file);
            }else {
                System.out.println(file);
            }
        }
    }

    public static void printDir(File dir){
        FileFilter filter = pathname -> {
            if (pathname.getName().endsWith(".doc")) {
                return true;
            }
            return false;
        };
        for (File subDir : dir.listFiles(filter)) {
            if(subDir.isFile()){
                String name = subDir.getName();
                //if (name.endsWith(".docx")) {
                    System.out.println(name.substring(0,name.lastIndexOf(".")));
                //}
            }else if(subDir.isDirectory()){
                printDir(subDir);
            }
        }


    }
    private static void test1() {
        File f = new File("/Users/zhouhang/Desktop");
        File f2 = new File(f, "Java基础班英语.doc");
        File f3 = new File(f, "Java就业班英语.doc");

        System.out.println(f2.getName());
        System.out.println(f2.length());
        System.out.println(f3.length());
        System.out.println(f2.getPath());

        Date d = new Date(f2.lastModified());
        System.out.println(d);
        System.out.println("=====");
        URI uri = f2.toURI();
        System.out.println(uri);
    }
}

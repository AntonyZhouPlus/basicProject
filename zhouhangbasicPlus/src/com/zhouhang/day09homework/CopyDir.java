package com.zhouhang.day09homework;

import java.io.*;

/**
 * com.zhouhang.day09homework
 *
 * @author zhouhang
 * @date 2018/6/11 上午9:29
 */
public class CopyDir {
    public static void main(String[] args) throws IOException {
        File source = new File(Test01.desktop,"source");
        File toWhere = new File(Test01.desktop,"copyDir");
        toWhere.mkdirs();
        copyDir(source,toWhere);

    }

    public static void copyDir(File source,File toWhere) {
        if (source.isFile()) {
            copyFile(source,new File(toWhere,source.getName()));
        } else if (source.isDirectory()) {
            File newDir = new File(toWhere, source.getName());
            newDir.mkdirs();
            for (File file : source.listFiles()) {
                if (file.isFile()) {
                    copyFile(file,new File(newDir,file.getName()));
                } else {
                    copyDir(file,newDir);
                }
            }

        } else {
            System.out.println("error");
        }
    }

    public static void copyFile(File source, File toWhere) {
        try (BufferedInputStream fis = new BufferedInputStream(new FileInputStream(source));
             BufferedOutputStream fos = new BufferedOutputStream(new FileOutputStream(toWhere))) {
            byte[] bytes = new byte[1024];
            int len;
            while ((len = fis.read(bytes)) != -1) {
                fos.write(bytes,0,len);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

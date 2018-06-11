package com.zhouhang.day09;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * com.zhouhang.day09
 *
 * @author zhouhang
 * @date 2018/6/10 下午7:47
 */
public class Exception {
    public static void main(String[] args) {
        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader("");
            fw = new FileWriter("");
        }catch (IOException e){

        }finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}

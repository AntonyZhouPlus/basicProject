package com.zhouhang.day08;

import java.util.ArrayList;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/18 14:49
 */
public class Demo02 {
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<String>();
        list.add("周学习");
        list.add("武学习");
        list.add("正学习");
        list.add("王学习");
        list.add("赵学习");
        list.add("钱学习");
        list.add("王思聪");

        for (int i = 0; i < list.size(); i++) {
            if('王' == list.get(i).charAt(0)){
                System.out.println(list.get(i));
            }
        }
    }
}

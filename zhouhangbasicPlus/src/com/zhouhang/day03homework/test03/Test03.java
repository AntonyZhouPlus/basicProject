package com.zhouhang.day03homework.test03;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;

/**
 * com.zhouhang.day03homework.TestFolderLength
 *
 * @author zhouhang
 * @date 2018/6/1 下午7:38
 * 1.产生10个1-20之间的随机数要求随机数不能重复
 * 2.产生10个长度为10的不能重复的字符串(里面只能出现大写字母、小写字母、0-9的数字)，并遍历打印输出
 */
public class Test03 {
    private static final int NUM = 20;

    public static void main(String[] args) {
        Random rd = new Random();
        HashSet<Integer> set = new LinkedHashSet<>();
        while (set.size() < NUM) {
            set.add(rd.nextInt(20) + 1);
        }

        System.out.println(set);

        // 48~57 : '0'~'9'
        // 65~90 : 'A'~'Z'
        // 97~122 : 'a'~'z'

        HashSet<String> stringSet = new HashSet<>();

        while (stringSet.size() < 10) {
            StringBuilder sb = new StringBuilder();

            while (sb.length() < 10) {
                int i = rd.nextInt(122);
                if ((i >= 48 && i <= 57) || (i >= 65 && i <= 90) || (i >= 97 && i <= 122)) {
                    char x = (char) i;
                    if(!sb.toString().contains(Character.toString(x))){
                        sb.append(x);
                    }
                }
            }

            stringSet.add(sb.toString());
        }

        System.out.println(stringSet);


    }

}

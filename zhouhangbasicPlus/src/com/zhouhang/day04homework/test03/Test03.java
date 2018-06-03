package com.zhouhang.day04homework.test03;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * com.zhouhang.day04homework.Test03
 *
 * @author zhouhang
 * @date 2018/6/3 上午9:46
 * 分析以下需求，并用代码实现
 * 1.统计每个单词出现的次数
 * 2.有如下字符串"If you want to change your fate I think you must come to the dark horse to learn java"(用空格间隔)
 * 3.打印格式：
 * to=3
 * think=1
 * you=2
 * //........
 */
public class Test03 {
    public static void main(String[] args) {
        String str = "If you want to change your " +
                "fate I think you must come to the dark horse to learn java";
        String[] strings = str.split("\\ ");
//        System.out.println(Arrays.toString(strings));

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < strings.length; i++) {
            map.put(strings[i], map.get(strings[i]) == null ? 1 : map.get(strings[i]) + 1);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry);
        }
    }
}

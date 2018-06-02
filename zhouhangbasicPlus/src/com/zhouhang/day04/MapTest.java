package com.zhouhang.day04;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * com.zhouhang.day04
 *
 * @author zhouhang
 * @date 2018/6/2 上午11:33
 * 1. 已知有一个键值都为String的HashMap集合 如果集合中存在key “ice cream”，则将其value设置为“cherry”。
 * 在所有情况下，增加 key “bread”，value 是“butter”。
 * 2. 已知有如下字符串数组:String[] strs = {"java","javascipt","android","python","php","ios"};
 * 创建一个map集合，将字符串数组的索引作为键，字符串的第一个字符作为值，添加到map集合中。
 */
public class MapTest {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        if(map.containsKey("ice cream")){
            map.put("ice cream","cherry");
        }
        map.put("bread","butter");

        String[] strs = {"java","javascript","android","python","php","ios"};
        HashMap<Integer,Character> arrMap = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            arrMap.put(i,strs[i].charAt(0));
        }
        // 遍历方式1，keySet方法
        Set<Integer> set = arrMap.keySet();
        for (int key : set) {
            System.out.println(key + " " +arrMap.get(key));
        }

        // 遍历方式2，entrySet方法
        Set<Map.Entry<Integer, Character>> entrySet = arrMap.entrySet();
        for (Map.Entry<Integer, Character> entry : entrySet) {
            System.out.print(entry.getKey() + "    ");
            System.out.println(entry.getValue());
        }

    }
}

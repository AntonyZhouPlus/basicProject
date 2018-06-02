package com.zhouhang.day04;

import java.util.HashMap;
import java.util.Map;

/**
 * com.zhouhang.day04
 *
 * @author zhouhang
 * @date 2018/6/2 上午11:23
 * // void clear() 删除所有的夫妻对
 * // boolean containsKey(Object key) 判断是否包含指定key
 * // boolean containsValue(Object value) 判断是否包含指定value
 * // V get(Object key) 根据指定键获取对应的值
 * // boolean isEmpty() 判断集合是否为空
 * // V put(K key, V value) 添加键值对，如果键已经存在，将旧的值替换为新的值，并且返回旧的值
 * // V remove(Object key) 根据指定键删除整个键值对
 * // int size() 返回键值对的对数
 */
public class MapDemo {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        System.out.println(map.put("A", 1));
        System.out.println(map.put("A", 2));
        map.put("B",2);
        map.put("C",3);
        map.put("D",4);
        map.put("E",5);
        map.put("F",6);

        System.out.println(map.containsKey("A"));
        System.out.println(map.containsValue(3));
        System.out.println(map.get("F"));
        System.out.println(map.remove("A"));
        System.out.println(map.size());
        map.clear();
        System.out.println(map.isEmpty());
    }
}

package com.zhouhang.day12homework.test09;

import java.util.*;
import java.util.function.Supplier;

/**
 * com.zhouhang.day12homework.test09
 *
 * @author zhouhang
 * @date 2018/6/15 上午9:35
 * 分别使用lambda表达式获得以下对象：
 * 长度为5的String数组
 * 包含5个1-20(含1和20)之间随机数的HashSet<Integer>集合
 * 一个代表2018年4月1日的Calendar对象
 */
public class Test09 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getObj(() -> new String[5])));
        System.out.println(getObj(() -> {
            Random rd = new Random();
            HashSet set = new HashSet();
            for (int i = 0; i < 5; i++) {
                set.add(rd.nextInt(20) + 1);
            }
            return set;
        }));
        Calendar xx = getObj(() -> {
            Calendar c = Calendar.getInstance();
            c.set(Calendar.YEAR, 2018);
            c.set(Calendar.MONTH, 3);
            c.set(Calendar.DAY_OF_MONTH, 1);
            return c;
        });
        Date time = xx.getTime();
        System.out.println(time.toLocaleString());
    }

    public static <T>T getObj(Supplier<T> supplier) {
        return supplier.get();
    }
}

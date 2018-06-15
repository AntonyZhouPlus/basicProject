package com.zhouhang.day12homework.test10;


import java.util.HashMap;
import java.util.function.Consumer;

/**
 * com.zhouhang.day12homework.test10
 *
 * @author zhouhang
 * @date 2018/6/15 上午9:50
 * 分别使用lambda表达式完成以下需求
 * 打印谷天洛的分数
 * 打印最高分
 * 分别以60分和70分为及格线，打印及格的人的名字(组合型消费)
 */
public class Test10 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("岑小村", 59);
        map.put("谷天洛", 82);
        map.put("渣渣辉", 98);
        map.put("蓝小月", 65);
        map.put("皮几万", 70);
    }

    public static <T> void doJob(T t, Consumer<T> consumer1, Consumer<T> consumer2) {
        consumer1.andThen(consumer2).accept(t);
    }

}

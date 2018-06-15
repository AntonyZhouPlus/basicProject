package com.zhouhang.day12homework.test10;


import java.util.HashMap;
import java.util.Map;
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
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("岑小村", 59);
        hashMap.put("谷天洛", 82);
        hashMap.put("渣渣辉", 98);
        hashMap.put("蓝小月", 65);
        hashMap.put("皮几万", 70);

        doJob(hashMap,
                (map)->{
                    System.out.println("青铜段位以上:");
                    for (Map.Entry<String, Integer> entry : map.entrySet()) {
                        if (entry.getValue() >= 60) {
                            System.out.println(entry.getKey());
                        }
                    }
                },
                (map)->{
                    System.out.println("=================");
                    System.out.println("我是王者：");
                    for (Map.Entry<String, Integer> entry : map.entrySet()) {
                        if (entry.getValue() >= 70) {
                            System.out.println(entry.getKey());
                        }
                    }

                });
    }

    public static <T> void doJob(T t, Consumer<T> consumer1, Consumer<T> consumer2) {
        consumer1.andThen(consumer2).accept(t);
    }

}

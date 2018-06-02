package com.zhouhang.day03;

import java.util.ArrayList;

/**
 * com.zhouhang.day03
 *
 * @author zhouhang
 * @date 上午10:43
 * 请创建ArrayList集合，存储数据类型为String。
 * ①分别将”造纸术”、“指南针”、“火药”、“活字印刷”四个元素依次存入集合；
 * ②根据索引在元素“造纸术”后添加一个新元素“移动支付”；
 * ③根据索引将其中的元素“火药”删除；
 * ④根据索引将其中的“指南针”替换为“共享单车”；
 * ⑤根据索引使用for循环遍历改变后的所有元素。
 */
public class ListDemo {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("造纸术");
        list.add("指南针");
        list.add("火药");
        list.add("活字印刷");

        list.add(1, "移动支付");
        System.out.println(list);

        list.remove(3);
        list.set(2, "共享单车");

        for (String s : list) {
            System.out.println(s);
        }
    }
}

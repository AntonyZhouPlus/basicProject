package com.zhouhang.day03;

import java.util.LinkedList;

/**
 * com.zhouhang.day03
 *
 * @author zhouhang
 * @date 2018/6/1 下午3:10
 * 请创建LinkedList集合，存储元素类型为String。
 * 将“西施”、“王昭君”、“貂蝉”、“杨玉环”四个元素依次存入集合并遍历获取，
 * 要求获取的顺序需要符合“后进先出”的特点
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("西施");
        list.addFirst("王昭君");
        list.addFirst("貂蝉");
        list.addFirst("杨玉环");

        while (!list.isEmpty()) {
            System.out.println(list.pop());
        }

    }
}

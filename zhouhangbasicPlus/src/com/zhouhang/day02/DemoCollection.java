package com.zhouhang.day02;

import java.util.ArrayList;
import java.util.Collection;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/29 11:00
 * //    boolean add(E e) 添加元素到集合中  // E 是一个泛型，当我们创建了集合对象，那么E就是你创建对象的时候指定的那个类型
 * //    void clear() 清空集合（删除所有元素
 * //    boolean contains(Object o)  判断集合中是否包含指定元素
 * //    boolean isEmpty() 判断集合是否为空（集合的长度为0）
 * //    boolean remove(Object o) 删除指定元素
 * //    int size()  获取集合的元素个数
 * //    Object[] toArray() 将集合转成Object数组（将集合中的元素存入一个Object数组中）
 */
public class DemoCollection {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<String>();
        c.add("刚被兽");
        System.out.println(c);
        /*c.clear();
        System.out.println(c);*/
        System.out.println(c.contains("龙骑士"));
        c.remove("刚被兽");
        System.out.println(c.isEmpty());
        System.out.println(c.size());
        c.add("刚被兽");
        Object[] arr = c.toArray();
        for (int i = 0; i < arr.length; i++) {
            String str = (String) arr[i];
            System.out.println(str.length());
        }


    }
}

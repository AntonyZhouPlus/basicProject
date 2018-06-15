package com.zhouhang.day12;

/**
 * com.zhouhang.day12
 *
 * @author zhouhang
 * @date 2018/6/14 下午5:31
 */
public class Test10 {
    public static void main(String[] args) {
        getPerson(Person::new,"laoli",18);
    }

    public static void getPerson(InterPerson interPerson,String name,int age) {
        System.out.println(interPerson.getPerson(name,age));
    }
}

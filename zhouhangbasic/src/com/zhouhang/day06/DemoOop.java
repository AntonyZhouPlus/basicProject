package com.zhouhang.day06;

import java.util.Arrays;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/14 11:24
 */
public class DemoOop {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        Student stu = new Student();
        Car c = new Car();

        /*System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.println(array[i] + "]");
            }else {
                System.out.print(array[i] + ", ");
            }
        }*/

        System.out.println(Arrays.toString(array));

        stu.age = 18;
        stu.name = "Anthony";
        System.out.println(stu.name);
        stu.eat();
        System.out.println("===========");

        c.brand = "AudiS8";
        c.price = 1000000;
        c.color = "Black";

        c.drive();

        Phone iphone = new Phone();

        iphone.setBrand("Apple");
        System.out.println(iphone.getBrand());
        iphone.call("Antony");

    }
}

package com.zhouhang.day06;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/14 19:03
 */
public class Test {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car("BMW", 20, "Blue");

        car1.getAddress();
        car2.getAddress();
        car3.getAddress();
        System.out.println("===============");

        car1 = car3;
        car2 = car1;
        car1.getAddress();
        car2.getAddress();
        car3.getAddress();
        car1.drive();
        car2.drive();
        car3.drive();

    }
}

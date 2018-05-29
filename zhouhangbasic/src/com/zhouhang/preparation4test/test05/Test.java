package com.zhouhang.preparation4test.test05;

import java.util.ArrayList;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/23 16:39
 */
public class Test {
    public static void main(String[] args) {
        Car one = new Car("Auto",25);
        Car two = new Car("Audi",500);
        Car three = new Car("Benz",700);
        Car four = new Car("BMW",400);

        ArrayList<Car> list =new ArrayList< Car>();
        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);
        Car.filter(list,"B");
    }
}

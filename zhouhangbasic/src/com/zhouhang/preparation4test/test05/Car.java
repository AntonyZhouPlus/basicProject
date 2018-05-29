package com.zhouhang.preparation4test.test05;

import java.util.ArrayList;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/23 16:24
 */
public class Car {
    private String brand;
    private int price;

    public Car(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static void filter(ArrayList<Car> list, String str) {
        System.out.println("以" + str + "开头的汽车与价格是：");
        for (int i = 0; i < list.size(); i++) {
            Car car = list.get(i);
            if (car.getBrand().startsWith(str)) {
                System.out.println(car.getBrand() + "-------" + car.price);
            }
        }

    }
}

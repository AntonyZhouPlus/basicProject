package com.zhouhang.day06;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/14 14:27
 */

/*汽车：
        属性：品牌、价格、颜色
        行为：驾驶*/
public class Car {
    String brand;
    int price;
    String color;

    public Car() {
    }

    public Car(String brand, int price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    public Car getAddress() {
        System.out.println(this);
        return this;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void drive() {
        System.out.println(color + brand + " which cost $" + price + " on its way");
    }
}

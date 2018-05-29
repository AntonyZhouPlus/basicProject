package com.zhouhang.test;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/15 10:35
 */

/*属性:
        品牌brand
        价格price
        行为:
        看电影movie()
        打游戏game()*/
public class Computer {
    private String brand;
    private double price;

    public Computer() {
    }

    public Computer(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void movie() {
        System.out.println("正在使用价格为" + (int) price + "元的" + brand + "电脑看电影....");
    }

    public void game() {
        System.out.println("正在使用价格为" + (int) price + "元的" + brand + "电脑打游戏....");
    }
}

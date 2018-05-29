package com.zhouhang.day06homework;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/14 21:08
 */
public class Phone {
    private String brand;
    private double price;

    public Phone() {
    }

    public Phone(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void call() {
        System.out.println("正在使用价格为" + (int) price + "元的" + brand + "品牌的手机打电话....");
    }

    public void sendMessage() {
        System.out.println("正在使用价格为" + (int) price + "元的" + brand + "品牌的手机发短信....");
    }

    public void playGame() {
        System.out.println("正在使用价格为" + (int) price + "元的" + brand + "品牌的手机玩游戏....");
    }



}

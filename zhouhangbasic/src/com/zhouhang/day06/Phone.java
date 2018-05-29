package com.zhouhang.day06;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/14 15:21
 */
public class Phone {
    private String brand;
    private Double price;
    private String color;

    public Phone() {
    }

    public Phone(String brand, Double price, String color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    public void setColor(String c) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void call(String callWho) {
        System.out.println("make a phone call to " + callWho);

    }

}

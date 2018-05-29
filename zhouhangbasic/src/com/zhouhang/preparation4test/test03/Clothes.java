package com.zhouhang.preparation4test.test03;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/23 16:53
 * 定义衣服类(Clothes)
成员变量:  颜色(color：String类型)  品牌(brand：String类型)
提供 无参,带参构造和setXxx和getXxx方法
 */
public class Clothes {
    private String color;
    private String brand;

    public Clothes() {

    }

    public Clothes(String color, String brand) {
        this.color = color;
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}

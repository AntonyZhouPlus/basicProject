package com.zhouhang.day08;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/18 20:49
 */
public class Phone {
    /*手机类Phone
    属性:品牌brand,价格price
            无参构造,有参构造
    行为:打电话call,发短信sendMessage,玩游戏playGame*/
    private String brand;
    private double price;
    private static int size;

    static {
        size = 6;
    }

    public Phone() {
    }

    public void call(){
        System.out.println("用"+size+"寸的"+price+"元"+brand+"牌手机打电话");
    }

    public void sendMessage(){
        System.out.println("用"+size+"寸的"+price+"元"+brand+"牌手机发短信");
    }

    public void playGame(){
        System.out.println("用"+size+"寸的"+price+"元"+brand+"牌手机玩游戏");
    }

    public Phone(String brand, double price) {
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
}

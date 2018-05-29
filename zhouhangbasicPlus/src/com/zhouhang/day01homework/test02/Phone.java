package com.zhouhang.day01homework.test02;

import java.util.Objects;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/28 9:30
 */
public class Phone {
    private String brand;
    private String color;
    private int price;

    public Phone() {
    }

    public Phone(String brand, String color, int price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {

        return super.toString() +
                "{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return price == phone.price &&
                Objects.equals(brand, phone.brand) &&
                Objects.equals(color, phone.color);
    }

    /*@Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (!(o instanceof Phone)) {
            return false;
        }

        Phone p = (Phone) o;
        if (this.price == ((Phone) o).price) {
            if (this.brand == null) {
                if (p.brand == null) {
                    if(this.color == null){
                        if (p.color == null) {
                            return true;
                        }
                    }else {
                        if (this.color.equals(p.color)) {
                            return true;
                        }
                    }
                }
            } else {
                if (this.brand.equals(p.brand)) {
                    if(this.color == null){
                        if (p.color == null) {
                            return true;
                        }
                    }else {
                        if (this.color.equals(p.color)) {
                            return true;
                        }
                    }
                }
            }
        }

        return false;
    }*/

    @Override
    public int hashCode() {

        return Objects.hash(brand, color, price);
    }
}

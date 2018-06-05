package com.zhouhang.day04homework.test04;

import java.util.HashMap;

/**
 * com.zhouhang.day04homework.Test04
 *
 * @author zhouhang
 * @date 2018/6/3 上午9:57
 * 创建自动售货机类(VendingMachine)
 * 属性有机器名称、饮料列表（HashMap<String, Float>）、机内剩余现金总额（float类型）
 */
public class VendingMachine {
    private HashMap<String, Float> drinkMap;
    private float money;

    public VendingMachine() {
    }

    public VendingMachine(HashMap<String, Float> drinkMap, float money) {
        this.drinkMap = drinkMap;
        this.money = money;
    }

    public HashMap<String, Float> getDrinkMap() {
        return drinkMap;
    }

    public void setDrinkMap(HashMap<String, Float> drinkMap) {
        this.drinkMap = drinkMap;
    }

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "VendingMachine{" +
                "drinkMap=" + drinkMap +
                ", money=" + money +
                '}';
    }

    // 在VendingMachine类中定义购买饮料的方法：
    // 传入钞票和饮料名称后，需要判断传入的钞票是否为真、面值是否足够购买此类饮料；若不符合购买条件给出错误提示，结束购买流程；
    // 若购买成功后需打印出找零金额和目前机内现金总额；
    public void buyDrink(String name, Money money) {
        if (!money.isJudge()) {
            System.out.println("假币");
            return;
        }
        float cost = drinkMap.get(name);
        if(money.getValue() < cost){
            System.out.println("钱不够，穷b");
            return;
        }
        System.out.println("找零金额:");
        System.out.println(money.getValue() - cost);
        System.out.println("机内金额:");
        System.out.println(this.money + cost);

    }
}

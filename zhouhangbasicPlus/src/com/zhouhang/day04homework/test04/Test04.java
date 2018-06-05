package com.zhouhang.day04homework.test04;

import java.util.HashMap;

/**
 * com.zhouhang.day04homework.Test04
 *
 * @author zhouhang
 * @date 2018/6/3 上午10:00
 * 创建test类，根据以下要求完成相关功能:
 * (1)创建一个名为“有料饮料售货机”的售货机（VendingMachine），
 * 给“饮料列表属性赋值并添加附件列表中的元素”（直接添加到集合即可不用IO），设置机内剩余现金总额为100.0元。
 * (2)调用售货机的购买饮料方法，向售货机投入10元的真币在“有料饮料售货机”成功购买一瓶脉动。
 */
public class Test04 {
    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();
        HashMap<String, Float> drinkMap = new HashMap<>();
        drinkMap.put("脉动", 3.5F);
        drinkMap.put("可乐", 2.5F);
        drinkMap.put("芬达", 4.0F);
        vm.setDrinkMap(drinkMap);
        vm.setMoney(200.0F);

        Money money = new Money(10, true);
        vm.buyDrink("脉动", money);

    }

}

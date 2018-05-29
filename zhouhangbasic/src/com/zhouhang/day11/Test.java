package com.zhouhang.day11;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/24 17:47
 */
public class Test {
    public static void main(String[] args) {
        Hero h = new Hero();
        Weapon w = new Weapon("AK-47");
        h.setWeapon(w);
        h.attack();

        InterA a = function();
        a.method();
    }

    public static InterA function(){
        return new InterA() {
            @Override
            public void method() {
                System.out.println("接口作为返回值类型的test run");
            }
        };
    }
}

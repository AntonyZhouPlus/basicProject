package com.zhouhang.day06homework;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/14 21:18
 */
public class Test {
    public static void main(String[] args) {
        test02();
        test03();
        test04();

    }

    public static void test04() {
        Cat bosi = new Cat();
        //Cat bosi = new Cat("花","波斯");
        Dog zangao = new Dog();
        //Dog zangao = new Dog("黑","藏獒");

        bosi.setBreed("波斯");
        bosi.setColor("花");
        zangao.setBreed("藏獒");
        zangao.setColor("黑");

        bosi.eat("鱼");
        bosi.catchMouse();
        zangao.eat("骨头");
        zangao.lookHome();
    }

    public static void test03() {
        Manager manager = new Manager();
        //Manager manager = new Manager("XX",123,15000.0,6000.0);
        manager.setId(123);
        manager.setSalary(15000.0);
        manager.setBonus(6000.0);
        manager.work();

        Coder coder = new Coder();
        //Coder coder = new Coder("XX", 135, 10000.0);
        coder.setId(135);
        coder.setSalary(10000.0);
        coder.work();
    }

    public static void test02() {
        Phone miPhone = new Phone();
        //Phone miPhone = new Phone("小米"， 999.0);
        miPhone.setBrand("小米");
        miPhone.setPrice(999.0);

        miPhone.call();
        miPhone.sendMessage();
        miPhone.playGame();
    }

}

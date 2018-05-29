package com.zhouhang.preparation4test.test04;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/24 9:05
 * 定义测试类Test
 * 提供静态方法去运动goToSport(Sport  s) ,在方法中调用s的打篮球功能
 * 提供静态方法去餐馆goToRestaurant(Person p),在方法中调用p对象的吃方法
 * 提供main方法，在main方法中
 * 创建运动老师对象sp,年龄赋值为30,姓名赋值为周晓斌
 * 创建运动学生对象ss,年龄赋值为18,姓名赋值为叶知秋
 * 调用去运动goToSport方法传入对象sp
 * 调用去运动goToSport方法,传入对象ss
 * 调用去食堂goToRestaurant方法,传入sp
 * 调用去食堂goToRestaurant方法,传入ss
 */
public class Test {
    public static void main(String[] args) {
        SportTeacher sp = new SportTeacher("周晓斌",30);
        SportStudent ss = new SportStudent("叶知秋",18);
        goToSport(sp);
        goToSport(ss);
        goToRestaurant(sp);
        goToRestaurant(ss);

    }

    public static void goToSport(Sport s){
        s.playBasketball();
    }

    public static void goToRestaurant(Person p){
        p.eat();
    }

}

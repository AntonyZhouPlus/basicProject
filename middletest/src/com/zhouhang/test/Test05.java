package com.zhouhang.test;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/15 10:34
 */
/*
按照以上要求定义类,属性要私有,生成空参、有参构造，setter和getter方法
        2.定义测试类,在main方法中创建该类的对象并给属性赋值(演示两种方法:setter方法和构造方法)
        3.调用三个成员方法,打印格式如下:
        正在使用价格为12000元的苹果电脑看电影....
        正在使用价格为6500元的联想电脑打游戏....*/
public class Test05 {
    public static void main(String[] args) {
        Computer apple = new Computer("苹果",12000.0);
        //apple.setBrand("苹果");
        //apple.setPrice(12000.0);
        Computer lenovo = new Computer("联想",6500.0);
        //lenovo.setBrand("联想");
        //lenovo.setPrice(6500.0);

        apple.movie();
        lenovo.game();

    }
}

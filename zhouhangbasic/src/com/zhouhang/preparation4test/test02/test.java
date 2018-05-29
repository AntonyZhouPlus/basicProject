package com.zhouhang.preparation4test.test02;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/23 16:14
 * 4.定义Test类
①提供main方法,在main方法中
i.创建公鸡对象c,并把颜色赋值为”红色”,年龄赋值为2
ii.调用公鸡对象c的吃饭方法
iii.调用公鸡对象c的打鸣方法
iv.创建鸭子对象 d,并把颜色赋值为”黑色”,年龄赋值为1.
v.调用鸭子对象 d 的吃饭方法
vi.调用鸭子对象 d 的游泳方法
 */
public class test {
    public static void main(String[] args) {
        Cock c = new Cock("红色",2);
        c.eat();
        c.crow();

        Duck d = new Duck("黑色",1);
        d.eat();
        d.swimming();
    }
}

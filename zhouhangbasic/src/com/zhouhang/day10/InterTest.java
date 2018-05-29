package com.zhouhang.day10;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/21 15:35
 */
public class InterTest implements InterDemo3{
    public InterTest() {
    }

    @Override
    public void method() {
        System.out.println("我是接口InterDemo的实现类");
        System.out.println(InterDemo.num);
        method2();
    }

    @Override
    public void methodDefault() {
        System.out.println("重写默认方法");
    }


    @Override
    public void method2() {

    }
}

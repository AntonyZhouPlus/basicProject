package com.zhouhang.day11;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/24 15:09
 */
public class TestInnerClass {
    public static void main(String[] args) {
        function(new InterA() {

            @Override
            public void method() {
                System.out.println("匿名内部类");
            }
        });

        Body.Heart h = new Body().new Heart();  // 成员内部类创建方法
        h.beat();
        Body.Eye e = new Body.Eye(); // 静态成员内部类创建方法
        e.see();
    }

    public static void function(InterA a) {
        a.method();
    }
}

package com.zhouhang.day11;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/24 15:07
 */
public class Body {
    int num = 1;
    public void method(){
        System.out.println("Body Method");
    }
    public class Heart{
        int num = 1;
        public void method(){
            System.out.println("Heart Method");
        }
        public void beat(){
            method();
            Body.this.method();
            System.out.println(this.num);
            System.out.println(Body.this.num);
            System.out.println("Heart Beat");
        }
    }

    public static class Eye{
        public void see(){
            System.out.println("Eye See");
        }
    }

    /**
     * basicProject
     *
     * @author Zhouhang Anthony
     * @date 2018/5/24 17:44
     */
    public static class Weapon {
    }
}

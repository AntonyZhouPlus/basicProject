package com.zhouhang.ooptest;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/21 19:33
 */
public class Test {
    public static void main(String[] args) {
        Person p1 = new PinPangPlayer();
        Person p2 = new BasketBallPlayer();
        Person p3 = new BasketBallCoach();
        Person p4 = new PinPangCoach();

        BasketBallPlayer bbp = (BasketBallPlayer)p2;
        bbp.learnEnglish();
        bbp.learn();
    }

    public static Person typeTrans(Person p){
        if(p instanceof BasketBallPlayer){
            return  (BasketBallPlayer)p;
        }else if(p instanceof BasketBallCoach){
            return (BasketBallCoach)p;
        }else if(p instanceof PinPangPlayer){
            return (PinPangPlayer)p;
        }else if(p instanceof PinPangCoach){
            return (PinPangCoach)p;
        }else {
            System.out.println("err");
            return null;
        }
    }
}

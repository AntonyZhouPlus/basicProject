package com.zhouhang.day10homework02;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/23 9:16
 */
public class Feeder {
    public void keep(Animal a){
        a.eat();
        a.drink();
        if(a instanceof ISwimming){
            ISwimming i = (ISwimming) a;
            i.swimming();
        }
    }

}

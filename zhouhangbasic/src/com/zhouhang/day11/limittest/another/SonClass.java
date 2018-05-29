package com.zhouhang.day11.limittest.another;

import com.zhouhang.day11.limittest.MyClass;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/24 11:48
 */
public class SonClass extends MyClass {
    public void xx(){
        MyClass myClass = new MyClass();
        System.out.println(myClass.num4 + super.num3);
        System.out.println(new SonClass().num3);
    }
}

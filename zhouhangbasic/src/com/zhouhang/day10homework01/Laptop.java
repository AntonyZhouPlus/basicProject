package com.zhouhang.day10homework01;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/22 10:44
 */
public class Laptop {
    public void open(){
        System.out.println("开机");
    }
    public void close(){
        System.out.println("关机");
    }

    public void useUSB(Iusb u){
        u.open();
        if(u instanceof Mouse){
            ((Mouse) u).click();
        }else if( u instanceof Keyboard){
            ((Keyboard) u).type();
        }
        u.close();
    }
}

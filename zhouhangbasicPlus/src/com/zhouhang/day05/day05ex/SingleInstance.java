package com.zhouhang.day05.day05ex;

/**
 * com.zhouhang.day05.day05ex
 *
 * @author zhouhang
 * @date 2018/6/4 下午7:50
 */
public class SingleInstance {
    // 方式一：饿汉式
    /*private SingleInstance(){};
    private final static SingleInstance singleInstance = new SingleInstance();

    public static SingleInstance getSingleInstance(){
        return singleInstance;
    }*/

    // 方式二：懒汉式 （单例设计模式的延迟加载）
    private SingleInstance(){}
    private static SingleInstance singleInstance = null;

    public static SingleInstance getSingleInstance(){
        if(singleInstance == null){
            return singleInstance = new SingleInstance();
        }
        return singleInstance;
    }
}

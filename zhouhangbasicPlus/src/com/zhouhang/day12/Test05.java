package com.zhouhang.day12;

/**
 * com.zhouhang.day12
 *
 * @author zhouhang
 * @date 2018/6/14 下午3:12
 * //    假设我们想要在测试类中调用该方法开启线程,
 *             new Thread(get()).start();
 */
public class Test05 {
    public static Runnable get(){
        return ()-> System.out.println(123);
    }


    public static void main(String[] args) {
        new Thread(get()).start();
    }

}

package com.zhouhang.day07;

/**
 * com.zhouhang.day07
 *
 * @author zhouhang
 * @date 2018/6/7 上午11:08
 */
public class NotifyDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread xx = new Thread("A:") {
            @Override
            public void run() {
                synchronized ("123") {
                    System.out.println(getName()+getState());
                    try {
                        "123".wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(getName() + getState());
                }
            }
        };

        Thread xx2 = new Thread("B:") {
            @Override
            public void run() {
                synchronized ("123") {
                    System.out.println(getName()+getState());
                    try {
                        "123".wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(getName() + getState());
                }
            }
        };

        xx.start();
        xx2.start();

        new Thread("Invoker") {
            @Override
            public void run() {
                synchronized ("123") {
                    try {

                        System.out.println(xx.getName() + xx.getState());
                        System.out.println(xx2.getName() + xx2.getState());
                        sleep(1000);
                        System.out.println("Invoker:Sleep");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Invoker:invoke");
                    "123".notifyAll();
                    System.out.println(xx.getName() + xx.getState());
                    System.out.println(xx2.getName() + xx2.getState());
                }
            }
        }.start();
    }
}

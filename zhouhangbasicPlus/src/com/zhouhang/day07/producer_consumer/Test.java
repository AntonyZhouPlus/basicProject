package com.zhouhang.day07.producer_consumer;

/**
 * com.zhouhang.day07.producer_consumer
 *
 * @author zhouhang
 * @date 2018/6/7 下午2:42
 */
public class Test {
    public static void main(String[] args) {
        Goods goods = new Goods();
        Producer p = new Producer();
        MyConsumer c= new MyConsumer();
        p.setGoods(goods);
        c.setGoods(goods);
        p.start();
        c.start();

    }
}

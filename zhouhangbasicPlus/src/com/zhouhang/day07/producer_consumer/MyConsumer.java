package com.zhouhang.day07.producer_consumer;

/**
 * com.zhouhang.day07.producer_consumer
 *
 * @author zhouhang
 * @date 2018/6/7 下午2:39
 */
public class MyConsumer extends Thread {
    private Goods goods;

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (goods) {
                if (goods.isFlag()){
                    try {
                        sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("MyConsumer cost the Goods");
                    goods.setFlag(false);
                    goods.notify();
                }
                try {
                    goods.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

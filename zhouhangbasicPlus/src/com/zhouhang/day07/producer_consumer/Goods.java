package com.zhouhang.day07.producer_consumer;

/**
 * com.zhouhang.day07.producer_consumer
 *
 * @author zhouhang
 * @date 2018/6/7 下午2:35
 */
public class Goods {
    private boolean flag = false;

    public Goods(boolean flag) {
        this.flag = flag;
    }

    public Goods() {
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}

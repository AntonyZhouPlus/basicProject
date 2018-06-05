package com.zhouhang.day04homework.test04;

/**
 * com.zhouhang.day04homework.Test04
 *
 * @author zhouhang
 * @date 2018/6/3 上午9:54
 * 创建钞票类（Money）
 * 属性：面值、真假(bolean类型)
 */
public class Money {
    private int value;
    private boolean judge;

    public Money() {
    }

    public Money(int value, boolean judge) {
        this.value = value;
        this.judge = judge;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isJudge() {
        return judge;
    }

    public void setJudge(boolean judge) {
        this.judge = judge;
    }

    @Override
    public String toString() {
        return "Money{" +
                "value=" + value +
                ", judge=" + judge +
                '}';
    }
}

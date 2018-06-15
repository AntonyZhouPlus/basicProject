package com.zhouhang.day12homework.test05;

/**
 * com.zhouhang.day12homework.test05
 *
 * @author zhouhang
 * @date 2018/6/14 下午8:29
 */
public class Son extends Father {
    @Override
    public void askMoney() {
        System.out.println("向家中的财政老大要钱交(上)学(网)费(吧)...");
    }
    @Override
    public void spendMoney() {
        System.out.println("去网吧付钱给网管开了一台机器...");
    }

    public void helpFather(Helper helper) {
        helper.help();
    }

    public void daJiangYou() {
        helpFather(super::spendMoney);
    }
}

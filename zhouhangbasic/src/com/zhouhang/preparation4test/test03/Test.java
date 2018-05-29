package com.zhouhang.preparation4test.test03;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/23 17:04
 */
public class Test {
    public static void main(String[] args) {
        Clothes c = new Clothes("白色","李宁");
        Girl girl = new Girl("欧阳青清",18,1.6,"瓜子脸");
        girl.say("有脏衣服");
        girl.wash(c);
        girl.say("衣服洗干净之后真好");

    }
}

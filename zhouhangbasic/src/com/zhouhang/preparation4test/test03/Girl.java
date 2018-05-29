package com.zhouhang.preparation4test.test03;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/23 16:58
 */
public class Girl extends Person {
    private String face;

    public Girl(String face) {
    }

    public Girl(String name, int age, double height, String face) {
        super(name, age, height);
        this.face = face;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    @Override
    public void say(String content) {
        System.out.println(getName() + "说：" + content);
    }

    public void wash(Clothes c) {
        System.out.println(getName() + "在洗一件" + c.getColor() + "的" + c.getBrand() + "牌子的衣服");
    }
}

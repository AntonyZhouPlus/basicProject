package com.zhouhang.day09homework;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/20 21:32
 */
public abstract class BaseAnimal {
    /**
     * 属性：
     * 年龄，颜色
     * eat(String something)方法(无具体行为,不同动物吃的方式和东西不一样,something表示吃的东西)
     * 生成空参有参构造，set和get方法
     */
    private int age;
    private String color;

    public BaseAnimal() {

    }

    public BaseAnimal(int age, String color) {
        this.age = age;
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    /**
     *
     * @param something 狗吃的东西
     */
    public abstract void eat(String something);
}

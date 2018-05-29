package com.zhouhang.preparation4test.test01;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/23 15:44
 */
/*定义一个Teacher类(教师类)，包含满参构造方法和以下成员属性：
        成员属性: 姓名（String）
        工龄（int）
        所授学科（String）*/

public class Teacher {
    private String name;
    private int age;
    private String subject;

    public Teacher(String name, int age, String subject) {
        this.name = name;
        this.age = age;
        this.subject = subject;
    }

    /**
     * @return a string representation of the object.
     */
    @Override
    public String toString() {
        return name + "工龄为" + age + "所授学科是：" + subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}

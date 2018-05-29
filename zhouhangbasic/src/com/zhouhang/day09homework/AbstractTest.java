package com.zhouhang.day09homework;

/**
 * basicProject
 *
 * @author Zhouhang Anthony
 * @date 2018/5/21 11:09
 */
public class AbstractTest {
    public static void main(String[] args) {
        MathTeacher teacher = new MathTeacher();
        ChineseTeacher teacher1 = new ChineseTeacher();
        teacher.teach();
        teacher1.teach();
    }
}

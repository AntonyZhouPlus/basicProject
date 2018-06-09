package com.zhouhang.day05homework.test02;

/**
 * com.zhouhang.day05homework.Test
 *
 * @author zhouhang
 * @date 2018/6/4 下午8:16
 * 定义一个方法用于检查分数是否合法，如果不合法则抛出一个编译期异常
 * 要求：异常的名称为：IllegalScoreException,异常的原因为：分数不合法
 */
public class Test02 {
    public static void main(String[] args) {
        try {
            checkScore(1);
            checkScore(-1);
        } catch (IllegalScoreException e) {
            e.printStackTrace();
            Runtime.getRuntime().exit(0); // 等效System.exit(0);
        }finally {
            System.out.println("此代码无法执行到"); // 只有关闭虚拟机，不然无法阻止finally代码块执行
        }



    }

    public static void checkScore(int score) throws IllegalScoreException {
        if (score < 0) {
            throw new IllegalScoreException("score = " + score + "分数不能为负");
        }
    }
}

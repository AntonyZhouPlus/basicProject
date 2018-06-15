package com.zhouhang.day12homework.test07;

/**
 * com.zhouhang.day12homework.test07
 *
 * @author zhouhang
 * @date 2018/6/15 上午8:59
 */
public class Test07 {
    public static void main(String[] args) {
        Car Q7 = getCar(Car::new);
        Q7.setBrand("audi");
    }

    public static Car getCar(BeanFactory<Car> beanFactory) {
        return beanFactory.getBean();
    }
}

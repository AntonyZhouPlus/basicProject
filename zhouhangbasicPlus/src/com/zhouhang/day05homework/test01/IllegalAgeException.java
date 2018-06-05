package com.zhouhang.day05homework.test01;

/**
 * com.zhouhang.day05homework.test01
 *
 * @author zhouhang
 * @date 2018/6/4 下午8:12
 */
public class IllegalAgeException extends RuntimeException{
    public IllegalAgeException() {
    }

    public IllegalAgeException(String message) {
        super(message);
    }
}

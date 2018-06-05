package com.zhouhang.day05;

/**
 * com.zhouhang.day05
 *
 * @author zhouhang
 * @date 2018/6/4 下午4:32
 */
public class LoginException extends RuntimeException {
    public LoginException() {
    }

    public LoginException(String message) {
        super(message);
    }
}

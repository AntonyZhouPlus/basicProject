package com.zhouhang.day11homework.test01;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * com.zhouhang.day11homework
 *
 * @author zhouhang
 * @date 2018/6/13 下午8:09
 * 需求说明：创建新项目，按以下要求编写代码：
 * 在项目下创建TCP 服务器端 端口号为8888
 * 1:等待客户端连接   如果有客户端连接  获取到客户端对象
 * 2:获取到客户端对象之后 当前在服务器读取数据客户端传送数据
 */
public class Test01 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(),8888);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("213123213131".getBytes());

    }
}

package com.zhouhang.day11homework.test02;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * com.zhouhang.day11homework.Test02
 *
 * @author zhouhang
 * @date 2018/6/13 下午8:19
 * 需求说明：使用TCP编写一个网络程序,设置服务器程序监听端口为8002,当于客户端建立后,向客户端发送”hello world”,客户端将信息输出
 */
public class Test02Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8002);
        Socket accept = ss.accept();
        OutputStream outputStream = accept.getOutputStream();
        outputStream.write("hello world".getBytes());
        outputStream.close();
        accept.close();
    }
}

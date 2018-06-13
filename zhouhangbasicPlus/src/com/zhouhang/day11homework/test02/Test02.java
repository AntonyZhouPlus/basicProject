package com.zhouhang.day11homework.test02;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * com.zhouhang.day11homework.Test02
 *
 * @author zhouhang
 * @date 2018/6/13 下午8:19
 * 需求说明：使用TCP编写一个网络程序,设置服务器程序监听端口为8002,当于客户端建立后,向客户端发送”hello world”,客户端将信息输出
 */
public class Test02 {

    public static void main(String[] args) throws IOException {
        Socket s = new Socket(InetAddress.getLocalHost(),8002);
        InputStream inputStream = s.getInputStream();
        byte[] bytes = new byte[8];
        int len;
        while ((len = inputStream.read(bytes)) != -1) {
            System.out.print(new String(bytes,0,len));
        }
        inputStream.close();

    }

}

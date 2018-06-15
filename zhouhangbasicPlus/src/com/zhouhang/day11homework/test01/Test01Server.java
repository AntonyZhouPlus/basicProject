package com.zhouhang.day11homework.test01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * com.zhouhang.day11homework.Test01
 *
 * @author zhouhang
 * @date 2018/6/13 下午8:10
 * 需求说明：创建新项目，按以下要求编写代码：
 *  * 在项目下创建TCP 服务器端 端口号为8888
 *  * 1:等待客户端连接   如果有客户端连接  获取到客户端对象
 *  * 2:获取到客户端对象之后 当前在服务器读取数据客户端传送数据
 */
public class Test01Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8888);
        while (true) {
            Socket accept = ss.accept();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        BufferedReader br =new BufferedReader(new InputStreamReader(accept.getInputStream()));
                        String str;
                        while ((str = br.readLine())!= null){
                            System.out.println(str);
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }

    }
}

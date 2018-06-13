package com.zhouhang.day11;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * com.zhouhang.day11
 *
 * @author zhouhang
 * @date 2018/6/13 上午11:40
 */
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        ExecutorService pool = Executors.newFixedThreadPool(3);


        while (true) {
            Socket s = serverSocket.accept();
            System.out.println(s.getLocalAddress().getHostAddress());

            Runnable r = () -> {
                try {
                    BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(System.currentTimeMillis()+".txt"));
                    BufferedInputStream bis = new BufferedInputStream(s.getInputStream());
                    byte[] bytes = new byte[1024];
                    int len;
                    while ((len = bis.read(bytes)) != -1) {
                        bos.write(bytes,0,len);
                    }
                    bis.close();
                    bos.close();
                    s.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            };

            pool.submit(r);
        }

//        Runnable r = () -> {
//            try {
//
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//
//        };
//        pool.submit(r);

    }
}

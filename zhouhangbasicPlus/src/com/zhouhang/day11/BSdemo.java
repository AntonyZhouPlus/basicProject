package com.zhouhang.day11;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * com.zhouhang.day11
 *
 * @author zhouhang
 * @date 2018/6/13 下午5:23
 * out.write("HTTP/1.1 200 OK\r\n".getBytes());
 * out.write("Content‐Type:text/html\r\n".getBytes());
 * out.write("\r\n".getBytes());
 */
public class BSdemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8848);
        while (true) {
            Socket accept = ss.accept();

            new Thread(() -> {
                try {
                    BufferedReader br = new BufferedReader(new InputStreamReader(accept.getInputStream()));
                    String s = br.readLine();
                    String[] strs = s.split(" ");
                    String path = strs[1].substring(1);
                    System.out.println(path);



                    BufferedOutputStream bos  = new BufferedOutputStream((accept.getOutputStream()));
                    bos.write("HTTP/1.1 200 OK".getBytes());
                    bos.write(System.lineSeparator().getBytes());
                    bos.write("Content‐Type:text/html".getBytes());
                    bos.write(System.lineSeparator().getBytes());
                    bos.write(System.lineSeparator().getBytes());
                    byte[] bytes = new byte[1024];
                    int len;

                    BufferedInputStream bis = new BufferedInputStream(new FileInputStream(path));
                    while ((len = bis.read(bytes)) != -1) {
                        bos.write(bytes,0,len);
                    }

                    bos.close();
                    bis.close();
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }).start();
        }


    }
}

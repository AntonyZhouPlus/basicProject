package com.zhouhang.day11;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * com.zhouhang.day11
 *
 * @author zhouhang
 * @date 2018/6/13 上午11:34
 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
            Socket client = new Socket(InetAddress.getLocalHost(),9999);

            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("a.txt"));
            BufferedOutputStream pw = new BufferedOutputStream(client.getOutputStream());
            byte[] bytes = new byte[5];
            int len;
            while ((len = bis.read(bytes)) != -1) {
                pw.write(bytes,0,len);
            }
            pw.close();
            bis.close();
    }
}

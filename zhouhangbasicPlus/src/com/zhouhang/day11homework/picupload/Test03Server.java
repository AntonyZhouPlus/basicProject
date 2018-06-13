package com.zhouhang.day11homework.picupload;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * com.zhouhang.day11homework.picupload
 *
 * @author zhouhang
 * @date 2018/6/13 下午8:40
 * 客户端需求：把一个图片文件发送到服务端并读取回馈信息。要求判断文件是否存在及格式是否为jpg并要求文件小于2M。
 * 服务端需求：接收客户端发送过来的图片数据。进行存储后，回馈一个“上传成功”字样。支持多用户的并发访问。
 */
public class Test03Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8848);
        while (true) {
            Socket accept = ss.accept();
            new Thread(() -> {
                try {
                    BufferedInputStream bis = new BufferedInputStream(accept.getInputStream());
                    new File("server").mkdirs();
                    BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(
                            "server/"+System.currentTimeMillis()+".jpg"));
                    byte[] bytes = new byte[1024];
                    int len;
                    while ((len = bis.read(bytes)) != -1) {
                        bos.write(bytes,0,len);
                        bos.flush();
                    }
                    System.out.println("back");
                    OutputStream bos2 = accept.getOutputStream();
                    bos2.write("上传成功".getBytes());

                    bis.close();
                    bos.close();
                    bos2.close();
                    accept.close();


                } catch (IOException e) {
                    e.printStackTrace();
                }

            }).start();
        }
    }
}

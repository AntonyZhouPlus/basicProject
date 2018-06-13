package com.zhouhang.day11homework.picupload;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * com.zhouhang.day11homework.picupload
 *
 * @author zhouhang
 * @date 2018/6/13 下午8:40
 * 客户端需求：把一个图片文件发送到服务端并读取回馈信息。要求判断文件是否存在及格式是否为jpg并要求文件小于2M。
 * 服务端需求：接收客户端发送过来的图片数据。进行存储后，回馈一个“上传成功”字样。支持多用户的并发访问。
 */
public class Test03 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(),8848);
        File file = new File("rename.jpg");
//        File file = new File("lion.jpg");
        if (file.length() > 1024 * 1024 * 2) {
            System.out.println("图片过大");
        }else {
            BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
            byte[] bytes = new byte[1024];
            int len;
            while ((len = bis.read(bytes)) != -1) {
                bos.write(bytes,0,len);
                bos.flush();
            }
            socket.shutdownOutput();
            InputStream bis2 = socket.getInputStream();
            byte[] back = new byte[12];
            len = bis2.read(back);
            System.out.println(new String(back,0,len));
            bis2.close();
            bis.close();
            bos.close();
            socket.close();
        }


    }

    public static void upload(File file, Socket socket) throws IOException {


    }
}

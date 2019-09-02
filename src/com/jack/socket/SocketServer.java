package com.jack.socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Create with IDEA.
 *
 * @Package: com.jack.socket
 * @Description:
 * @Date: 2019/9/2 08:09
 * @Author: Wyj
 */
public class SocketServer {

    public static void main(String[] args) throws IOException {

        // socket服务端口
        int port = 8888;
        // 创建一个ServerSocket
        ServerSocket ss = new ServerSocket(port);
        // 监听来自客户端的连接
        Socket s = ss.accept();
        // 数据输入流
        DataInputStream dis = new DataInputStream(s.getInputStream());
        // 数据输出流
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());

        do {

            // 接收来自客户端的值
            Double length = dis.readDouble();
            System.out.println("从客户端获取到的长度为：" + length);
            Double area = length * length;
            // 写入值，返回到客户端
            dos.writeDouble(area);
            dos.flush();
        }while (dis.readInt() != -1);

        // 关闭资源
        s.close();
        ss.close();

    }

}

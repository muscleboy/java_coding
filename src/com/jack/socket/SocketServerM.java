package com.jack.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Create with IDEA.
 *
 * @Package: com.jack.socket
 * @Description:
 * @Date: 2019/9/2 15:17
 * @Author: Wyj
 */
public class SocketServerM {

    public static void main(String[] args) throws IOException{

        int port = 7000;
        int clientNo = 1;

        ServerSocket ss = new ServerSocket(port);
        // 创建线程池
        ExecutorService exec = Executors.newCachedThreadPool();

        try {

            while (true) {

                Socket s = ss.accept();
                exec.execute(new SingleSocket(s, clientNo));
                clientNo++;
            }
        }finally {

            ss.close();
        }
    }

}

/**
* @Description: 多线程网络编程
* @Param:
* @return:
*/
class SingleSocket implements Runnable{

    private Socket socket;
    int clientNo;

    public SingleSocket(Socket socket, int clientNo) {
        this.socket = socket;
        this.clientNo = clientNo;
    }

    @Override
    public void run() {

        System.out.println("等待来自客户端的连接......");
        try {

            // 数据输入，输出流
            DataInputStream dis = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
            DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(socket.getOutputStream()));

            do {

                Double length = dis.readDouble();
                System.out.println("客户端编号：" + clientNo + ", 获取到的边长：" + length);
                Double area = length * length;
                dos.writeDouble(area);
                dos.flush();

            }while (dis.readInt() != 0);

        } catch (IOException e) {
            e.printStackTrace();
        }finally {

            System.out.println("与客户端" + clientNo + "通信结束");
            try {

                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

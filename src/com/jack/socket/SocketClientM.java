package com.jack.socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

/**
 * Create with IDEA.
 *
 * @Package: com.jack.socket
 * @Description:
 * @Date: 2019/9/2 08:28
 * @Author: Wyj
 */
public class SocketClientM {

    public static void main(String[] args) throws IOException {

        // 连接到服务端
        Socket s = new Socket("127.0.0.1", 7000);
        // 数据输入，输出流
        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());

        Scanner input = new Scanner(System.in);
        Boolean flag = true;

        while (flag){

            System.out.println("请输入边长: ");
            // 将输入的值输出到输出流dos, 传到服务器
            dos.writeDouble(input.nextDouble());
            // 从服务器获取结果
            double area = dis.readDouble();
            System.out.println("从服务器获取的面积：" + area);

            while (true) {

                System.out.println("是否继续计算?Y/N");
                String str = input.next();

                if (str.equalsIgnoreCase("n")){

                    dos.writeDouble(0);
                    dos.flush();
                    flag = false;
                    break;

                }else if (str.equalsIgnoreCase("y")){

                    dos.writeInt(1);
                    dos.flush();
                    break;
                }
            }
        }

        s.close();
    }

}

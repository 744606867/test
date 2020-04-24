package com.taiyue.bio;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BioNetty {

    public static void main(String[] args) throws IOException {


        ExecutorService executorService = Executors.newCachedThreadPool();

        ServerSocket serverSocket = new ServerSocket(6666);

        System.out.println("服务端已创建");

        while (true){
           final Socket socket = serverSocket.accept();
            System.out.println("获取一个连接");

            executorService.execute(new Runnable() {
                public void run() {
                    try {
                        InputStream inputStream = socket.getInputStream();
                        byte[] bytes = new byte[1024];
                        while (true){
                            int read = inputStream.read(bytes);
                            if (read!=-1){
                                System.out.println(new java.lang.String(bytes));
                            }else {
                                break;
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }

    }

    @Test
    public void sad() throws IOException {
        Socket socket1 = new Socket();
        SocketAddress socketAddress = new InetSocketAddress(6666);
        socket1.connect(socketAddress);
        OutputStream outputStream = socket1.getOutputStream();

        outputStream.write("asd".getBytes());


    }
}

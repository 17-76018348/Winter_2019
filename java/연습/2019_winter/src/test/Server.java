package test;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import chattingServer.ServerIn;

public class Server {
	 public static void main(String[] args) {
	        int port = 5050;    // ���� ������ ����
	        try {
	            @SuppressWarnings("resource")
	            ServerSocket ssk = new ServerSocket(port);
	            System.out.println("���� ���� �����");      
	            Socket scok = ssk.accept();
	            ServerSend send_thread = new ServerSend(scok);
	            //ServerReceive rec_thread = new ServerReceive(scok);
	            send_thread.start();
	            //rec_thread.start();
	            
	        } catch (IOException e) {
	            // TODO �ڵ� ������ catch ���
	            e.printStackTrace();
	        }        
	    }
}

package customer_server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {

	public Info info;

	public static void main(String[] args) {

		try {
			ServerSocket servSocket = new ServerSocket(6670);
			Socket socket = servSocket.accept();
			System.out.println("1");
			ServerIn inThread = new ServerIn(socket);
			inThread.start();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}

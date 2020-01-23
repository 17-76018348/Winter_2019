package chattingServer;


import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class ServerEx {
	public static void main(String[] args) {
		try {
			ServerSocket servSocket = new ServerSocket(5054);

			Socket socket = servSocket.accept();
			ServerIn inThread = new ServerIn(socket);
			ServerOut outThread = new ServerOut(socket);

			inThread.start();
			outThread.start();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

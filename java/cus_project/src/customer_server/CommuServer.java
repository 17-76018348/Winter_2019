package customer_server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;



public class CommuServer {
	public void commu() {
		try {
			ServerSocket servSocket = new ServerSocket(6670);
			Socket socket = servSocket.accept();
			
			ServerIn inThread = new ServerIn(socket);
//			ServerOut outThread = new ServerOut(socket);
			
			inThread.start();
//			outThread.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}

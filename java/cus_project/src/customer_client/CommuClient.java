package customer_client;

import java.io.IOException;

import java.net.Socket;



public class CommuClient {
	public void commu() {
		try {
			Socket socket = new Socket("DESKTOP-R784730", 6670);
			Info info = new Info();
//			ClientIn inThread = new ClientIn(socket);
			ClientOut outThread = new ClientOut(socket,info);

//			inThread.start();
			outThread.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

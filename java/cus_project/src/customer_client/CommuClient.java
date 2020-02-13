package customer_client;

import java.io.IOException;

import java.net.Socket;



public class CommuClient {
	Socket socket;
	public void commu() {
		try {
			socket = new Socket("DESKTOP-R784730", 6670);
			Info info = new Info();
			ClientIn inThread = new ClientIn(socket);
			inThread.start();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public Socket getSocket() {
		return this.socket;
	}
}

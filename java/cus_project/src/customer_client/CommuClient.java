package customer_client;

import java.io.IOException;

import java.net.Socket;
import java.net.UnknownHostException;



public class CommuClient {
	Socket socket;
	CommuClient() throws IOException{
		this.socket = new Socket("DESKTOP-R784730", 6671);
	}
	public void commu() {

			Info info = new Info();
			ClientIn inThread = new ClientIn(socket);
			inThread.start();
		
	}
	public Socket getSocket() {
		
		return this.socket;
	}
}

package chattingClient;


import java.io.IOException;
import java.net.Socket;


public class ClientEx {
	public static void main(String[] args) {
		try {
			Socket socket = new Socket("DESKTOP-R784730", 6670);

			ClientIn inThread = new ClientIn(socket);
			ClientOut outThread = new ClientOut(socket);

			inThread.start();
			outThread.start();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

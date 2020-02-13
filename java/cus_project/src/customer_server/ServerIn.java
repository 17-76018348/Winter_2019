package customer_server;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.Socket;

import chattingServer.Unit;

public class ServerIn extends Thread {
	private Socket socket;
	private InputStream is;
	private ObjectInputStream ois;

	ServerIn(Socket socket) {
		this.socket = socket;
	}

	public void run() {
		super.run();
		try {
			is = this.socket.getInputStream();
			ois = new ObjectInputStream(is);
			Info info = (Info) ois.readObject();

			is.close();
			ois.close();
			this.socket.close();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
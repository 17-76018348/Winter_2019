package customer_server;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ServerOut extends Thread {
	private Socket socket;
	private Info info;

	ServerOut(Socket socket, Info info) {
		this.socket = socket;
		this.info = info;
	}

	public void run() {
		super.run();
		try {
			OutputStream os = socket.getOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(os);
			oos.writeObject(info);

			oos.close();
			os.close();
			this.socket.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

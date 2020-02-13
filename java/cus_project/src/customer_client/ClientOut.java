package customer_client;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;



public class ClientOut {
	private Socket socket;
	ClientIn clieIn;

	ClientOut(Socket socket) {
		this.socket = socket;
		clieIn = new ClientIn(socket);
	}

	public void send(Info info) {
		try {
			OutputStream os = socket.getOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(os);
			oos.writeObject(info);
			System.out.println("송신 완료");
			oos.close();
			os.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

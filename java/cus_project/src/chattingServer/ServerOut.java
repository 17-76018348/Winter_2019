package chattingServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class ServerOut extends Thread {
	private Socket socket;
	private ObjectInputStream ois;
	private ObjectOutputStream oos;
	ServerOut(Socket socket) {
		this.socket = socket;
	}

	public void run() { 
		super.run();
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter writer = new PrintWriter(socket.getOutputStream());
			String sendString;

			while (true) {

				sendString = reader.readLine();
				writer.println(sendString);
				writer.flush();

			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

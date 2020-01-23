package chattingClient;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

import chattingServer.Constants;

public class ClientIn extends Thread implements Constants{
	private Socket socket;

	ClientIn(Socket socket) {
		this.socket = socket;
	}

	public void run() {
		super.run();
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String receiveString;

			while (true) {
				
				receiveString = reader.readLine();
				System.out.println(SERVERNAME + receiveString);
			}
		} catch (IOException e) {
		}
	}
}

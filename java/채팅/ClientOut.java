package chatting_Client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientOut extends Thread {
	private Socket socket;

	ClientOut(Socket socket) {
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

					if (sendString.equals("exit"))
						break;

					writer.println(sendString);
					writer.flush();
				}
			
			writer.close();
			reader.close();
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

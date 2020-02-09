package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ServerReceive extends Thread {
	private Socket socket;
	ServerReceive(Socket socket){
		this.socket = socket;
	}
	public void run() {
		super.run();
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

			String receiveString;

			while (true) {
				receiveString = reader.readLine();

				if (receiveString == null) {
					System.out.println("���� ����");
					break;
				} else {
					System.out.println("Ŭ���̾�Ʈ:" + receiveString);
				}
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

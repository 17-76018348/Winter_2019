package chattingServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.net.Socket;

public class ServerIn extends Thread implements Constants {
	private Socket socket;
	private InputStream is;
	private ObjectInputStream ois;
	
	public ServerIn(Socket socket) {
		this.socket = socket;
	}

	public void run() {
		super.run();
		try {
			is = this.socket.getInputStream();
			ois = new ObjectInputStream(is);
			Unit unit = (Unit)ois.readObject();
			System.out.println(unit.getCode());
			System.out.println(unit.getPassword());
			System.out.println(unit.getSize());
			is.close();
			ois.close();
			this.socket.close();
			
//			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//			String receiveString;
//
//			while (true) {
//
//				receiveString = reader.readLine();
//
//				if (receiveString == null) {
//					System.out.println(CONNECTFAIL);
//					break;
//				} else {
//					System.out.println(CLIENTNAME + receiveString);
//				}
//
//			}
//			reader.close();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}

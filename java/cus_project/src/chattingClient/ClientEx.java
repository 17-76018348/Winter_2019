package chattingClient;


import java.io.IOException;
import java.net.Socket;
import chattingServer.Unit;

public class ClientEx {
	public static void main(String[] args) {
		try {
			Socket socket = new Socket("DESKTOP-R784730", 6670);
			Unit unit = new Unit();
			unit.setCode(0);
			unit.setPassword("111");
			unit.setSize(3);
//			ClientIn inThread = new ClientIn(socket);
			ClientOut outThread = new ClientOut(socket,unit);

//			inThread.start();
			outThread.start();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

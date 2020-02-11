package chattingClient;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import chattingServer.Unit;
import chattingServer.Constants;
public class ClientOut extends Thread implements Constants{
	private Socket socket;
	private Unit unit;
	ClientOut(Socket socket, Unit unit) {
		this.socket = socket;
		this.unit = unit;
	}

	public void run() {
		super.run();
		try {
			OutputStream os = socket.getOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(os);
			oos.writeObject(unit);
			
			oos.close();
			os.close();
			this.socket.close();
			
//			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//			PrintWriter writer = new PrintWriter(socket.getOutputStream());
//			String sendString;
//			while (true) {
//				sendString = reader.readLine();
//				if (sendString.equals(EXIT))
//					break;
//				writer.println(sendString);
//				writer.flush();
//			}
//			writer.close();
//			reader.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

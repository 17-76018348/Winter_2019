package customer_server;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ServerIn extends Thread {
	private Socket socket;
	private InputStream is;
	private ObjectInputStream ois;
	SimpleDateFormat format1 = new SimpleDateFormat ( "yyyy-MM-dd HH:mm:ss");
	Date time;
	ServerIn(Socket socket) {
		this.socket = socket;
	}

	public void run() {
		super.run();
		try {
			is = this.socket.getInputStream();
			ois = new ObjectInputStream(is);
			while(true) {
				Info info = (Info) ois.readObject();
				time = new Date();
				String curTime = format1.format(time);
				System.out.println(curTime);
				MailBoxSer.keep(info);
				System.out.println("수신 완료");
			}
			
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}

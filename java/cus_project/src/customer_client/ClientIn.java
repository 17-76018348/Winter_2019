package customer_client;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

import customer_server.Info;

public class ClientIn extends Thread{
	private Socket socket;
	private InputStream is;
	private ObjectInputStream ois;
	SimpleDateFormat format1 = new SimpleDateFormat ( "yyyy-MM-dd HH:mm:ss");
	Date time;
	ClientIn(Socket socket) {
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
				String time1 = format1.format(time);
				MailBoxCli.keep(info);
				System.out.println(time1);
				System.out.println("수신 완료");
			}
			
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}

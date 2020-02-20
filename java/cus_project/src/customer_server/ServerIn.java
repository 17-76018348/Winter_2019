package customer_server;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ServerIn extends Thread implements Constants{
	private Socket socket;
	private InputStream is;
	private ObjectInputStream ois;
	SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	Date time;
	ServerOut sevOut;
	Operation oper;
	ServerIn(Socket socket) {
		this.socket = socket;
		sevOut = new ServerOut(this.socket);
	}

	public void run() {
		super.run();
		try {
			is = this.socket.getInputStream();
			ois = new ObjectInputStream(is);
			while (true) {
				Info info = (Info) ois.readObject();
				time = new Date();
				String curTime = format1.format(time);
				System.out.println(curTime);
				MailBoxSer.keep(info);
				
				sevOut.send(MailBoxSer.read());
				System.out.println("수신 완료");
			}
			
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	private void process() {
		int mode =  MailBoxSer.read().getMenu();
		if (mode == PRINT_ALL)
			oper.printAll();
		else if (mode == SIGN_UP)
			oper.signUp();
		else if (mode == SET_INFO)
			oper.setInfo();
		else if (mode == GET_POINT)
			oper.getPoint();
		else if (mode == SET_POINT)
			oper.setInfo();
	}
}

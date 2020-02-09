package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientReceive extends Thread {
	private Socket socket;
	
	ClientReceive(Socket socket){
		this.socket = socket;
	}
	public void run() {
		super.run();
		
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String receiveString;
			
			while(true)
			{
				receiveString = reader.readLine();
				
				System.out.println("¼­¹ö:" + receiveString);
			}
		}catch(IOException e) {
			
		}
	}
}

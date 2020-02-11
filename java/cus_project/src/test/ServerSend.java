package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ServerSend extends Thread{
private Socket socket;
	ServerSend(Socket socket){
		this.socket = socket;
	}
	
	public void run() {
		super.run();
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter writer = new PrintWriter(socket.getOutputStream());
			String sendString;
			
			while(true)
			{
				sendString = reader.readLine();
				
				writer.println(sendString);
				writer.flush();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}

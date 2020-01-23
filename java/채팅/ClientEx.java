package chatting_Client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

import chatting_Server.ServerIn;
import chatting_Server.ServerOut;

public class ClientEx {
	public static void main(String[] args) {
		try {
			Socket socket = new Socket("DESKTOP-R784730",5054);
			
			ClientIn in_thread = new ClientIn(socket);
			
			ClientOut out_thread = new ClientOut(socket);
			
			in_thread.start();
			out_thread.start();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}

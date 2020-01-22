package chatting_Server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerEx {
	public static void main(String[] args) {
		try {
			ServerSocket ser_socket = new ServerSocket(9999);
			
			Socket socket = ser_socket.accept();
			ServerIn in_thread = new ServerIn(socket);
			ServerOut out_thread = new ServerOut(socket);
			
			in_thread.start();
			out_thread.start();
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}

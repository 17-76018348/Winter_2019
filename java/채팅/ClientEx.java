package chattingClient;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

import chattingServer.ServerIn;
import chattingServer.ServerOut;

public class ClientEx {
	public static void main(String[] args) {
		try {
			Socket socket = new Socket("DESKTOP-R784730", 5054);

			ClientIn inThread = new ClientIn(socket);

			ClientOut outThread = new ClientOut(socket);

			inThread.start();
			outThread.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

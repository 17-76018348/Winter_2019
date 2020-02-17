package customer_client;

import customer_server.Info;

public class MailBoxCli {
	private static Info info;
	public static boolean isRead;

	MailBoxCli() {
		info = null;
		isRead = false;
	}

	public static Info read() {
		isRead = true;
		return info;
	}

	public static void keep(Info msg) {
		info = msg;
		isRead = false;
	}
}

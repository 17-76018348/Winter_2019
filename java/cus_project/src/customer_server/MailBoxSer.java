package customer_server;

public class MailBoxSer {
	private static Info info;
	public static boolean isRead;

	MailBoxSer() {
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

package test;

import java.net.Socket;
import java.net.UnknownHostException;
import java.io.IOException;
 
public class Client {
    /**
     * @Socket (Shortcut = Shift + F2) :
     * 
     *         <pre>
     *         public Socket(String host, int port) throws UnknownHostException,
     *         IOException
     */
    public static void main(String[] args) {
        try {
            @SuppressWarnings({ "unused", "resource" })
            Socket sk = new Socket("localhost", 5050);
            System.out.println("�� Ŭ���̾�Ʈ, ������ ������ �Ǿ����ϴ�....");
            ClientSend send_thread = new ClientSend(sk);
            ClientReceive rec_thread = new ClientReceive(sk);
            send_thread.start();
            rec_thread.start();
            
        } catch (UnknownHostException e) {        
            e.printStackTrace();
            System.out.println("���� ����, UnknownHostException");
        } catch (IOException e) {        
            e.printStackTrace();
            System.out.println("���� ����, IOException");
        }
    }
}

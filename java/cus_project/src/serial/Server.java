package serial;

import java.io.*;
import java.net.*;
public class Server{
    // public: ������ ��� ����
    // final: ���� ���� �� �� �����ϴ�.
    // static: ��ü�� ������ �ʰ� ����� �� �ֽ��ϴ�., Ŭ���� ����
    // ����� �빮�� ���
    public final static int SERVER_PORT = 4000;
   
    public static void main(String args[]){
        ServerSocket serverSock; // Client�� ������ ��ٸ��� ��Ȱ�� ��
        Socket  sock;            // Client�� ������ �ۼ��� ��Ȱ�� ��
        ObjectInputStream ois;   // Class ��ü�� �о� �� �� �ֽ��ϴ�.
       
        try{
            //���� ���� ����
            serverSock = new ServerSocket(SERVER_PORT); //4000     
            System.out.println("�մ��� �޴� ������ �۵� �Ǿ����ϴ�.");
           
            //���� ��ƾ
            while(true){
                //������ �������°� �Ǹ�, Ŭ���̾�Ʈ�� ������ ��ٸ��ϴ�.
                sock = serverSock.accept();
               
                // Client�κ��� ��ü�� �о���� ��Ȱ�� �ϴ� ��ü�� ����
                ois = new ObjectInputStream(sock.getInputStream());
               
                // ����(Queue)���� ������ ��ü�� �о� �ɴϴ�.
                //            Client --------> Server
                // Client --> Output Queue --> Input Queue --> readObject();
                Unit u = (Unit)ois.readObject();
                   
                System.out.println("�ֹ��� �޴�: " + u.toString());
                   
                sock.close();  // ���� ����
            }
        } catch(IOException e){
            System.err.println(e);
        } catch (ClassNotFoundException e){
            System.err.println(e);
        }      
    }  
}

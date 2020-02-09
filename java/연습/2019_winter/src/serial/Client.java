package serial;

import java.io.*;
import java.net.*;
public class Client {
  public static void main(String[] args) throws IOException {
    try {
        // �Է¹��� �μ��� 2���� �ƴϸ� ���� �߻�
        if (args.length != 2) throw new IllegalArgumentException("������ ���� �ٸ�");
        // Server IP
        String host = args[0]; // ù��° �μ�
        // Server Port, �ܼ�â���� �Էµ� �����ʹ� String������
        // Integer Wrapper Ŭ������ �̿��� ���ڷ� ��ȯ
        int port = Integer.parseInt(args[1]);
       
        System.out.println("�޴��� �ֹ��� ��: " + host + " : " + port);
     
        //������ ���� �õ��� �� �� ������ ���� �۵��ǰ� �־�� �մϴ�.
        Socket s = new Socket(host, port);
    
        //������ ��¿� �̿��� ���ó���� ��ü�� �����մϴ�.
        ObjectOutputStream oos = new ObjectOutputStream(s.getOutputStream());
     

        Unit u = new Unit("�մ���","�����Ȳ�ҵ��� �����, �߾���, �����, ������ġ���");
        //������ �����ϱ����� ���ۿ� ����
        oos.writeObject(u);
       
        //������ ����
        oos.flush();
        s.close();
    }catch (Exception e) {
      System.err.println(e);
      System.err.println("����: java Client <hostname> <port:4000>");
    }
   
    System.out.println("�ֹ��� �Ϸ� �߽��ϴ�.");   
  }
}
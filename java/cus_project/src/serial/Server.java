package serial;

import java.io.*;
import java.net.*;
public class Server{
    // public: 누구나 사용 가능
    // final: 값을 변경 할 수 없습니다.
    // static: 객체를 만들지 않고도 사용할 수 있습니다., 클래스 변수
    // 상수는 대문자 사용
    public final static int SERVER_PORT = 4000;
   
    public static void main(String args[]){
        ServerSocket serverSock; // Client의 접속을 기다리는 역활을 함
        Socket  sock;            // Client와 데이터 송수신 역활을 함
        ObjectInputStream ois;   // Class 객체를 읽어 올 수 있습니다.
       
        try{
            //서버 소켓 생성
            serverSock = new ServerSocket(SERVER_PORT); //4000     
            System.out.println("왕눈이 메뉴 서버가 작동 되었습니다.");
           
            //무한 루틴
            while(true){
                //서버는 정지상태가 되며, 클라이언트의 접속을 기다립니다.
                sock = serverSock.accept();
               
                // Client로부터 객체를 읽어오는 역활을 하는 객체를 생성
                ois = new ObjectInputStream(sock.getInputStream());
               
                // 버퍼(Queue)에서 실제로 객체를 읽어 옵니다.
                //            Client --------> Server
                // Client --> Output Queue --> Input Queue --> readObject();
                Unit u = (Unit)ois.readObject();
                   
                System.out.println("주문된 메뉴: " + u.toString());
                   
                sock.close();  // 접속 종료
            }
        } catch(IOException e){
            System.err.println(e);
        } catch (ClassNotFoundException e){
            System.err.println(e);
        }      
    }  
}

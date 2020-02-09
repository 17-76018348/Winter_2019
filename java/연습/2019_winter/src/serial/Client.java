package serial;

import java.io.*;
import java.net.*;
public class Client {
  public static void main(String[] args) throws IOException {
    try {
        // 입력받은 인수가 2개가 아니면 예외 발생
        if (args.length != 2) throw new IllegalArgumentException("인자의 수가 다름");
        // Server IP
        String host = args[0]; // 첫번째 인수
        // Server Port, 콘솔창에서 입력된 데이터는 String임으로
        // Integer Wrapper 클래스를 이용해 숫자로 변환
        int port = Integer.parseInt(args[1]);
       
        System.out.println("메뉴를 주문할 곳: " + host + " : " + port);
     
        //서버로 접속 시도를 할 때 서버는 먼저 작동되고 있어야 합니다.
        Socket s = new Socket(host, port);
    
        //서버로 출력에 이용할 출력처리용 객체를 생성합니다.
        ObjectOutputStream oos = new ObjectOutputStream(s.getOutputStream());
     

        Unit u = new Unit("왕눈이","얼룩배기황소된장 비빔밥, 추어탕, 삼계탕, 생고기김치찌게");
        //서버로 전송하기위해 버퍼에 저장
        oos.writeObject(u);
       
        //서버로 전송
        oos.flush();
        s.close();
    }catch (Exception e) {
      System.err.println(e);
      System.err.println("사용법: java Client <hostname> <port:4000>");
    }
   
    System.out.println("주문을 완료 했습니다.");   
  }
}
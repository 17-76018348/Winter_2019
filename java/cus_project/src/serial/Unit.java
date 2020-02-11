package serial;

import java.io.*;
public class Unit implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//인스턴스 변수, 멤버 변수
    private String name;  //손님명
    private String food;  //주문 메뉴
   
    //생성자, return type이 없습니다.
    public Unit(String n, String f){
        //heap    = stack
        this.name = n;
        this.food = f;
    }
   
    // 가지고 있는 인스턴스 변수의 값을 출력
    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append("손님명: ");
        sb.append(name);
        sb.append(" : ");
        sb.append(" 주문 메뉴: ");
        sb.append(food);
       
        return sb.toString();
    }
}

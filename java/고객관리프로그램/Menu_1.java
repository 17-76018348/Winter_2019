package homework1;

import java.util.Scanner;
public class Menu_1 extends Menu {

	public Menu_1()
	{
		on();
	}
	@Override
	public void on() {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		String name;
		String gender;
		System.out.println("이름을 입력하시오");
		name = sc.next();
		System.out.println("성별을 입력하세요");
		gender = sc.next();
		Background.cus.add(new Customer(Background.cus_num,name,gender,0));
		System.out.println("당신의 고객번호는 " + Background.cus_num + " 입니다");
		Background.cus_num++;
	}

}

package homework1;

import java.util.Scanner;

public class Menu_3 extends Menu {

	public Menu_3()
	{
		on();
	}
	@Override
	public void on() {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		int id;
		int point;
		Customer customer;
		System.out.println("고객 번호를 입력하시오");
		id = sc.nextInt();
		customer = Background.cus.get(id);
		point = customer.getPoint();
		System.out.println("당신의 포인트는 " + point + " 입니다");
	}

}

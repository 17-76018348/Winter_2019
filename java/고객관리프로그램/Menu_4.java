package homework1;

import java.util.Scanner;

public class Menu_4 extends Menu {

	public Menu_4()
	{
		on();
	}
	@Override
	public void on() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int id;
		int add_point;
		int point;
		Customer customer;
		System.out.println("고객 번호를 입력하시오");
		id = sc.nextInt();
		customer = Background.cus.get(id);
		System.out.println("추가하실 포인트를 입력하세요");
		add_point = sc.nextInt();
		point  = customer.getPoint();
		point += add_point;
		customer.setPoint(point);
		Background.cus.remove(id);
		Background.cus.add(id,customer);
		System.out.println("현재 포인트는 " + point + "입니다");
	}

}

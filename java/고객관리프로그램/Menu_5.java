package homework1;

import java.util.Scanner;

public class Menu_5 extends Menu {

	public Menu_5()
	{
		on();
	}
	@Override
	public void on() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int id;
		Customer customer = new Customer(-1,"","",0);
		System.out.println("고객 번호를 입력하시오");
		id = sc.nextInt();
		Background.cus.remove(id);
		Background.cus.add(id, customer);
		System.out.println("삭제 완료");
	}

}

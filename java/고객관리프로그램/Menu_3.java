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
		System.out.println("�� ��ȣ�� �Է��Ͻÿ�");
		id = sc.nextInt();
		customer = Background.cus.get(id);
		point = customer.getPoint();
		System.out.println("����� ����Ʈ�� " + point + " �Դϴ�");
	}

}

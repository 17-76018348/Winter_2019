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
		System.out.println("�� ��ȣ�� �Է��Ͻÿ�");
		id = sc.nextInt();
		customer = Background.cus.get(id);
		System.out.println("�߰��Ͻ� ����Ʈ�� �Է��ϼ���");
		add_point = sc.nextInt();
		point  = customer.getPoint();
		point += add_point;
		customer.setPoint(point);
		Background.cus.remove(id);
		Background.cus.add(id,customer);
		System.out.println("���� ����Ʈ�� " + point + "�Դϴ�");
	}

}

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
		System.out.println("�� ��ȣ�� �Է��Ͻÿ�");
		id = sc.nextInt();
		Background.cus.remove(id);
		Background.cus.add(id, customer);
		System.out.println("���� �Ϸ�");
	}

}

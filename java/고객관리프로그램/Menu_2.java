package homework1;

import java.util.Scanner;

public class Menu_2 extends Menu {

	public Menu_2()
	{
		on();
	}
	@Override
	public void on() {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		int num;
		int id;
		String name;
		String gender;
		Customer customer;
		System.out.println("�� ��ȣ�� �Է��Ͻÿ�");
		id = sc.nextInt();
		System.out.println("�����ϰ���� �׸��� ���ÿ�");
		System.out.println("1.�̸�");
		System.out.println("2.����");
		num = sc.nextInt();
		if(num == 1)
		{
			System.out.println("�����ϰ� ���� �̸��� �Է��Ͻÿ�");
			name = sc.next();
			customer = Background.cus.get(id);
			customer.setName(name);
			Background.cus.remove(id);
			Background.cus.add(id, customer);
			System.out.println("���� �Ϸ�");
		}
		else if(num == 2)
		{
			System.out.println("�����ϰ� ���� ������ �Է��Ͻÿ�");
			gender = sc.next();
			customer = Background.cus.get(id);
			customer.setGender(gender);
			Background.cus.remove(id);
			Background.cus.add(id, customer);
			System.out.println("���� �Ϸ�");
		
		}
		else
		{
			System.out.println("�߸� �Է��Ͽ����ϴ�");
		}
		
	}

}

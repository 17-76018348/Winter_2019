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
		System.out.println("�̸��� �Է��Ͻÿ�");
		name = sc.next();
		System.out.println("������ �Է��ϼ���");
		gender = sc.next();
		Background.cus.add(new Customer(Background.cus_num,name,gender,0));
		System.out.println("����� ����ȣ�� " + Background.cus_num + " �Դϴ�");
		Background.cus_num++;
	}

}

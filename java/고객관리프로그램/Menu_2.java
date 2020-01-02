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
		System.out.println("고객 번호를 입력하시오");
		id = sc.nextInt();
		System.out.println("수정하고싶은 항목을 고르시오");
		System.out.println("1.이름");
		System.out.println("2.성별");
		num = sc.nextInt();
		if(num == 1)
		{
			System.out.println("변경하고 싶은 이름을 입력하시오");
			name = sc.next();
			customer = Background.cus.get(id);
			customer.setName(name);
			Background.cus.remove(id);
			Background.cus.add(id, customer);
			System.out.println("변경 완료");
		}
		else if(num == 2)
		{
			System.out.println("변경하고 싶은 성별을 입력하시오");
			gender = sc.next();
			customer = Background.cus.get(id);
			customer.setGender(gender);
			Background.cus.remove(id);
			Background.cus.add(id, customer);
			System.out.println("변경 완료");
		
		}
		else
		{
			System.out.println("잘못 입력하였습니다");
		}
		
	}

}

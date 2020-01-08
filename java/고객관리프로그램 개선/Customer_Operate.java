package homework1;

import java.util.HashMap;
import java.util.Scanner;

public class Customer_Operate implements Constants{
	private HashMap<Integer,Customer> customers;
	Scanner sc;
	int id;
	int password;
	Customer_Operate(HashMap<Integer,Customer> customers)
	{
		this.customers = customers;
		sc = new Scanner(System.in);
	}
	// 로그인
	public void login()
	{
		sc = new Scanner(System.in);

		
		do
		{
			System.out.println(ENTER_PHONENUM);
			id = sc.nextInt();
		}while(customers.containsKey(id) == false);
		do
		{
			System.out.println(ENTER_PASSWORD);
			password = sc.nextInt();
		}while(password != customers.get(id).getPassword());
		System.out.println(LOGIN_SUCCESS);
		
	}
	// 0번 고객목록 출력
	public void showCustomers()
	{
		if(customers.size() == 0)
			System.out.println(NO_MORE_CUSTOMERS);
		else
		{
			for(Customer customer : this.customers.values())
			{
				System.out.println(customer.getName() + "\n" + customer.getGender() + "\n" + customer.getPoint());
			}
		}
	}
	// 1번 신규가입 
	public void signUpCustomer()
	{
		Customer customer = new Customer();
		int input_int;
		
		System.out.println(ENTER_PHONENUM);
		input_int = sc.nextInt();
		System.out.println(ENTER_NAME);
		customer.setName(sc.next());
		System.out.println(ENTER_GENDER);
		customer.setGender(sc.next());
		System.out.println(ENTER_PASSWORD);
		customer.setPassword(sc.nextInt());
		customers.put(input_int, customer);
		System.out.println(COMPLETE);
	}
	// 2번 고객 정보 수정
	public void changeInfo()
	{
		System.out.println(ENTER_NAME);
		customers.get(id).setName(sc.next());
		System.out.println(ENTER_GENDER);
		customers.get(id).setGender(sc.next());
		System.out.println(ENTER_PASSWORD);
		customers.get(id).setPassword(sc.nextInt());
	}
	// 3번 포인트 조회
	public void checkPoint()
	{
		System.out.println("고객님의 포인트는:  "+customers.get(id).getPoint());
	}
	// 4번 포인트 설정
	public void setPoint()
	{
		System.out.println(ENTER_POINT);
		customers.get(id).setPoint(sc.nextInt());
		System.out.println("고객님의 포인트는:  "+customers.get(id).getPoint());
	}
	// 5번 고객 삭제
	public void rmCustomer()
	{
		customers.remove(id);
		System.out.println(REMOVE_COMPLETE);
	}
	public void powerOff()
	{
		System.exit(0);
	}
}

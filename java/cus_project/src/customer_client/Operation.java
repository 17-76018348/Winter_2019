package customer_client;

import java.util.Scanner;

public class Operation implements Constants{

	private Info info;
	Scanner sc;
	private Customer customer;
	ClientOut clieOut;
	Operation() {
		this.sc = new Scanner(System.in);
		CommuClient commu = new CommuClient();
		clieOut = new ClientOut(commu.getSocket());
	}

	//  Menu 0
	public void printAll() {
		info = new Info();
		info.setMenu(PRINT_ALL);
		clieOut.send(info);
		//���� 
	}
	//  Menu 1
	public void signUp() {
		info = new Info();
		info.setMenu(SIGN_UP);
		customer = new Customer();
		System.out.println(ENTER_PHONENUM);
		customer.setPhoneNum(sc.nextInt());
		System.out.println(ENTER_NAME);
		customer.setName(sc.next());
		System.out.println(ENTER_GENDER);
		customer.setGender(sc.next());
		System.out.println(ENTER_PASSWORD);
		customer.setPassword(sc.nextInt());
		info.setCustomer(customer);
		System.out.println(COMPLETE);
		clieOut.send(info);
	}
	//  Menu 2
	public void setInfo() {
		info = new Info();
		customer = new Customer();
		info.setMenu(SET_INFO);
		System.out.println(ENTER_PHONENUM);
		customer.setPhoneNum(sc.nextInt());
		System.out.println(ENTER_PASSWORD);
		customer.setPassword(sc.nextInt());
		System.out.println(ENTER_NAME);
		customer.setName(sc.next());
		System.out.println(ENTER_GENDER);
		customer.setGender(sc.next());
		System.out.println(ENTER_NAME);
		customer.setPassword(sc.nextInt());
		info.setCustomer(customer);
		clieOut.send(info);
	}
	//  Menu 3
	public void getPoint() {
		info = new Info();
		info.setMenu(GET_POINT);
		customer = new Customer();
		System.out.println(ENTER_PHONENUM);
		customer.setPhoneNum(sc.nextInt());
		System.out.println(ENTER_PASSWORD);
		customer.setPassword(sc.nextInt());
		info.setCustomer(customer);
		clieOut.send(info);
		//����
		System.out.println(info.getCustomer().getPoint());
	}
	//  Menu 4
	public void setPoint() {
		System.out.println("��ĭ�� ���� ���� �������� �ϴ°� �ִµ� �װ� ���� �װ� ����Ʈ�� �˴ϴ� ��� ������ �ϳ�");
		
	}
	//  Menu 5
	public void rmCustomer() {
		info = new Info();
		info.setMenu(RM_CUSTOMER);
		System.out.println(ENTER_PHONENUM);
		customer.setPhoneNum(sc.nextInt());
		System.out.println(ENTER_PASSWORD);
		customer.setPassword(sc.nextInt());
		info.setCustomer(customer);
		clieOut.send(info);
	}
	

}

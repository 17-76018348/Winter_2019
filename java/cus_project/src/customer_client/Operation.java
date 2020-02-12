package customer_client;

import java.util.Scanner;

public class Operation implements Constants{

	private Info info;
	Scanner sc;
//	private HashMap<Integer, Customer> customers;
	private Customer customer;
	Operation() {
		this.sc = new Scanner(System.in);

	}

	//  Menu 0
	public void printAll() {
		info = new Info();
		info.setMenu(PRINT_ALL);
		//통신
		//전부 출력
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
		//통신
	}
	//  Menu 2
	public void setInfo() {
		info = new Info();
		int phoneNum;
		int passWord;
		customer = new Customer();
		info.setMenu(SET_INFO);
		System.out.println(ENTER_PHONENUM);
		customer.setPhoneNum(sc.nextInt());
		System.out.println(ENTER_PASSWORD);
		customer.setPassword(sc.nextInt());
		//통신
		customer = info.getCustomer();
		System.out.println(ENTER_NAME);
		customer.setName(sc.next());
		System.out.println(ENTER_GENDER);
		customer.setGender(sc.next());
		System.out.println(ENTER_NAME);
		customer.setPassword(sc.nextInt());
		//통신
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
		//통신
		System.out.println(info.getCustomer().getPoint());
	}
	//  Menu 4
	public void setPoint() {
		info = new Info();
		info.setMenu(SET_POINT);
		customer = new Customer();
		System.out.println(ENTER_PHONENUM);
		customer.setPhoneNum(sc.nextInt());
		System.out.println(ENTER_PASSWORD);
		customer.setPassword(sc.nextInt());
		System.out.println(CHANGE_POINT);
		//통신
		
	}
	//  Menu 5
	public void rmCustomer() {
		info = new Info();
		info.setMenu(RM_CUSTOMER);
		System.out.println(ENTER_PHONENUM);
		customer.setPhoneNum(sc.nextInt());
		System.out.println(ENTER_PASSWORD);
		customer.setPassword(sc.nextInt());
		//통신
	}
	

}

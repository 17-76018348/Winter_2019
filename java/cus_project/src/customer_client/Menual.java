package customer_client;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Scanner;

public class Menual implements Constants{
	private String url;
	private String username;
	private String password;
	private String hashType;
	private String query;
	private Statement stmt;
	private Connection conn;
	private Info info;
	Scanner sc;
	private HashMap<Integer, Customer> customers;
	private Customer customer;
	Menual() {
		this.sc = new Scanner(System.in);
		this.url = "jdbc:oracle:thin:@DESKTOP-R784730:1521:orcl";
		this.username = null;
		this.password = null;
		this.conn = null;
		this.hashType = "SHA-256";
		this.query = null;
		this.stmt = null;
		this.sc = new Scanner(System.in);
	}
	public boolean connect() {
		System.out.print(DB_ID_LOGIN);
		this.username = sc.next();
		System.out.print(DB_PW_LOGIN);
		this.password = sc.next();

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(this.url, this.username, this.password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if (conn == null) {
			System.out.println(DB_CONNECT);
			return false;
		} else {
			System.out.println(DB_NOT_CONNECT);
			return true;
		}
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

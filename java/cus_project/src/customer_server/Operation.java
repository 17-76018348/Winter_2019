package customer_server;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import homework1.Customer;


public class Operation implements Constants{
	
	private String url;
	private String username;
	private String password;
	private String hashType;
	private String query;
	private Statement stmt;
	private Connection conn;
	Scanner sc;
	
	
	Operation(){
		this.sc = new Scanner(System.in);
		this.url = "jdbc:oracle:thin:@DESKTOP-R784730:1521:orcl";
		this.username = null;
		this.password = null;
		this.conn = null;
		this.hashType = "SHA-256";
		this.query = null;
		this.stmt = null;
	}
	
	public boolean connect() {
		System.out.print(DB_LOG_ID);
		this.username = sc.next();
		System.out.print(DB_LOG_PW);
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
			System.out.println(CONN_FAL);
			return false;
		} else {
			System.out.println(CONN_TRU);
			return true;
		}
	}
	public void printAll() {
		String msg[] = null;
		int idx = 0;
		this.query = "SELECT * FROM " + CUSTOMER_TABLE_NAME;
		try {
			this.stmt = this.conn.createStatement();
			ResultSet rs = this.stmt.executeQuery(this.query);
			while (rs.next()) {
				msg[idx] += rs.getString(CUSTOMER_TABLE_ATTRS[0]) + TAP + rs.getString(CUSTOMER_TABLE_ATTRS[1])
				+ TAP + rs.getString(CUSTOMER_TABLE_ATTRS[2]) + TAP + rs.getString(CUSTOMER_TABLE_ATTRS[3]);
				idx++;
			}
			//통신
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void signUp() {
		//통신
		Customer cus = new Customer();
		//Customer customer = info.getcustomer;
//		cus.setPhoneNum();
//		cus.setName();
//		cus.setGender();
//		cus.setPassword();
//		cus.setPoint();
//		register2DP(cus);
		
	}
	
	public void setInfo() {
		//통신
		//
		String target = null; //통신
		String targetValue = null;  // 통신
		String phoneNum = null;
		try {
			this.stmt = this.conn.createStatement();
			if (target.equalsIgnoreCase("POINT_"))
				this.query = "UPDATE " + CUSTOMER_TABLE_NAME + " SET " + target + " = " + targetValue + " WHERE CUSTOMER_NO = '"
						+ phoneNum + "'";
			else
				this.query = "UPDATE " + CUSTOMER_TABLE_NAME + " SET " + target + " = '" + targetValue + "' WHERE CUSTOMER_NO = '"
						+ phoneNum + "'";
			this.stmt.executeUpdate(this.query);
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
	
	public void getPoint() {
		//통신
		String phoneNum = null;
		this.query = "SELECT PHONE_NUM, POINT_, CUSTOMER_NAME FROM " + CUSTOMER_TABLE_NAME;
		try {
			this.stmt = this.conn.createStatement();
			ResultSet rs = this.stmt.executeQuery(this.query);
			while (rs.next()) {
				if (rs.getString("PHONE_NUM").equals(phoneNum))
					System.out.println("1");
					//통신 rs.getString(point) 보냄
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	public void rmCustomer() {
		//통신
		String phoneNum = null;
		this.query = "DELETE "+CUSTOMER_TABLE_NAME+" WHERE PHONE_NUM = '" + phoneNum + "'";
		try {
			this.stmt = this.conn.createStatement();
			this.stmt.executeUpdate(this.query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private String getHashValue(String string, String hashType) throws NoSuchAlgorithmException {
		MessageDigest md;
		md = MessageDigest.getInstance(hashType);
		byte[] hashByte = md.digest(string.getBytes());
		StringBuffer buf = new StringBuffer();
		for (byte b : hashByte)
			buf.append(Integer.toString((b & 0xff) + 0x100, 16).substring(1));
		return buf.toString();
	}
	private void register2DB(Customer cus) {
		this.query = "INSERT INTO " + CUSTOMER_TABLE_NAME + " VALUES";
		try {
			this.stmt = this.conn.createStatement();
			this.query += SQL_OPEN + cus.getPhoneNum() + SQL_COMMA + cus.getName() + SQL_COMMA
					+ cus.getPassword() + SQL_COMMA + cus.getGender() + "',"
					+ cus.getPoint() + SQL_INT_CLOSE;
			this.stmt.executeUpdate(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	
	
}

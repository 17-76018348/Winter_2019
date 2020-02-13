package customer_server;

import java.util.HashMap;

import customer_client.Customer;

public class Info {
	private int menu;
	HashMap<Integer, Customer> customers;
	private Customer customer;
	private String result;
	
	Info(){
		menu = -1;
		customers = null;
		result = null;
		customer = null;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public int getMenu() {
		return menu;
	}
	public void setMenu(int menu) {
		this.menu = menu;
	}
	public HashMap<Integer, Customer> getCustomers() {
		return customers;
	}
	public void setCustomers(HashMap<Integer, Customer> customers) {
		this.customers = customers;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	
}

package customer_client;

import java.io.Serializable;
import java.util.HashMap;

public class Info implements Serializable{
	private int menu;
	HashMap<Integer, Customer> customers;
	private Customer customer;
	private String target;

	Info() {
		menu = -1;
		customers = null;
		target = null;
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

	public String gettarget() {
		return target;
	}

	public void settarget(String target) {
		this.target = target;
	}

}

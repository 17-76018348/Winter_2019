package homework1;

import java.io.IOException;

public abstract class Menu {
	
	int id;
	int num;
	String name;
	String gender;
	Customer customer;
	
	public abstract void on() throws IOException;
	
}

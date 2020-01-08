package homework1;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class 
Main implements Constants{

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		HashMap<Integer,Customer> customers = new HashMap<>();
		Customer_Operate operate = new Customer_Operate(customers);
		int mode = -1;
		while(true)
		{
		System.out.println("Menu");
		do
		{
			for(String menu : MENU)
			{
				System.out.println(menu);
			}
			mode = sc.nextInt();
		}while(mode<0 || mode > MENU_NUM-1);
		if(mode == PRINT_ALL)
			operate.showCustomers();
		else if(mode == SIGN_UP)
			operate.signUpCustomer();
		else if(mode == SET_INFO)
		{
			operate.login();
			operate.changeInfo();
		}
		else if(mode == GET_POINT)
		{
			operate.login();
			operate.checkPoint();
		}
		else if(mode == SET_POINT)
		{
			operate.login();
			operate.setPoint();
		}
		else if(mode == RM_CUSTOMER)
		{
			operate.login();
			operate.rmCustomer();
		}
		else if(mode == EXIT)
		{
			operate.powerOff();
		}
		}
		
			
		
		
		

		
		
		
	}

}

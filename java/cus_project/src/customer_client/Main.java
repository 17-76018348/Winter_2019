package customer_client;

import java.util.Scanner;

public class Main implements Constants{

	public static void main(String[] args){
		// TODO Auto-generated method stub
		int mode = 0;
		Scanner sc = new Scanner(System.in);
		Menual menual  = new Menual();
		System.out.println(TITLE);
		
		while(true) {
			
			do {
				for(String menu: MENU)
					System.out.println(menu);
				mode = sc.nextInt();
			} while(mode < 0 || mode > MENU_NUM - 2);
			
			if (mode == PRINT_ALL) menual.printAll();
			else if (mode == SIGN_UP) menual.signUp();
			else if (mode == SET_INFO) menual.setInfo();
			else if (mode == GET_POINT) menual.getPoint();
			else if (mode == SET_POINT) menual.setInfo();
			else if (mode == EXIT) break;
			
			
			
			
		}
	}

}

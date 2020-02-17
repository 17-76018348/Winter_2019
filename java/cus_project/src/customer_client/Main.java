package customer_client;

import java.util.Scanner;

public class Main implements Constants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mode = 0;
		Scanner sc = new Scanner(System.in);
		Operation oper = new Operation();
		System.out.println(TITLE);

		while (true) {

			do {
				for (String menu : MENU)
					System.out.println(menu);
				mode = sc.nextInt();
			} while (mode < 0 || mode > MENU_NUM - 2);

			if (mode == PRINT_ALL)
				oper.printAll();
			else if (mode == SIGN_UP)
				oper.signUp();
			else if (mode == SET_INFO)
				oper.setInfo();
			else if (mode == GET_POINT)
				oper.getPoint();
			else if (mode == SET_POINT)
				oper.setInfo();
			else if (mode == EXIT)
				break;

		}
	}

}

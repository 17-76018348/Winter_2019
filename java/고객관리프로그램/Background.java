package homework1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Background {
	public static ArrayList<Customer> cus = new ArrayList<>();
	public static int cus_num = 0;
	
	public void menu() throws IOException {
		int num = -1;
		Scanner sc = new Scanner(System.in);
		while (num != 6) {
			System.out.println("0.�� ��� ���");
			System.out.println("1.�ű԰���");
			System.out.println("2.���� �� ���� ����");
			System.out.println("3.����ȣ�� ����Ʈ ��ȸ");
			System.out.println("4.�� ��ȣ�� ����Ʈ ����");
			System.out.println("5.�� ��ȣ�� �� ����");
			System.out.println("6.���α׷� ����");
			num = sc.nextInt();
			if (num == 0) {
				Menu a = new Menu_0();
			} else if (num == 1) {
				Menu a = new Menu_1();
			} else if (num == 2) {
				Menu a = new Menu_2();
			} else if (num == 3) {
				Menu a = new Menu_3();
			} else if (num == 4) {
				Menu a = new Menu_4();
			} else if (num == 5) {
				Menu a = new Menu_5();
			} else if (num == 6) {
				Menu a = new Menu_6();
			} else {
				System.out.println("�ٽ� �Է��ϼ���");
			}
		}
		sc.close();
	}

}

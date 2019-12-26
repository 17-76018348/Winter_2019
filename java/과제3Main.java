package first;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	int a , b;
	String c;
	Scanner scan = new Scanner(System.in);
	System.out.println("두 정수와 연산자를 입력하시오");
	a = scan.nextInt();
	b = scan.nextInt();
	c = scan.next();
	if(c.equals("+"))
	{
		first.Add add = new Add();
		add.setValue(a, b);
		System.out.println(add.calculate());
	}
	else if(c.equals("-"))
	{
		first.Sub sub = new Sub();
		sub.setValue(a, b);
		System.out.println(sub.calculate());
	}
	else if(c.equals("*"))
	{
		first.Mul mul = new Mul();
		mul.setValue(a, b);
		System.out.println(mul.calculate());
	}
	else if(c.equals("/"))
	{
		first.Div div = new Div();
		div.setValue(a, b);
		System.out.println(div.calculate());
	}
	scan.close();
	}

}

package homework1;

public class Menu_0 extends Menu {
	public Menu_0()
	{
		on();
	}
	@Override
	public void on() {
		// TODO Auto-generated method stub
		for(int i = 0;i<Background.cus.size();i++)
		{
			Customer customer = Background.cus.get(i);
			System.out.print("고객번호:"+customer.getId()+"  ");
			System.out.print("고객이름:"+customer.getName()+"  ");
			System.out.print("성별:"+customer.getGender()+"  ");
			System.out.println("포인트:"+customer.getPoint()+"  ");
		}
	}

}

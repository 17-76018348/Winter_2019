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
			System.out.print("����ȣ:"+customer.getId()+"  ");
			System.out.print("���̸�:"+customer.getName()+"  ");
			System.out.print("����:"+customer.getGender()+"  ");
			System.out.println("����Ʈ:"+customer.getPoint()+"  ");
		}
	}

}

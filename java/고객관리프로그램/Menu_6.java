package homework1;

import java.io.IOException;

public class Menu_6 extends Menu {

	public Menu_6() throws IOException
	{
		on();
	}
	@Override
	public void on() throws IOException {
		// TODO Auto-generated method stub
		System.out.println("���α׷��� �����մϴ�");
		File file = new File();
		file.writeid();
		file.writegender();
		file.writename();
		file.writepoint();
		System.exit(0);
	}

}

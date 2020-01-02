package homework1;
import java.io.IOException;
import java.io.PrintWriter;

public class File {
	public void writeid() throws IOException
	{
		Customer customer;
		PrintWriter pw = new PrintWriter("./customer_id.txt");
		for(int i = 0;i<Background.cus.size();i++)
		{
			customer = Background.cus.get(i);
			pw.println(customer.getId());
		}
		pw.close();
	}
	public void writename() throws IOException
	{
		Customer customer;
		PrintWriter pw = new PrintWriter("./customer_name.txt");
		for(int i = 0;i<Background.cus.size();i++)
		{
			customer = Background.cus.get(i);
			pw.println(customer.getName());
		}
		pw.close();
	}
	public void writegender() throws IOException
	{
		Customer customer;
		PrintWriter pw = new PrintWriter("./customer_gender.txt");
		for(int i = 0;i<Background.cus.size();i++)
		{
			customer = Background.cus.get(i);
			pw.println(customer.getGender());
		}
		pw.close();
	}
	public void writepoint() throws IOException
	{
		Customer customer;
		PrintWriter pw = new PrintWriter("./customer_point.txt");
		for(int i = 0;i<Background.cus.size();i++)
		{
			customer = Background.cus.get(i);
			pw.println(customer.getPoint());
		}
		pw.close();
	}
}

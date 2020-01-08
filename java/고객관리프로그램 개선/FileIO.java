package homework1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

public class FileIO {
	private HashMap<Integer, Customer> customers;
	String line = null;
	Customer customer;

	FileIO(HashMap<Integer, Customer> customers) {
		this.customers = customers;
	}

	public void fileWrite() throws IOException {

		PrintWriter pw = new PrintWriter("./customerinfo.txt");
		for (int key : this.customers.keySet()) {
			line = Integer.toString(key);
			line += ",";
			line += customers.get(key).getName();
			line += ",";
			line += customers.get(key).getGender();
			line += ",";
			line += customers.get(key).getPassword();
			line += ",";
			line += customers.get(key).getPoint();
			pw.println(line);
		}
		pw.close();
	}

	public void fileRead() throws IOException {
		try {
			File file = new File("./customerinfo.txt");
			FileReader filereader = new FileReader(file);
			BufferedReader bufReader = new BufferedReader(filereader);
			String info[] = new String[5];
			while ((line = bufReader.readLine()) != null) {
				customer = new Customer();
				info = line.split(",");
				customer.setName(info[1]);
				customer.setGender(info[2]);
				customer.setPassword(Integer.parseInt(info[3]));
				customer.setPoint(Integer.parseInt(info[4]));
				customers.put(Integer.parseInt(info[0]), customer);

			}
		} catch (FileNotFoundException e) {

		}
	}

}

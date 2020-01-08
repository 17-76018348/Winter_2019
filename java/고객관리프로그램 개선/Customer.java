package homework1;

public class Customer {
	private String name;
	private String gender;
	private int point;
	private int password;

	public Customer() {
		this.name = null;
		this.gender = null;
		this.point = 0;
		this.password = -9999;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

}

package entity;

public class Customer {
	private int cus_id;
	private String cus_name;
	private int age;
	private long phone;
	private double Amount;
	private Address address;

	public Customer(int cus_id, String cus_name, int age, long phone,Address address) {

		this.cus_id = cus_id;
		this.cus_name = cus_name;
		this.age = age;
		this.phone = phone;
		this.address = address;
	}

	public int getCus_id() {
		return cus_id;
	}

	public void setCus_id(int cus_id) {
		this.cus_id = cus_id;
	}

	public String getCus_name() {
		return cus_name;
	}

	public void setCus_name(String cus_name) {
		this.cus_name = cus_name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public double getAmount() {
		return Amount;
	}

	public void setAmount(double amount) {
		Amount = amount;
	}

	@Override
	public String toString() {
		return "Customer [cus_id=" + cus_id + ", cus_name=" + cus_name + ", age=" + age + ", phone=" + phone
				+ ", address=" + address + "]";
	}

}

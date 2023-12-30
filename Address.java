package entity;

public class Address {

	private String door_no;
	private String street;
	private String dist;
	private String state;
	private String country;
	private long pin_code;

	public Address(String door_no, String street, String dist, String state, String country, long pin_code) {
		this.door_no = door_no;
		this.street = street;
		this.dist = dist;
		this.state = state;
		this.country = country;
		this.pin_code = pin_code;
	}

	public String getDoor_no() {
		return door_no;
	}

	public void setDoor_no(String door_no) {
		this.door_no = door_no;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getDist() {
		return dist;
	}

	public void setDist(String dist) {
		this.dist = dist;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public long getPin_code() {
		return pin_code;
	}

	public void setPin_code(long pin_code) {
		this.pin_code = pin_code;
	}

	@Override
	public String toString() {
		return "Address [door_no=" + door_no + ", street=" + street + ", dist=" + dist + ", state=" + state
				+ ", country=" + country + ", pin_code=" + pin_code + "]";
	}


}

package model;

import hibernate.Address;
import hibernate.Vendors;

public class VendorRegistrationDetails 
{	
	private String name;
	
	private String country;
	
	private String state;
	
	private String city;
	
	private int pincode;
	
	private String landmark;
	
	private String street;
	
	private String address1;
	
	private String address2;
	
	private long mobile_no;
	
	private String email;
	
	private String password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public long getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(long mobile_no) {
		this.mobile_no = mobile_no;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public Vendors toDealers()
	{
		Vendors d = new Vendors();
		Address add = new Address();
		d.setName(name);
		add.setAddress(address1);
		add.setCity(city);
		add.setCountry(country);
		add.setPincode(""+pincode);
		add.setState(state);
		d.setAddress(add);
		return d;
	}

	@Override
	public String toString() {
		return "DealerRegistrationDetails [name=" + name + ", country=" + country + ", state=" + state + ", city="
				+ city + ", pincode=" + pincode + ", landmark=" + landmark + ", street=" + street + ", address1="
				+ address1 + ", address2=" + address2 + ", mobile_no=" + mobile_no + "]";
	}
	
	
	
}

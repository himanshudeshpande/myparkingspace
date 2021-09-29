package hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

public class Address 
{
	@Column(nullable=false)
	private String country;
	
	@Column(nullable=false)
	private String state;
	
	@Column(nullable=false)
	private String city;
	
	@Column(nullable=false)
	private String address;
	
	@Column(nullable=false)
	private String pincode;

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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [country=" + country + ", state=" + state + ", city=" + city + ", address=" + address
				+ ", pincode=" + pincode + "]";
	}
	
	
}

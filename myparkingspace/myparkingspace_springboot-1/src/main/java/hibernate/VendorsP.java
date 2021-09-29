package hibernate;

import java.sql.Date;
import java.util.List;

public class VendorsP 
{
	private int id;
	
	private String name;
	
	private Date date_register;
	
	private Date date_start;
	
	private Address address;

	private List<SpotTypesP> spot_types;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate_register() {
		return date_register;
	}

	public void setDate_register(Date date_register) {
		this.date_register = date_register;
	}

	public Date getDate_start() {
		return date_start;
	}

	public void setDate_start(Date date_start) {
		this.date_start = date_start;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<SpotTypesP> getSpot_types() {
		return spot_types;
	}

	public void setSpot_types(List<SpotTypesP> spot_types) {
		this.spot_types = spot_types;
	}
	
	
}

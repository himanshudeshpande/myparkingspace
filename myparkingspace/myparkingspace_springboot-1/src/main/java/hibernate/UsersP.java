package hibernate;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.OneToMany;

public class UsersP 
{
	private int id;

	private Name name;

	private String email;

	private long mobile;

	private String password;

	private List<DocumentsP> documents;

	private List<VehiclesP> vehicles;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<DocumentsP> getDocuments() {
		return documents;
	}

	public void setDocuments(List<DocumentsP> documents) {
		this.documents = documents;
	}

	public List<VehiclesP> getVehicles() {
		return vehicles;
	}

	public void setVehicles(List<VehiclesP> vehicles) {
		this.vehicles = vehicles;
	}
	
	
}

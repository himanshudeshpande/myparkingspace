package hibernate;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name="users")
@Table(name="users")
public class Users 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Embedded
	private Name name;

	@Column(nullable=false, unique=true)
	private String email;

	@Column(nullable=false, unique=true)
	private long mobile;

	@Column(nullable=false)
	private String password;

	@OneToMany(mappedBy="user")
	private List<Documents> documents;

	@OneToMany(mappedBy="user")
	private List<Vehicles> vehicles;

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

	public List<Documents> getDocuments() {
		return documents;
	}

	public List<Vehicles> getVehicles() {
		return vehicles;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + ", email=" + email + ", mobile=" + mobile + ", password="
				+ password + ", documents=" + documents + ", vehicles=" + vehicles + "]";
	}
	
	public UsersP toPOJO()
	{
		UsersP u = new UsersP();
		List<DocumentsP> dp = new ArrayList();
		for(Documents document:documents)
		{
			dp.add(document.toPOJO());
		}
		u.setDocuments(dp);
		u.setEmail(email);
		u.setId(id);
		u.setMobile(mobile);
		u.setName(name);
		u.setPassword(password);
		List<VehiclesP> vp = new ArrayList();
		for(Vehicles vehicle:vehicles)
		{
			vp.add(vehicle.toPOJO());
		}
		u.setVehicles(vp);
		return u;
	}
}

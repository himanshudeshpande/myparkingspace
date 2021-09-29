package hibernate;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity(name="vendors")
@Table(name="vendors")
public class Vendors 
{
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY) 
	private int id;
	
	@Column(nullable=false)
	private String name;
	
	@Column(nullable=false)
	private Date date_register;
	
	private Date date_start;
	
	@Embedded
	private Address address;

	@ManyToMany
	private List<Categories> categories;
	
	@OneToMany(mappedBy="vendor")
	private List<SpotTypes> spot_types;

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

	public List<Categories> getCategories() {
		return categories;
	}
	
	public void setCategories(List<Categories> categories) {
		this.categories = categories;
	}

	public void addCategories(Categories value)
	{
		if(this.categories==null)
		{
			this.categories = new ArrayList();
		}
		this.categories.add(value);
	}

	public List<SpotTypes> getSpot_types() {
		return spot_types;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Vendors [id=" + id + ", name=" + name + ", date_register=" + date_register + ", date_start="
				+ date_start + ", address=" + address + ", categories=" + categories + ", spot_types=" + spot_types
				+ "]";
	}
	
	public VendorsP toPOJO()
	{
		VendorsP v = new VendorsP();
		v.setAddress(address);
		v.setDate_register(date_register);
		v.setDate_start(date_start);
		v.setId(id);
		v.setName(name);
		List<SpotTypesP> st = new ArrayList();
		for(SpotTypes s:this.spot_types)
		{
			st.add(s.toPOJO());
		}
		v.setSpot_types(st);
		return v;
	}
	
}

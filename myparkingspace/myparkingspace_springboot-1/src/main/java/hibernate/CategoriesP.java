package hibernate;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.ManyToMany;

public class CategoriesP 
{
	private int id;
	
	private String category;
	
	private List<VendorsP> vendors;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public List<VendorsP> getVendors() {
		return vendors;
	}

	public void setVendors(List<VendorsP> vendors) {
		this.vendors = vendors;
	}
	
	
}

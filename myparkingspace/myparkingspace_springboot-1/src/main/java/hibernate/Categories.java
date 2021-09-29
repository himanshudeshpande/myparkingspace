package hibernate;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity(name="categories")
@Table(name="categories")
public class Categories 
{

	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY) 
	private int id;
	
	@Column(nullable=false,unique=true)
	private String category;
	
	
	@ManyToMany(mappedBy="categories")
	private List<Vendors> vendors;


	public String getCategory() 
	{
		return category;
	}


	public void setCategory(String category) {
		this.category = category;
	}


	public List<Vendors> getVendors() {
		return vendors;
	}

	public int getId() {
		return id;
	}


	@Override
	public String toString() {
		return "Categories [id=" + id + ", category=" + category + ", vendors=" + vendors + "]";
	}
	
	
	public CategoriesP toPOJO()
	{
		CategoriesP c = new CategoriesP();
		c.setCategory(category);
		c.setId(id);
		List<VendorsP> vp = new ArrayList();
		for(Vendors v:vendors)
		{
			vp.add(v.toPOJO());
		}
		c.setVendors(vp);
		return c;
	}
}

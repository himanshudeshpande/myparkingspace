package microservices;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import hibernate.Categories;
import hibernate.Vendors;

public class DBVendor 
{
	public boolean createVendor(Session s, Vendors ven, List<Categories> categories)
	{
		Transaction t = s.beginTransaction();
		try
		{
			ven.setCategories(categories);
			s.save(ven);
			t.commit();
			return true;
		}
		catch(Exception e)
		{
			t.rollback();
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean updateVendor(Session s, Vendors ven)
	{
		Transaction t = s.beginTransaction();
		try
		{
			s.update(ven);
			t.commit();
			return true;
		}
		catch(Exception e)
		{
			t.commit();
			e.printStackTrace();
		}
		return false;
	}
	
	public Vendors readVendorById(Session s, int id)
	{
		Transaction t = s.beginTransaction();
		try
		{
			Query query=s.createQuery("from vendors as a where a.id=:c");
			query.setParameter("c", id);
			List<Vendors> list = query.list();
				for(Vendors vendor:list)
				{
					t.commit();
					return vendor;
				}
			t.commit();
			return null; 
		}
		catch(Exception e)
		{
			t.commit();
			e.printStackTrace();
		}
		return null;
		
	}
	
	public Vendors readVendorByName(Session s, String name)
	{
		Transaction t = s.beginTransaction();
		try
		{	
			Query query=s.createQuery("from vendors as a where a.name=:c");
			query.setParameter("c", name);
			List<Vendors> list = query.list();
			if(list!=null)
			{
				for(Vendors vendor:list)
				{
					t.commit();
					return vendor;
				}
			}
			t.commit();
			return null; 
		}
		catch(Exception e)
		{
			t.commit();
			e.printStackTrace();
		}
		return null;
		
	}
	
	public List<Vendors> readAllVendors(Session s)
	{
		Transaction t = s.beginTransaction();
		try
		{
			Query query=s.createQuery("from vendors");
			List<Vendors> list = query.list();
			t.commit();
			return list; 
		}
		catch(Exception e)
		{
			t.commit();
			e.printStackTrace();
		}
		return null;
	}
	
	public List<Vendors> readAllVendorsByCategory(Session s, Categories cat)
	{
		Transaction t = s.beginTransaction();
		try
		{
			Query query=s.createQuery("Select a from vendors as a join a.categories as b where b.category=:c");
			query.setParameter("c", cat.getCategory());
			List<Vendors> list = query.list();
			t.commit();
			return list; 
		}
		catch(Exception e)
		{
			t.commit();
			e.printStackTrace();
		}
		return null;
	}
}

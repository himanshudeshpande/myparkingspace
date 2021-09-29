package microservices;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import hibernate.Categories;

public class DBCategory 
{
	public boolean createCategory(Session s, Categories cat)
	{
		Transaction t = s.beginTransaction();
		try
		{
			s.save(cat);
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
	
	public boolean updateCategory(Session s, Categories cat)
	{
		Transaction t = s.beginTransaction();
		try
		{
			s.update(cat);
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
	
	public List<Categories> readAllCategories(Session s)
	{
		Transaction t = s.beginTransaction();
		try
		{
			Query query=s.createQuery("from categories");
			List<Categories> list = query.list();
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
	
	public Categories readCategoryByCategory(Session s, String category)
	{
		Transaction t = s.beginTransaction();
		try
		{
			Query query=s.createQuery("from categories where category=:c");
			query.setParameter("c", category);
			List<Categories> list = query.list();
			t.commit();
			if(list!=null)
				for(Categories cat: list)
					return cat;
			return null; 
		}
		catch(Exception e)
		{
			t.commit();
			e.printStackTrace();
		}
		return null;
		
	}
	
	public Categories readCategoryById(Session s, int id)
	{
		Transaction t = s.beginTransaction();
		try
		{
			Query query=s.createQuery("from categories where id=:c");
			query.setParameter("c", id);
			List<Categories> list = query.list();
			t.commit();
			if(list!=null)
				for(Categories cat: list)
					return cat;
			return null; 
		}
		catch(Exception e)
		{
			t.commit();
			e.printStackTrace();
		}
		return null;
		
	}
}

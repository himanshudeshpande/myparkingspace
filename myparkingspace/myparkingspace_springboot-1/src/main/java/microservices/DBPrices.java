package microservices;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import hibernate.*;

public class DBPrices 
{
	public boolean createPrices(Session s, Prices price, SpotTypes spot_type)
	{
		Transaction t = s.beginTransaction();
		try
		{
			price.setSpot_type(spot_type);;
			s.save(price);
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
	
	public Prices readPriceById(Session s, int id)
	{
		Transaction t = s.beginTransaction();
		try
		{
			Query query=s.createQuery("from prices as a where a.id=:c");
			query.setParameter("c", id);
			List<Prices> list = query.list();
			t.commit();
			for(Prices p:list)
			{
				return p;
			}
			return null;
		}
		catch(Exception e)
		{
			t.commit();
			e.printStackTrace();
		}
		return null;
	}
	
	public List<Prices> readPricesBySpotType(Session s, int spot_type_id)
	{
		Transaction t = s.beginTransaction();
		try
		{
			Query query=s.createQuery("from prices as a where a.spot_type.id=:c");
			query.setParameter("c", spot_type_id);
			List<Prices> list = query.list();
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
	
	public List<Prices> readAllPrices(Session s)
	{
		Transaction t = s.beginTransaction();
		try
		{
			Query query=s.createQuery("from prices");
			List<Prices> list = query.list();
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

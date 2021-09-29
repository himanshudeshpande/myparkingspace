package microservices;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import hibernate.*;

public class DBSpotType 
{
	public boolean createSpotType(Session s, SpotTypes spot_type, Vendors vendor)
	{
		Transaction t = s.beginTransaction();
		try
		{
			spot_type.setVendor(vendor);
			s.save(spot_type);
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
	
	public SpotTypes readSpotTypeById(Session s, int id)
	{
		Transaction t = s.beginTransaction();
		try
		{
			Query query=s.createQuery("from spot_types as a where a.id=:c");
			query.setParameter("c", id);
			List<SpotTypes> list = query.list();
			t.commit();
			for(SpotTypes p:list)
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
	
	public List<SpotTypes> readSpotTypesByVendorId(Session s, int vendor_id)
	{
		Transaction t = s.beginTransaction();
		try
		{
			Query query=s.createQuery("from spot_types as a where a.vendor.id=:c");
			query.setParameter("c", vendor_id);
			List<SpotTypes> list = query.list();
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
	
	public List<SpotTypes> readAllSpotTypes(Session s)
	{
		Transaction t = s.beginTransaction();
		try
		{
			Query query=s.createQuery("from spot_types");
			List<SpotTypes> list = query.list();
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

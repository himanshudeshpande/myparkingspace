package microservices;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import hibernate.*;

public class DBVehicle 
{
	public boolean createVehicle(Session s, Vehicles vehicle, Users user)
	{
		Transaction t = s.beginTransaction();
		try
		{
			vehicle.setUser(user);
			s.save(vehicle);
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
	
	public Vehicles readVehicleById(Session s, int id)
	{
		Transaction t = s.beginTransaction();
		try
		{
			Query query=s.createQuery("from user_vehicles as a where a.id=:c");
			query.setParameter("c", id);
			List<Vehicles> list = query.list();
			t.commit();
			for(Vehicles p:list)
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
	
	public List<Vehicles> readVehicleByUserId(Session s, int user_id)
	{
		Transaction t = s.beginTransaction();
		try
		{
			Query query=s.createQuery("from user_vehicles as a where a.user.id=:c");
			query.setParameter("c", user_id);
			List<Vehicles> list = query.list();
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
	
	public List<Vehicles> readAllVehicle(Session s)
	{
		Transaction t = s.beginTransaction();
		try
		{
			Query query=s.createQuery("from user_vehicles");
			List<Vehicles> list = query.list();
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

package microservices;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import hibernate.Prices;
import hibernate.*;

public class DBBookings 
{
	public boolean createBooking(Session s, Bookings booking, SpotTypes spot_type, Vehicles vehicle, Payments payment)
	{
		Transaction t = s.beginTransaction();
		try
		{
			booking.setSpot_types(spot_type);
			booking.setPayment(payment);
			booking.setVehicle(vehicle);
			s.save(booking);
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
	
	public boolean updateBooking(Session s, Bookings booking)
	{
		Transaction t = s.beginTransaction();
		try
		{
			s.update(booking);
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
	
	public boolean deleteBooking(Session s, Bookings booking)
	{
		if(booking.getPayment()!=null)
		{
			DBPayments dbp = new DBPayments();
			Payments p = dbp.readPaymentById(s, booking.getPayment().getId());
			booking.setPayment(null);
			updateBooking(s,booking);
			p.setBooking(null);
			dbp.updatePayment(s, p);
			dbp.deletePayment(s, p);
		}
		Transaction t = s.beginTransaction();
		try
		{
			s.delete(booking);
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
	
	public Bookings readBookingById(Session s, int id)
	{
		Transaction t = s.beginTransaction();
		try
		{
			Query query=s.createQuery("from bookings as a where a.id=:c");
			query.setParameter("c", id);
			List<Bookings> list = query.list();
			t.commit();
			for(Bookings p:list)
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
	
	public List<Bookings> readBookingsByVehicleId(Session s, int vehicle_id)
	{
		Transaction t = s.beginTransaction();
		try
		{
			Query query=s.createQuery("from bookings as a where a.vehicle.id=:c");
			query.setParameter("c", vehicle_id);
			List<Bookings> list = query.list();
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

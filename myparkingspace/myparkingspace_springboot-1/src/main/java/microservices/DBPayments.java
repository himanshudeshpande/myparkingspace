package microservices;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import hibernate.*;

public class DBPayments 
{
	public boolean createPayment(Session s, Bookings booking, Payments payment)
	{
		Transaction t = s.beginTransaction();
		try
		{
			payment.setBooking(booking);
			s.save(payment);
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
	
	public boolean updatePayment(Session s, Payments payment)
	{
		Transaction t = s.beginTransaction();
		try
		{
			s.update(payment);
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
	
	public boolean deletePayment(Session s, Payments payment)
	{
		if(payment.getBooking()==null)
		{
			Transaction t = s.beginTransaction();
			try
			{
				s.delete(payment);
				t.commit();
				return true;
			}
			catch(Exception e)
			{
				t.commit();
				e.printStackTrace();
			}
		}
		
		return false;
	}
	
	public Payments readPaymentById(Session s, int id)
	{
		Transaction t = s.beginTransaction();
		try
		{
			Query query=s.createQuery("from payments as a where a.id=:c");
			query.setParameter("c", id);
			List<Payments> list = query.list();
			t.commit();
			for(Payments p:list)
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
}

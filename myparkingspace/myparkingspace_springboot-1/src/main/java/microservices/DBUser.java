package microservices;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import hibernate.Users;

public class DBUser 
{
	public boolean createUser(Session s, Users user)
	{
		Transaction t = s.beginTransaction();
		try
		{
			s.save(user);
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
	
	public boolean updateUser(Session s, Users user)
	{
		Transaction t = s.beginTransaction();
		try
		{
			s.update(user);
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
	
	public Users readUser(Session s, int id)
	{
		Transaction t = s.beginTransaction();
		try
		{
			Query query=s.createQuery("from users as a where a.id=:e");
			query.setParameter("e", id);
			List<Users> list = query.list();
			Users user_res = null;
			for(Users user: list)
			{
				user_res = user;
			}
			t.commit();
			return user_res; 
		}
		catch(Exception e)
		{
			t.commit();
			e.printStackTrace();
		}
		return null;
	}
	
	public Users readUser(Session s, String email)
	{
		Transaction t = s.beginTransaction();
		try
		{
			Query query=s.createQuery("from users as a where a.email=:e");
			query.setParameter("e", email);
			List<Users> list = query.list();
			Users user_res = null;
			for(Users user: list)
			{
				user_res = user;
			}
			t.commit();
			return user_res; 
		}
		catch(Exception e)
		{
			t.commit();
			e.printStackTrace();
		}
		return null;
	}
	
	public List<Users> getAllUsers(Session s)
	{
		Transaction t = s.beginTransaction();
		try
		{
			Query query=s.createQuery("from users");
			List<Users> list = query.list();
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
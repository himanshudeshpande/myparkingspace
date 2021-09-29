package microservices;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class CreateSession 
{
	private Session s;
	
	public CreateSession()
	{
		s = null;
	}
	
	public Session getSession()
	{
		if(s==null)
		{
			StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure().build();
			Metadata m=new MetadataSources(ssr).getMetadataBuilder().build();
			SessionFactory sf=m.getSessionFactoryBuilder().build();
			s=sf.openSession();
		}	
		return s;
	}
	
	public void closeSession()
	{
		if(s!=null)
		{
			s.close();
			s=null;
		}
	}
}

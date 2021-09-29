package model;

public class UserId 
{
	private String id;

	public int getId() 
	{
		try
		{
			return Integer.parseInt(id);
		}
		catch(Exception e)
		{
			return 0;
		}
	}

	public void setId(String id) 
	{
		this.id = id;
	}
}
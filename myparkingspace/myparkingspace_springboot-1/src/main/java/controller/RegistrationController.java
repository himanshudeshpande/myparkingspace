package controller;

import java.sql.Date;
import java.util.Calendar;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hibernate.Users;
import hibernate.Vendors;
import microservices.CreateSession;
import microservices.DBUser;
import microservices.DBVendor;
import model.UserRegistrationDetails;
import model.VendorRegistrationDetails;

@CrossOrigin
@RestController
@RequestMapping("/registration")
public class RegistrationController 
{
	@PostMapping("/userregistration")
	public int registerUser(@RequestBody UserRegistrationDetails det)
	{
		DBUser cu = new DBUser();
		CreateSession cs = new CreateSession();
		boolean res = cu.createUser(cs.getSession(), det.toUsers());
		if(!res)
		{
			cs.closeSession();
			return -2;
		}
		else
		{
			DBUser ru = new DBUser();
			Users user = ru.readUser(cs.getSession(), det.getEmail());
			if(user!=null)
			{
				cs.closeSession();
				return user.getId();
			}
			else
			{
				cs.closeSession();
				return -1;
			}
		}
	}
	
	@PostMapping("/dealerregistration")
	public boolean registerDealer(@RequestBody VendorRegistrationDetails det)
	{
		System.out.println(det);
		Vendors d = det.toDealers();
		d.setDate_register(new Date(Calendar.getInstance().getTimeInMillis()));
		DBVendor du = new DBVendor();
		CreateSession cs = new CreateSession();
		boolean res = du.createVendor(cs.getSession(), d, null);
		cs.closeSession();
		return res;
	}
}

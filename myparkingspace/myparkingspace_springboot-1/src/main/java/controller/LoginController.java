package controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import hibernate.Users;
import microservices.CreateSession;
import microservices.DBUser;
import model.LoginCredentials;
 
@CrossOrigin
@RestController
@RequestMapping("/login")
public class LoginController 
{
	@PostMapping("/verify")
	public String getUserId(@RequestBody LoginCredentials cred)
	{
		CreateSession cs = new CreateSession();
		DBUser ru = new DBUser();
		Users user_res = ru.readUser(cs.getSession(), cred.getEmail());
		if(user_res!=null)
			if(user_res.getPassword().equals(cred.getPassword()))
				return new Gson().toJson(user_res.toPOJO());
			else
				return "0";
		else
			return "-1";
	}
}
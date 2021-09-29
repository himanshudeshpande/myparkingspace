package controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import hibernate.Categories;
import hibernate.CategoriesP;
import hibernate.Vendors;
import hibernate.VendorsP;
import microservices.CreateSession;
import microservices.DBCategory;
import microservices.DBVendor;

@CrossOrigin
@RestController
@RequestMapping("/get")
public class GetData 
{
	@PostMapping("/categories")
	public String getAllCategories()
	{
		CreateSession cs = new CreateSession();
		DBCategory ru = new DBCategory();
		cs.getSession();
		String json_string = "";
		List<Categories> cats = ru.readAllCategories(cs.getSession());
		List<CategoriesP> catsp = new ArrayList();
		for(Categories cat: cats)
		{
			catsp.add(cat.toPOJO());
		}
		json_string = new Gson().toJson(catsp);
		cs.closeSession();
		return json_string;
	}
	
	@PostMapping("/vendors")
	public String getAllVendors()
	{
		CreateSession cs = new CreateSession();
		DBVendor ru = new DBVendor();
		cs.getSession();
		String json_string = "";
		List<Vendors> cats = ru.readAllVendors(cs.getSession());
		List<VendorsP> catsp = new ArrayList();
		for(Vendors cat: cats)
		{
			catsp.add(cat.toPOJO());
		}
		json_string = new Gson().toJson(catsp);
		cs.closeSession();
		return json_string;
	}
	
	@GetMapping("/vendorcategories")
	public String getAllVCategories()
	{
		CreateSession cs = new CreateSession();
		DBVendor ru = new DBVendor();
		cs.getSession();
		String json_string = "";
//		String json_string = ru.readAllCategories(cs.getSession()).toString();
		List<Vendors> vens = ru.readAllVendors(cs.getSession());
		
		for(Vendors ven: vens)
		{
			List<Categories> cats = ven.getCategories();
			for(Categories cat: cats)
			{
				json_string += cat.getCategory()+" || ";
			}
		}
		cs.closeSession();
		return json_string;
//		return "Hello World";
	}
}

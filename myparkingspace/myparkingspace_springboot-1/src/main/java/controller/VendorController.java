package controller;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import hibernate.Vendors;
import hibernate.VendorsP;
import microservices.CreateSession;
import microservices.DBCategory;
import microservices.DBVendor;
import model.AddCategory;
import model.VendorId;

@CrossOrigin
@RestController
@RequestMapping("/vendorcont")
public class VendorController 
{
	@PostMapping("/verifyVendor")
	public boolean verifyVendor(@RequestBody VendorId d_id)
	{
		CreateSession cs = new CreateSession();
		DBVendor du = new DBVendor();
		Vendors vendor = du.readVendorById(cs.getSession(), d_id.getId());
		vendor.setDate_start(new Date(Calendar.getInstance().getTimeInMillis()));
		boolean ret = du.updateVendor(cs.getSession(), vendor);
		cs.closeSession();
		return ret;
	}
	
	@PostMapping("/deleteDealer")
	public boolean deleteDealer(@RequestBody VendorId d_id)
	{
//		CreateSession cs = new CreateSession();
//		DBVendor du = new DBVendor();
//		Vendors dealer = du.readVendorById(cs.getSession(), d_id.getId());
//		dealer(new Date(Calendar.getInstance().getTimeInMillis()));
//		boolean ret = du.
//		cs.closeSession();
		return false;
	}
	
	@PostMapping("/updateVendor")
	public boolean updateVendor(@RequestBody AddCategory d_id)
	{
		CreateSession cs = new CreateSession();
		DBVendor du = new DBVendor();
		Vendors vendor = du.readVendorById(cs.getSession(), d_id.getD_id());
		DBCategory dbc = new DBCategory();
		vendor.addCategories(dbc.readCategoryById(cs.getSession(), d_id.getB_id()));
		boolean ret = du.updateVendor(cs.getSession(), vendor);
		cs.closeSession();
		return ret;
	}
	
	@PostMapping("/getVendor")
	public String updateVendor(@RequestBody VendorId d_id)
	{
		System.out.println(d_id.getId());
		CreateSession cs = new CreateSession();
		DBVendor du = new DBVendor();
		Vendors vendor = du.readVendorById(cs.getSession(), d_id.getId());
		String json_string = new Gson().toJson(vendor.toPOJO());
		cs.closeSession();
		System.out.println(json_string);
		return json_string;
	}
	
}

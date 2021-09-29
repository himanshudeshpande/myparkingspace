package controller;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;

import hibernate.*;
import microservices.*;
import model.*;

@CrossOrigin
@RestController
@RequestMapping("/user")
public class GetUserData 
{
	//http://localhost:8081/user/getProfile
	//http://localhost:3000
	
	@PostMapping("/book")
	public boolean book(@RequestBody Book b)
	{
		System.out.println(b);
		Time begin_time = new Time(b.getBegin_time().getTimeInMillis());
		Time end_time = new Time(b.getEnd_time().getTimeInMillis());
		Bookings book =new Bookings();
		Payments pay = new Payments();
		
		book.setDate(new Date(b.getBegin_time().getTimeInMillis()));
		book.setStart_time(new Time(b.getBegin_time().getTimeInMillis()));
		book.setEnd_time(new Time(b.getEnd_time().getTimeInMillis()));
		book.setTime_in(new Time(b.getBegin_time().getTimeInMillis()));
		book.setTime_out(new Time(b.getEnd_time().getTimeInMillis()));
		book.setType("future");
		
		CreateSession cs = new CreateSession();
		DBVehicle dbv = new DBVehicle();
		Vehicles vehicle = new Vehicles();
		vehicle = dbv.readVehicleById(cs.getSession(), b.getVehicle_id());
		
		book.setVehicle(vehicle);
		DBSpotType dbst = new DBSpotType();
		SpotTypes st = dbst.readSpotTypeById(cs.getSession(), b.getSpot_type_id());
		
		
		book.setSpot_types(st);
		pay.setOvertime_dues(0.0);
		pay.setPaid(0);
		pay.setPenalty(0);
		pay.setPrice_booking(20);
		
		DBBookings dbb = new DBBookings();
		dbb.createBooking(cs.getSession(), book, st, vehicle, null);
		
		DBPayments dbp = new DBPayments();
		dbp.createPayment(cs.getSession(), book, pay);
		
		book.setPayment(pay);
		
		dbb.updateBooking(cs.getSession(), book);
		
		cs.closeSession();
		
		return true;
	}
	
	
	@GetMapping("/getProfile/{u_id}")
	public String getProfile1(@PathVariable int u_id)
	{
		CreateSession cs = new CreateSession();
		DBUser ru = new DBUser();
		Users user = ru.readUser(cs.getSession(), u_id);
		String json_string = new Gson().toJson(user.toPOJO());
		cs.closeSession();
		return json_string;
	}
	
	@PostMapping("/getProfile")
	public String getProfile(@RequestBody UserId u_id)
	{
		CreateSession cs = new CreateSession();
		DBUser ru = new DBUser();
		Users user = ru.readUser(cs.getSession(), u_id.getId());
		String json_string = new Gson().toJson(user.toPOJO());
		cs.closeSession();
		return json_string;
	}
	
	@GetMapping("/getVehicles/{u_id}")
	public String getVehicles1(@PathVariable int u_id)
	{
		CreateSession cs = new CreateSession();
		DBVehicle dbv = new DBVehicle();
		List<Vehicles> vehicles = dbv.readVehicleByUserId(cs.getSession(), u_id);
		List<VehiclesP> vehiclesp = new ArrayList();
		for(Vehicles vehicle:vehicles)
		{
			vehiclesp.add(vehicle.toPOJO());
		}
		String json_string = new Gson().toJson(vehiclesp);
		cs.closeSession();
		return json_string;
	}
	
	@PostMapping("/getVehicles")
	public String getVehicles(@RequestBody UserId u_id)
	{
		CreateSession cs = new CreateSession();
		DBVehicle dbv = new DBVehicle();
		List<Vehicles> vehicles = dbv.readVehicleByUserId(cs.getSession(), u_id.getId());
		List<VehiclesP> vehiclesp = new ArrayList();
		for(Vehicles vehicle:vehicles)
		{
			vehiclesp.add(vehicle.toPOJO());
		}
		String json_string = new Gson().toJson(vehiclesp);
		cs.closeSession();
		return json_string;
	}
	
	@GetMapping("/getAllBookings/{v_id}")
	public String getAllBookings1(@PathVariable int v_id)
	{
		CreateSession cs = new CreateSession();
		DBBookings dbv = new DBBookings();
		List<Bookings> bookings = dbv.readBookingsByVehicleId(cs.getSession(), v_id);
		List<BookingsP> bookingsp = new ArrayList();
		for(Bookings booking:bookings)
		{
			bookingsp.add(booking.toPOJO());
		}
		String json_string = new Gson().toJson(bookingsp);
		cs.closeSession();
		return json_string;
	}
	
	@PostMapping("/getAllBookings")
	public String getAllBookings(@RequestBody VehicleId v_id)
	{
		CreateSession cs = new CreateSession();
		DBBookings dbv = new DBBookings();
		List<Bookings> bookings = dbv.readBookingsByVehicleId(cs.getSession(), v_id.getId());
		List<BookingsP> bookingsp = new ArrayList();
		for(Bookings booking:bookings)
		{
			bookingsp.add(booking.toPOJO());
		}
		String json_string = new Gson().toJson(bookingsp);
		cs.closeSession();
		return json_string;
	}
	
	@GetMapping("/getHistory/{v_id}")
	public String getHistory1(@PathVariable int v_id)
	{
		CreateSession cs = new CreateSession();
		DBBookings dbv = new DBBookings();
		List<Bookings> bookings = dbv.readBookingsByVehicleId(cs.getSession(), v_id);
		List<BookingsP> history = new ArrayList();
		for(Bookings b: bookings)
		{
			if(b.getType().equals("past"))
			{
				history.add(b.toPOJO());
			}
		}
 		String json_string = new Gson().toJson(history);
		cs.closeSession();
		return json_string;
	}
	
	@PostMapping("/getHistory")
	public String getHistory(@RequestBody VehicleId v_id)
	{
		CreateSession cs = new CreateSession();
		DBBookings dbv = new DBBookings();
		List<Bookings> bookings = dbv.readBookingsByVehicleId(cs.getSession(), v_id.getId());
		List<BookingsP> history = new ArrayList();
		for(Bookings b: bookings)
		{
			if(b.getType().equals("past"))
			{
				history.add(b.toPOJO());
			}
		}
 		String json_string = new Gson().toJson(history);
		cs.closeSession();
		return json_string;
	}
	
	@GetMapping("/getBookings/{v_id}")
	public String getBookings1(@PathVariable int v_id)
	{
		CreateSession cs = new CreateSession();
		DBBookings dbv = new DBBookings();
		List<Bookings> bookings = dbv.readBookingsByVehicleId(cs.getSession(), v_id);
		List<BookingsP> bookings1 = new ArrayList();
		for(Bookings b: bookings)
		{
			if(b.getType().equals("future"))
			{
				bookings1.add(b.toPOJO());
			}
		}
 		String json_string = new Gson().toJson(bookings1);
		cs.closeSession();
		return json_string;
	}
	
	@PostMapping("/getBookings1")
	public String getBookings(@RequestBody VehicleId v_id)
	{
		CreateSession cs = new CreateSession();
		DBBookings dbv = new DBBookings();
		List<Bookings> bookings = dbv.readBookingsByVehicleId(cs.getSession(), v_id.getId());
		List<BookingsP> bookings1 = new ArrayList();
		for(Bookings b: bookings)
		{
			if(b.getType().equals("future"))
			{
				bookings1.add(b.toPOJO());
			}
		}
 		String json_string = new Gson().toJson(bookings1);
		cs.closeSession();
		return json_string;
	}
	
	@PostMapping("/cancelBooking")
	public boolean getBookings(@RequestBody BookingId b)
	{
		CreateSession cs = new CreateSession();
		DBBookings dbv = new DBBookings();
		Bookings booking = dbv.readBookingById(cs.getSession(),b.getId());
		boolean ret = dbv.deleteBooking(cs.getSession(), booking);
		cs.closeSession();
		return ret;
	}
}